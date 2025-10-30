<#
PowerShell helper to compile Java sources using Java 21 (--release 21).
Usage:
  .\compile.ps1           # compiles Assignment/*.java and places output into out\classes
  .\compile.ps1 -MainClass FullyQualifiedClassName  # compiles and runs the specified main class
#>
param(
    [string] $MainClass = "",
    [string] $SourceDir = "Assignment",
    [string] $OutDir = "out\\classes"
)

function Check-Java {
    try {
        # Prefer JAVA_HOME if set; otherwise rely on PATH
        if ($env:JAVA_HOME -and (Test-Path (Join-Path $env:JAVA_HOME "bin\javac.exe"))) {
            $javacPath = Join-Path $env:JAVA_HOME "bin\javac.exe"
            $javaPath = Join-Path $env:JAVA_HOME "bin\java.exe"
            & $javacPath -version 2>&1 | Out-Null
            & $javaPath -version 2>&1 | Out-Null
        } else {
            & javac -version 2>&1 | Out-Null
            & java -version 2>&1 | Out-Null
        }
        return $true
    } catch {
        return $false
    }
}

if (-not (Test-Path $SourceDir)) {
    Write-Error "Source directory '$SourceDir' not found. Make sure you run this from the repo root where the Assignment folder exists."
    exit 2
}

if (-not (Check-Java)) {
    Write-Host "No 'java'/'javac' found in PATH or not runnable. Please install JDK 21 and ensure java/javac are on PATH or set JAVA_HOME."
    exit 3
}

# Create output directory
New-Item -ItemType Directory -Force -Path $OutDir | Out-Null

# Find java source files
$files = Get-ChildItem -Path $SourceDir -Recurse -Filter *.java | ForEach-Object { $_.FullName }
if ($files.Count -eq 0) {
    Write-Host "No Java source files found under '$SourceDir'."
    exit 0
}

Write-Host "Compiling $($files.Count) Java files to '$OutDir' using --release 21..."
# Determine javac/java executables (prefer JAVA_HOME)
if ($env:JAVA_HOME -and (Test-Path (Join-Path $env:JAVA_HOME "bin\javac.exe"))) {
    $javacExe = Join-Path $env:JAVA_HOME "bin\javac.exe"
    $javaExe = Join-Path $env:JAVA_HOME "bin\java.exe"
} else {
    $javacExe = "javac"
    $javaExe = "java"
}

# Compile with release 21
$javacCmd = @($javacExe, "--release", "21", "-d", $OutDir) + $files
$proc = Start-Process -FilePath $javacCmd[0] -ArgumentList $javacCmd[1..($javacCmd.Length-1)] -NoNewWindow -Wait -PassThru
if ($proc.ExitCode -ne 0) {
    Write-Error "javac failed with exit code $($proc.ExitCode)."
    exit $proc.ExitCode
}

Write-Host "Compilation succeeded. Classes are in: $OutDir"

if ($MainClass -ne "") {
    Write-Host "Running $MainClass..."
    $runCmd = "`"$javaExe`" -cp `"$OutDir`" $MainClass"
    iex $runCmd
}

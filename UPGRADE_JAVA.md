Upgrade Java runtime to latest LTS (Java 21)

Why this file: The automatic Java upgrade tools in this environment require a paid Copilot plan, so I prepared manual steps and a small helper script you can run locally to upgrade to Java 21 and verify the project builds.

Quick summary
- Target runtime: Java 21 (latest LTS as of 2025-10-29)
- Actions you should take locally on your machine:
  1. Install a Java 21 JDK (Temurin/Eclipse Adoptium, Microsoft Build of OpenJDK, Azul, etc.) for Windows.
  2. Set JAVA_HOME to the JDK install directory and add %JAVA_HOME%\bin to your PATH.
  3. Verify with `java -version` and `javac -version`.
  4. Use the included `compile.ps1` to compile the project's Java files with `--release 21`.

Install JDK (Windows)
- Download and install a JDK 21 distribution (choose Temurin/Adoptium, Microsoft Build of OpenJDK, Azul, or Oracle JDK 21). Run the installer.
- After installation, set environment variables (PowerShell example):

  # Set JAVA_HOME for current session
  $env:JAVA_HOME = 'C:\Program Files\Eclipse Adoptium\jdk-21'
  $env:PATH = "$env:JAVA_HOME\\bin;" + $env:PATH

  # To set permanently, use System settings or setx (restart required):
  setx /M JAVA_HOME "C:\Program Files\Eclipse Adoptium\jdk-21"
  setx /M PATH "%JAVA_HOME%\\bin;%PATH%"

Verify installation

  java -version
  javac -version

Compile project sources (PowerShell)
- From the repo root run:

  .\compile.ps1

- The script compiles all .java files under the `Assignment` folder using `javac --release 21` and writes class files to `out\classes`.
- To run a specific main class after compiling:

  .\compile.ps1 -MainClass FullyQualifiedClassName

If you use Maven
- Set the Java version in `pom.xml` properties and update the maven-compiler-plugin configuration to use 21.
  <properties>
    <maven.compiler.source>21</maven.compiler.source>
    <maven.compiler.target>21</maven.compiler.target>
    <maven.compiler.release>21</maven.compiler.release>
  </properties>

- Optionally configure the Maven Toolchains or Toolchain Plugin if you need reproducible builds across different JDKs.

If you use Gradle (Groovy DSL)
- Use the Java toolchain and set languageVersion to 21, for example:

  java {
    toolchain {
      languageVersion = JavaLanguageVersion.of(21)
    }
  }

- Or set sourceCompatibility = 21 and targetCompatibility = 21 (note: toolchains are preferred).

IDE configuration
- In VS Code, open Settings -> Java Configuration, and set the Java runtime path to the JDK 21 installation.
- In IntelliJ, set Project SDK to the installed JDK 21 and update Project language level if needed.

Notes and limitations
- I attempted to use the automated Java upgrade tool, but it requires a paid Copilot plan in this environment; I couldn't run it here. The helper script and this doc let you upgrade locally.
- After you install JDK 21, re-run compilation and tests locally. If you want, share the `java -version` and compiler output and I can help interpret failures.

Next steps I can do for you (pick one):
- If you want, I can add Maven/Gradle config changes if your project uses them (send the build files).
- If you'd like, I can make a PR template or CI job (GitHub Actions) to test builds against JDK 21.


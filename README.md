# Java Practice Workspace

This repository is a personal Java learning and practice workspace covering:

- Core Java basics
- OOP concepts (with notebooks)
- Data Structures & Algorithms (DSA)
- Practice assignments

## Repository Layout

```text
JAVA/
├── Assignment/
│   ├── Fibonacci.java
│   ├── TestArray.java
│   ├── VolMain.java
│   └── VolUsingCommandLine.java
│
├── DSA/
│   ├── Arrays/
│   ├── CyclicSort/
│   ├── LinkedList/
│   ├── MergeSort/
│   ├── Methods/
│   ├── OOPs/
│   ├── Recursions/
│   ├── Stacks/
│   └── Time Complexity/
│
├── Oops Chapters/
│   ├── 0.BackStory.ipynb
│   ├── 1.Basics.ipynb
│   ├── ...
│   └── 19.MultithreadingSynchronization.ipynb
│
├── IJava/
└── README.md
```

## Prerequisites

- Java JDK 17+ installed
- VS Code, IntelliJ, or any Java IDE
- (Optional) Jupyter + IJava kernel for `.ipynb` Java notebooks

Check Java:

```powershell
java -version
javac -version
```

## How to Run Java Files

From the repository root (`JAVA`), compile and run using folder-aware class names.

### Example 1: Assignment

```powershell
javac Assignment/Fibonacci.java
java Assignment.Fibonacci
```

### Example 2: DSA Arrays

```powershell
javac DSA/Arrays/TwoSum.java
java DSA.Arrays.TwoSum
```

> If a file has no `package` declaration, run it from its directory:

```powershell
cd DSA/Arrays
javac TwoSum.java
java TwoSum
```

## Suggested Learning Path

1. `Oops Chapters/1.Basics.ipynb`
2. `Oops Chapters/3.Class.ipynb` to `Oops Chapters/12.Interface.ipynb`
3. `DSA/Arrays/` basics (`BasicArrays.java`, `SearchInArray.java`, `SortArrays.java`)
4. `DSA/LinkedList/` core operations
5. `DSA/Recursions/` and `DSA/MergeSort/`

## Quick Navigation

- Arrays: `DSA/Arrays/`
- Linked List: `DSA/LinkedList/`
- Recursion: `DSA/Recursions/`
- OOP practice code: `DSA/OOPs/`
- OOP notebooks: `Oops Chapters/`
- Assignments: `Assignment/`

## Notes

- This workspace is organized for practice, so file naming and style may vary by topic.
- Some files may depend on package declarations; adjust run commands accordingly.

## Future Improvements

- Add package consistency across folders
- Add problem tags (`easy/medium/hard`) for DSA files
- Add per-topic index files

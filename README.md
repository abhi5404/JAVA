# Java Practice Workspace

This repository is a personal Java practice workspace for:

- Core Java concepts
- OOP learning (with notebooks)
- Data Structures & Algorithms (DSA)
- Small assignment-based programs

## Repository Layout

```text
JAVA/
├── Assignment/
├── DSA/
│   ├── Arrays/
│   ├── CyclicSort/
│   ├── LinkedList/
│   ├── MergeSort/
│   ├── Methods/
│   ├── OOPs/
│   ├── Queues/
│   ├── Recursions/
│   ├── Stacks/
│   └── Time Complexity/
├── Oops Chapters/
├── out/
└── README.md
```

## Prerequisites

- Java JDK 17+
- VS Code / IntelliJ / any Java IDE
- (Optional) Jupyter + Java kernel support for `.ipynb` files

Verify Java installation:

```powershell
java -version
javac -version
```

## Quick Start (Compile and Run)

Use one of the two approaches below depending on whether the file has a `package` declaration.

### 1) If the file has `package ...;`

Run from repository root:

```powershell
javac Assignment/Fibonacci.java
java Assignment.Fibonacci
```

### 2) If the file has no package

Run from the file's folder:

```powershell
cd DSA/Arrays
javac TwoSum.java
java TwoSum
```

## Suggested Learning Path

1. `Oops Chapters/1.Basics.ipynb`
2. `Oops Chapters/3.Class.ipynb` → `Oops Chapters/12.Interface.ipynb`
3. `DSA/Arrays/` basics (`BasicArrays.java`, `SearchInArray.java`, `SortArrays.java`)
4. `DSA/LinkedList/` core operations
5. `DSA/Recursions/` and `DSA/MergeSort/`

## Quick Navigation

- Assignments: `Assignment/`
- Arrays: `DSA/Arrays/`
- Linked List: `DSA/LinkedList/`
- Recursion: `DSA/Recursions/`
- OOP practice code: `DSA/OOPs/`
- OOP notebooks: `Oops Chapters/`

## Notes

- This is a learning-focused repository; naming/style may vary by topic.
- Some programs depend on package declarations, so run commands accordingly.



made by abhi
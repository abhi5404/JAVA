# 📚 Java Learning Repository

> A comprehensive collection of Java programs, from fundamentals to advanced OOP concepts, Data Structures & Algorithms, and practical implementations.

![Java](https://img.shields.io/badge/Java-17+-orange?style=flat&logo=java)
![License](https://img.shields.io/badge/License-MIT-blue.svg)
![Status](https://img.shields.io/badge/Status-Active-success)
![DSA](https://img.shields.io/badge/DSA-50%2B%20Programs-green)
![OOP](https://img.shields.io/badge/OOP-19%20Notebooks-blueviolet)

## 📖 Table of Contents

- [Overview](#overview)
- [Quick Start](#-quick-start)
- [Repository Structure](#repository-structure)
- [Getting Started](#getting-started)
- [Topics Covered](#topics-covered)
  - [OOP Concepts](#oop-concepts)
  - [Data Structures & Algorithms](#data-structures--algorithms)
    - [Arrays](#-arrays)
    - [Linked List](#-linked-list)
    - [Recursion](#-recursion)
    - [Sorting Algorithms](#-sorting-algorithms)
  - [Advanced Topics](#advanced-topics)
- [How to Run Programs](#how-to-run-programs)
- [Learning Path](#learning-path)
- [DSA Cheat Sheet](#-dsa-cheat-sheet)
- [Resources](#resources)
- [Contributing](#contributing)
- [Contact](#contact)

---

## 🎯 Overview

This repository is a complete learning resource for Java programming, containing:

| Category | Content |
|----------|---------|
| 📓 **OOP Notebooks** | 19 Jupyter Notebooks covering fundamentals to advanced concepts |
| 🔢 **Array Programs** | 18+ programs covering searching, sorting, and manipulation |
| 🔗 **Linked List** | Complete implementation with insert/delete operations |
| 🔄 **Recursion** | 15+ programs from basics to advanced problems |
| 🔀 **Sorting** | Merge Sort, Cyclic Sort with practical applications |
| 📝 **Assignments** | Hands-on practice problems |

Perfect for **beginners** starting their Java journey, **intermediate programmers** strengthening their foundation, or anyone **preparing for technical interviews**.

---

## 🏃 Quick Start

| Want to Learn | Start Here |
|---------------|------------|
| Java Basics | [1.Basics.ipynb](Oops%20Chapters/1.Basics.ipynb) |
| OOP Concepts | [3.Class.ipynb](Oops%20Chapters/3.Class.ipynb) |
| Arrays DSA | [DSA/Arrays/BasicArrays.java](DSA/Arrays/BasicArrays.java) |
| Linked List | [DSA/LinkedList/NodeInLL.java](DSA/LinkedList/NodeInLL.java) |
| Recursion | [DSA/Recursions/Factorial.java](DSA/Recursions/Factorial.java) |

---

## 📁 Repository Structure

```
JAVA/
├── 📂 Assignment/                # Practice assignments
│   ├── Fibonacci.java
│   ├── TestArray.java
│   ├── VolMain.java
│   └── VolUsingCommandLine.java
│
├── 📂 DSA/                       # Data Structures & Algorithms
│   │
│   ├── 📁 Arrays/                # Array operations (18+ programs)
│   │   ├── BasicArrays.java
│   │   ├── TwoSum.java
│   │   ├── ReverseArray.java
│   │   ├── RotateArrays.java
│   │   ├── MergeTwoSortedArray.java
│   │   ├── SecondLargest.java
│   │   ├── DuplicateElement.java
│   │   ├── MissingInArray.java
│   │   ├── WaveArray.java
│   │   ├── SortArrays.java
│   │   └── ...
│   │
│   ├── 📁 LinkedList/            # Linked List implementations
│   │   ├── NodeInLL.java         # Node structure
│   │   ├── InsertAtHead.java     # Insert at beginning
│   │   ├── InsertAtTail.java     # Insert at end
│   │   ├── InsertAtIdx.java      # Insert at position
│   │   ├── DeleteAtHead.java     # Delete from beginning
│   │   └── DisplayList.java      # Display linked list
│   │
│   ├── 📁 Recursions/            # Recursion problems (15+ programs)
│   │   ├── Factorial.java
│   │   ├── Fibonacci.java
│   │   ├── BinarySearchUsingRecursion.java
│   │   ├── GCD.java & LCM.java
│   │   ├── PrintSubsets.java
│   │   ├── GenerateParanthesis.java
│   │   ├── NthStairs.java
│   │   ├── TowerOfHanoi.java
│   │   └── ...
│   │
│   ├── 📁 MergeSort/             # Merge Sort & applications
│   │   ├── MergeSort.java
│   │   ├── InversionCount.java
│   │   ├── ReversePair.java
│   │   └── MergeSort.ipynb
│   │
│   ├── 📁 CyclicSort/            # Cyclic Sort algorithm
│   │   └── CyclicSort.java
│   │
│   ├── 📁 OOPs/                  # OOP implementations
│   │   ├── Constructor.java
│   │   ├── Inheritance.java
│   │   ├── Polymorphism.java
│   │   ├── GetterSetter.java
│   │   ├── ComplexNumber.java
│   │   ├── Fraction.java
│   │   └── ...
│   │
│   ├── 📁 Methods/               # Method concepts (7+ programs)
│   │   ├── BuiltInFunc.java
│   │   ├── PermutationAnCombination.java
│   │   ├── SwapTwoNum.java
│   │   └── ...
│   │
│   └── 📁 Time Complexity/       # Algorithm analysis
│
├── 📂 Oops Chapters/             # Complete OOP course (19 notebooks)
│   ├── 0.BackStory.ipynb         # Introduction & Setup
│   ├── 1.Basics.ipynb            # Java Fundamentals
│   ├── 2.ControlFlow.ipynb       # If-else, Loops, Switch
│   ├── 3.Class.ipynb             # Class definition
│   ├── 4.Objects.ipynb           # Object creation
│   ├── 5.Constructor.ipynb       # Constructors
│   ├── 6.Static&Instance.ipynb   # Static vs Instance
│   ├── 7.Inheritance.ipynb       # Inheritance types
│   ├── 8.Super&This_Keyword.ipynb# Keywords
│   ├── 9.Polymorphism.ipynb      # Compile & Runtime
│   ├── 10.Encapsulation.ipynb    # Data hiding
│   ├── 11.Abstraction.ipynb      # Abstract classes
│   ├── 12.Interface.ipynb        # Interfaces
│   ├── 13.Exception_try_catch_throw.ipynb
│   ├── 14.FinalizeMethod.ipynb   # Finalize method
│   ├── 15.throw_throws.ipynb     # Exception handling
│   ├── 16.FileHandling.ipynb     # File I/O
│   ├── 17.Packages.ipynb         # Package structure
│   ├── 18.Threads.ipynb          # Multithreading
│   └── 19.MultithreadingSynchronization.ipynb
│
├── 📂 IJava/                     # Jupyter Java kernel
└── 📄 README.md
```

---

## 🚀 Getting Started

### Prerequisites

- **JDK**: Java Development Kit 17+ (JDK 21 recommended)
- **IDE/Editor**: VS Code, IntelliJ IDEA, Eclipse, or any Java IDE
- **Terminal**: PowerShell (Windows) or Bash (Linux/Mac)
- **Jupyter** (Optional): For running `.ipynb` notebooks

### Installation

1. **Install Java JDK**
   ```powershell
   # Verify Java installation
   java -version
   javac -version
   ```

2. **Set JAVA_HOME** (if not already set)
   ```powershell
   # Windows PowerShell
   setx JAVA_HOME "C:\Program Files\Eclipse Adoptium\jdk-17.0.16.8-hotspot"
   
   # Verify
   echo $env:JAVA_HOME
   ```

3. **Clone or Download this Repository**
   ```bash
   git clone <your-repo-url>
   cd JAVA
   ```

4. **Optional: Install Jupyter with IJava kernel**
   ```bash
   # For running Jupyter notebooks
   pip install jupyter
   # Install IJava kernel from https://github.com/SpencerPark/IJava
   ```

---

## 📚 Topics Covered

### OOP Concepts

#### 1️⃣ **Classes & Objects**
The foundation of OOP - Classes as blueprints, Objects as instances.

```java
class Person {
    String name;
    int age;
    
    void introduce() {
        System.out.println("Hi, I'm " + name + ", " + age + " years old.");
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Alex";
        person.age = 25;
        person.introduce();
    }
}
```

#### 2️⃣ **Encapsulation**
Data hiding and controlled access through getters and setters.

```java
class BankAccount {
    private double balance;
    
    public double getBalance() { 
        return balance; 
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
```

#### 3️⃣ **Inheritance**
Code reusability through parent-child relationships.

```java
class Animal {
    void eat() { 
        System.out.println("This animal eats food."); 
    }
}

class Dog extends Animal {
    void bark() { 
        System.out.println("Woof! Woof!"); 
    }
}
```

#### 4️⃣ **Polymorphism**
One interface, multiple implementations.

**Compile-time Polymorphism (Method Overloading):**
```java
class Calculator {
    int add(int a, int b) { 
        return a + b; 
    }
    
    double add(double a, double b) { 
        return a + b; 
    }
}
```

**Runtime Polymorphism (Method Overriding):**
```java
class Animal { 
    void speak() { 
        System.out.println("Animal speaks"); 
    } 
}

class Cat extends Animal { 
    @Override 
    void speak() { 
        System.out.println("Meow!"); 
    } 
}
```

#### 5️⃣ **Abstraction**
Hiding complexity and showing only essential features.

```java
interface Shape {
    double area();
    double perimeter();
}

class Circle implements Shape {
    private double radius;
    
    public Circle(double radius) { 
        this.radius = radius; 
    }
    
    public double area() { 
        return Math.PI * radius * radius; 
    }
    
    public double perimeter() { 
        return 2 * Math.PI * radius; 
    }
}
```

### Data Structures & Algorithms

#### 📊 Arrays
- ✅ Basic operations (traversal, insertion, deletion)
- ✅ Searching algorithms (Linear, Binary)
- ✅ Sorting algorithms
- ✅ Array manipulation (reverse, rotate, merge)
- ✅ Problem solving (Two Sum, Missing Element, Duplicates)
- ✅ Wave arrays and advanced patterns

#### 🔗 Linked List
- ✅ Node structure implementation
- ✅ Insertion operations (head, tail, index)
- ✅ Deletion operations
- ✅ List traversal and display

```java
// Sample Node Structure
class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
```

#### 🔄 Recursion
- ✅ Factorial and Fibonacci
- ✅ Binary Search using recursion
- ✅ GCD and LCM
- ✅ Tower of Hanoi
- ✅ Generate Parentheses
- ✅ Print Subsets (Power Set)
- ✅ N-th Staircase problem
- ✅ Array operations with recursion

#### 🔀 Sorting Algorithms
- ✅ **Merge Sort** - Divide & Conquer with O(n log n)
- ✅ **Cyclic Sort** - Finding missing/duplicate in range [1, n]
- ✅ **Inversion Count** - Count inversions using merge sort
- ✅ **Reverse Pairs** - LeetCode Hard problem

#### Methods
- ✅ Built-in functions
- ✅ Custom method creation
- ✅ Parameter passing
- ✅ Return types
- ✅ Mathematical operations (Permutation, Combination)

#### Time Complexity
- ✅ Big O Notation
- ✅ Algorithm analysis
- ✅ Performance optimization

### Advanced Topics

- **Exception Handling**: try-catch-finally, throw, throws
- **File Handling**: Reading/Writing files, Stream API
- **Packages**: Code organization and access control
- **Threads**: Multithreading basics
- **Synchronization**: Thread safety and concurrent programming
- **Static & Instance**: Class vs Object members
- **Constructors**: Object initialization patterns
- **Keywords**: super, this, final, static

---

## 💻 How to Run Programs

### Method 1: Command Line (Basic)

```powershell
# Navigate to the file directory
cd "DSA\Arrays"

# Compile
javac BasicArrays.java

# Run
java BasicArrays
```

### Method 2: With Package Structure

```powershell
# From repository root
javac -d out DSA/Arrays/BasicArrays.java

# Run with classpath
java -cp out Arrays.BasicArrays
```

### Method 3: Using VS Code

1. Open the Java file
2. Click the **Run** button (▶️) in the top-right corner
3. Or use `Ctrl + F5` to run without debugging

### Method 4: Running Jupyter Notebooks

```bash
# Start Jupyter
jupyter notebook

# Navigate to "Oops Chapters" folder
# Open any .ipynb file and run cells
```

### Compilation Tips

**For multiple files:**
```powershell
# Compile all Java files in a directory
javac DSA/Arrays/*.java
```

**With specific Java version:**
```powershell
javac --release 17 MyFile.java
```

**Enable preview features:**
```powershell
javac --enable-preview --release 17 MyFile.java
java --enable-preview MyFile
```

---

## 🗺️ Learning Path

### 🌱 Phase 1: Foundations (Week 1-2)
| Day | Topic | Resource |
|-----|-------|----------|
| 1-2 | Java Setup & Basics | [0.BackStory](Oops%20Chapters/0.BackStory.ipynb), [1.Basics](Oops%20Chapters/1.Basics.ipynb) |
| 3-4 | Control Flow | [2.ControlFlow](Oops%20Chapters/2.ControlFlow.ipynb) |
| 5-7 | Basic Arrays | [BasicArrays.java](DSA/Arrays/BasicArrays.java), [Assignment/](Assignment/) |

### 🌿 Phase 2: OOP Mastery (Week 3-5)
| Day | Topic | Resource |
|-----|-------|----------|
| 1-3 | Classes & Objects | [3.Class](Oops%20Chapters/3.Class.ipynb), [4.Objects](Oops%20Chapters/4.Objects.ipynb) |
| 4-5 | Constructors | [5.Constructor](Oops%20Chapters/5.Constructor.ipynb) |
| 6-8 | Inheritance | [7.Inheritance](Oops%20Chapters/7.Inheritance.ipynb) |
| 9-11 | Polymorphism | [9.Polymorphism](Oops%20Chapters/9.Polymorphism.ipynb) |
| 12-14 | Encapsulation & Abstraction | [10.Encapsulation](Oops%20Chapters/10.Encapsulation.ipynb), [11.Abstraction](Oops%20Chapters/11.Abstraction.ipynb) |

### 🌳 Phase 3: DSA Deep Dive (Week 6-10)
| Week | Topic | Programs |
|------|-------|----------|
| 6 | Array Problems | TwoSum, MergeSorted, Rotate, Wave |
| 7 | Recursion | Factorial, Fibonacci, Subsets |
| 8 | Linked List | Insert, Delete, Traverse |
| 9 | Sorting | MergeSort, CyclicSort |
| 10 | Advanced Problems | InversionCount, ReversePairs |

### 🚀 Phase 4: Advanced Java (Week 11-14)
| Week | Topic | Resource |
|------|-------|----------|
| 11 | Exception Handling | [13.Exception](Oops%20Chapters/13.Exception_try_catch_throw.ipynb), [15.throw_throws](Oops%20Chapters/15.throw_throws.ipynb) |
| 12 | File I/O | [16.FileHandling](Oops%20Chapters/16.FileHandling.ipynb) |
| 13 | Multithreading | [18.Threads](Oops%20Chapters/18.Threads.ipynb) |
| 14 | Synchronization | [19.MultithreadingSynchronization](Oops%20Chapters/19.MultithreadingSynchronization.ipynb) |

---

## 📋 DSA Cheat Sheet

### Time Complexity Quick Reference

| Algorithm | Best | Average | Worst | Space |
|-----------|------|---------|-------|-------|
| Linear Search | O(1) | O(n) | O(n) | O(1) |
| Binary Search | O(1) | O(log n) | O(log n) | O(1) |
| Merge Sort | O(n log n) | O(n log n) | O(n log n) | O(n) |
| Cyclic Sort | O(n) | O(n) | O(n) | O(1) |

### Common Patterns

```
🔍 Searching: Linear → Binary → Two Pointers
🔄 Sorting: Bubble → Selection → Merge → Quick
🔗 LinkedList: Traversal → Insert → Delete → Reverse
🔁 Recursion: Base Case → Recursive Call → Combine
```

---

## 📖 Resources

### Official Documentation
- [Oracle Java Documentation](https://docs.oracle.com/en/java/)
- [Oracle Java Tutorials](https://docs.oracle.com/javase/tutorial/)

### Recommended Books
- **"Head First Java"** by Kathy Sierra & Bert Bates
- **"Effective Java"** by Joshua Bloch
- **"Java: The Complete Reference"** by Herbert Schildt
- **"Clean Code"** by Robert C. Martin

### Online Platforms
- [LeetCode](https://leetcode.com/) - Algorithm practice
- [HackerRank](https://www.hackerrank.com/domains/java) - Java challenges
- [GeeksforGeeks](https://www.geeksforgeeks.org/java/) - Tutorials & Problems
- [Baeldung](https://www.baeldung.com/) - In-depth Java guides

### Video Courses
- Java Programming Masterclass (Udemy)
- Java Tutorial for Beginners (freeCodeCamp)
- MIT OpenCourseWare - Introduction to Programming in Java

---

## 🤝 Contributing

Contributions are welcome! Here's how you can help:

1. **Report Issues**: Found a bug? Open an issue
2. **Suggest Improvements**: Have ideas? Start a discussion
3. **Add Examples**: Submit new programs via pull request
4. **Fix Typos**: Documentation improvements are appreciated

### Contribution Guidelines
- Keep code clean and well-commented
- Follow Java naming conventions
- Include example usage for complex programs
- Test your code before submitting
- Update README if adding new sections

---

## 📧 Contact

**Author**: Abhijit  
**Email**: [abhijitamp378@gmail.com](mailto:abhijitamp378@gmail.com)

Feel free to reach out for:
- Questions about the code
- Learning guidance
- Collaboration opportunities
- Feedback and suggestions

---

## 📜 License

This repository is available for educational purposes. Feel free to use, modify, and share the code for learning.

---

## ⭐ Acknowledgments

- Thanks to the Java community for excellent documentation
- Inspired by various online tutorials and courses
- Special thanks to all contributors

---

<div align="center">

### 🎯 Happy Learning! Keep Coding! 🚀

**Star ⭐ this repo if you find it helpful!**

</div>

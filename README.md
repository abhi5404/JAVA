# 📚 Java Learning Repository

> A comprehensive collection of Java programs, from fundamentals to advanced OOP concepts, Data Structures & Algorithms, and practical implementations.

![Java](https://img.shields.io/badge/Java-17+-orange?style=flat&logo=java)
![License](https://img.shields.io/badge/License-MIT-blue.svg)
![Status](https://img.shields.io/badge/Status-Active-success)

## 📖 Table of Contents

- [Overview](#overview)
- [Repository Structure](#repository-structure)
- [Getting Started](#getting-started)
- [Topics Covered](#topics-covered)
  - [OOP Concepts](#oop-concepts)
  - [Data Structures & Algorithms](#data-structures--algorithms)
  - [Advanced Topics](#advanced-topics)
- [How to Run Programs](#how-to-run-programs)
- [Learning Path](#learning-path)
- [Resources](#resources)
- [Contributing](#contributing)
- [Contact](#contact)

---

## 🎯 Overview

This repository is a complete learning resource for Java programming, containing:
- **19 Jupyter Notebooks** covering OOP fundamentals to advanced concepts
- **30+ practical programs** demonstrating DSA implementations
- **Hands-on assignments** for practice
- **Interactive examples** for better understanding

Perfect for beginners starting their Java journey or intermediate programmers looking to strengthen their foundation.

---

## 📁 Repository Structure

```
JAVA/
├── Assignment/              # Practice assignments
│   ├── Fibonacci.java
│   ├── TestArray.java
│   ├── VolMain.java
│   └── VolUsingCommandLine.java
│
├── DSA/                     # Data Structures & Algorithms
│   ├── Arrays/              # Array operations & algorithms
│   │   ├── BasicArrays.java
│   │   ├── TwoSum.java
│   │   ├── ReverseArray.java
│   │   ├── MergeTwoSortedArray.java
│   │   └── ... (20+ programs)
│   │
│   ├── Methods/             # Method concepts & implementations
│   │   ├── BuiltInFunc.java
│   │   ├── PermutationAnCombination.java
│   │   └── ... (7+ programs)
│   │
│   └── Time Complexity/     # Algorithm analysis
│       └── TimeComplexity.ipynb
│
├── Oops Chapters/           # Complete OOP learning path (19 notebooks)
│   ├── 0.BackStory.ipynb
│   ├── 1.Basics.ipynb
│   ├── 2.ControlFlow.ipynb
│   ├── 3.Class.ipynb
│   ├── 4.Objects.ipynb
│   ├── 5.Constructor.ipynb
│   ├── 6.Static&Instance.ipynb
│   ├── 7.Inheritance.ipynb
│   ├── 8.Super&This_Keyword.ipynb
│   ├── 9.Polymorphism.ipynb
│   ├── 10.Encapsulation.ipynb
│   ├── 11.Abstraction.ipynb
│   ├── 12.Interface.ipynb
│   ├── 13.Exception_try_catch_throw.ipynb
│   ├── 14.FinalizeMethod.ipynb
│   ├── 15.throw_throws.ipynb
│   ├── 16.FileHandling.ipynb
│   ├── 17.Packages.ipynb
│   ├── 18.Threads.ipynb
│   └── 19.MultithreadingSynchronization.ipynb
│
├── IJava/                   # Jupyter Java kernel dependencies
└── README.md
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

#### Arrays
- ✅ Basic operations (traversal, insertion, deletion)
- ✅ Searching algorithms (Linear, Binary)
- ✅ Sorting algorithms
- ✅ Array manipulation (reverse, rotate, merge)
- ✅ Problem solving (Two Sum, Missing Element, Duplicates)
- ✅ Wave arrays and advanced patterns

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

### 🌱 Beginner (Weeks 1-2)
1. Start with [0.BackStory.ipynb](Oops%20Chapters/0.BackStory.ipynb)
2. Learn basics: [1.Basics.ipynb](Oops%20Chapters/1.Basics.ipynb)
3. Control flow: [2.ControlFlow.ipynb](Oops%20Chapters/2.ControlFlow.ipynb)
4. Practice with [Assignment/](Assignment/) programs

### 🌿 Intermediate (Weeks 3-6)
1. OOP Fundamentals:
   - [3.Class.ipynb](Oops%20Chapters/3.Class.ipynb)
   - [4.Objects.ipynb](Oops%20Chapters/4.Objects.ipynb)
   - [5.Constructor.ipynb](Oops%20Chapters/5.Constructor.ipynb)
2. Start with [DSA/Arrays/BasicArrays.java](DSA/Arrays/BasicArrays.java)
3. Progress through array problems

### 🌳 Advanced (Weeks 7-12)
1. Advanced OOP:
   - [7.Inheritance.ipynb](Oops%20Chapters/7.Inheritance.ipynb)
   - [9.Polymorphism.ipynb](Oops%20Chapters/9.Polymorphism.ipynb)
   - [10.Encapsulation.ipynb](Oops%20Chapters/10.Encapsulation.ipynb)
   - [11.Abstraction.ipynb](Oops%20Chapters/11.Abstraction.ipynb)
2. Exception handling and File I/O
3. Multithreading concepts

### 🚀 Expert (Ongoing)
1. Master all DSA problems
2. Build projects combining multiple concepts
3. Contribute to open-source Java projects

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

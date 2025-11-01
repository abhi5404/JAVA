# Java OOPs — Guide & Learning Roadmap

Welcome — this `README` is a focused guide for learning Object-Oriented Programming (OOP) in Java and using the code samples in this repository. It lists concepts, short examples, run instructions, exercises, and recommended next steps.

## Table of contents

- Quick start / prerequisites
- How this repo is organized
- Core OOP principles (with short examples)
  - Classes & Objects
  - Encapsulation
  - Inheritance
  - Polymorphism (compile-time & runtime)
  - Abstraction
- Supporting topics (constructors, access modifiers, static, final, interfaces, abstract classes)
- How to compile & run examples (PowerShell / Windows)
- Exercises & practice suggestions
- Recommended resources
- Contributing

---

## Quick start (prerequisites)

- Java Development Kit (JDK) 21 recommended (or any recent LTS). Ensure `java` and `javac` are on PATH or `JAVA_HOME` is set.
- PowerShell (Windows) or your preferred terminal.
- An editor or IDE (VS Code, IntelliJ IDEA, Eclipse).

Check versions in PowerShell:

```powershell
java -version
javac -version
```

If using the included helper script, `compile.ps1` will prefer the JDK from `JAVA_HOME` if it is set.

---

## Repository layout (how examples are organized)

- `Assignment/` — small Java examples used during learning (run with `compile.ps1`).
- `*.ipynb` — notebooks with notes and code snippets (may require a Java kernel to run Java cells).
- `compile.ps1` — helper script updated to prefer `JAVA_HOME` and to compile/run examples using `--release 21`.

Place example files anywhere and follow the "How to compile & run examples" section below.

---

## Core OOP principles (concise explanations + examples)

### 1) Classes & Objects

Definition: A class is a blueprint; an object is an instance of that class.

Example:

```java
class Person {
	String name;
	int age;
}

public class Main {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "Alex";
		p.age = 25;
		System.out.println(p.name + " is " + p.age);
	}
}
```

Edge notes: In Java, classes belong to packages; public classes must be in files named after the class.

### 2) Encapsulation

Definition: Hiding internal state and requiring interaction through methods (getters/setters).

Example:

```java
class Account {
	private double balance;

	public double getBalance() { return balance; }
	public void deposit(double amt) {
		if (amt > 0) balance += amt;
	}
}
```

Best practices: Keep fields private, validate inputs in setters, favor immutability where reasonable.

### 3) Inheritance

Definition: A class (child) can inherit fields and methods from another (parent).

Example:

```java
class Animal {
	void eat() { System.out.println("This animal eats food."); }
}

class Dog extends Animal {
	void bark() { System.out.println("The dog barks."); }
}

// Run Dog.main to see both methods available.
```

Notes: Java supports single inheritance for classes (interfaces allow multiple inheritance of type).

### 4) Polymorphism

Definition: Objects can take many forms. Two main types: compile-time (overloading) and runtime (overriding).

Compile-time example (method overloading):

```java
class Calc {
	int add(int a, int b) { return a + b; }
	double add(double a, double b) { return a + b; }
}
```

Runtime example (method overriding):

```java
class Animal { void speak() { System.out.println("animal"); } }
class Cat extends Animal { @Override void speak() { System.out.println("meow"); } }

Animal a = new Cat();
a.speak(); // prints "meow" (runtime dispatch)
```

### 5) Abstraction

Definition: Exposing only necessary details via interfaces or abstract classes.

Example (interface):

```java
interface Shape { double area(); }
class Circle implements Shape { double r; Circle(double r){this.r=r;} public double area(){return Math.PI*r*r;} }
```

Use abstraction to define contracts and hide implementation details.

---

## Supporting topics (short summary)

- Constructors: special methods for object initialization; default vs parameterized.
- Access modifiers: `public`, `protected`, package-private (default), `private`.
- `static` vs instance: `static` members belong to the class, shared across instances.
- `final`: prevents further modification (variables, methods, classes).
- Interfaces vs Abstract classes: interfaces define contracts (multiple inheritance of type), abstract classes can provide partial implementations.
- Packages and modules: organize code and control accessibility.

Small example showing constructor and access modifiers:

```java
public class User {
	private final String id;
	public String name;

	public User(String id, String name) { this.id = id; this.name = name; }

	public String getId() { return id; }
}
```

---

## How to compile & run examples (Windows PowerShell)

Option A — use `javac` and `java` directly:

1. Save your example as `MyClass.java` (public class must match filename).
2. Compile:

```powershell
javac MyClass.java
```

3. Run:

```powershell
java MyClass
```

Option B — use the included helper `compile.ps1` (recommended for the repo)

From the repository root:

```powershell
# Compile files in Assignment (default)
.\compile.ps1

# Compile arbitrary folder and run a main class (example for Dog)
.\compile.ps1 -SourceDir . -OutDir out\classes -MainClass Dog
```

Notes: `compile.ps1` was updated to prefer `JAVA_HOME`. If you want to ensure JDK 21 is used,
set `JAVA_HOME` to your JDK 21 folder and open a new terminal window.

Set JAVA_HOME (example PowerShell):

```powershell
#set permanently for current user (replace the path with your JDK21 install)
setx JAVA_HOME "C:\Program Files\Eclipse Adoptium\jdk-21.0.x"

#after opening a new terminal, verify
java -version
```

---

## Exercises & practice suggestions

1. Convert the `Animal/Dog` snippet into a package and run it.
2. Create an interface `Playable` and implement it in multiple classes.
3. Build a small bank account system using encapsulation and exception handling.
4. Practice overriding `equals`/`hashCode` and learn when to use them.

Each exercise should include at least one unit test if possible — this practice helps validate behavior as you refactor.

---

## Recommended resources

- Oracle Java Tutorials — the canonical reference for language features.
- "Effective Java" by Joshua Bloch — best practices and design patterns.
- Baeldung and JetBrains Academy articles and tutorials for practical guides.

---

## Contributing

Contributions are welcome. Good additions to this repo include:

- Small examples that demonstrate a single concept clearly.
- Short exercises with solutions and tests.
- Corrections, clarifications, or improved explanations.

Please open an issue or a PR. Keep changes small and focused.

---

## Contact

If you want to reach out: **abhijitamp378@gmail.com**

---

Happy learning and coding! 🎯

package OOPs;

public class ThisKeyword {
    public static void main(String[] args) {
        Person person = new Person("John", 25);
        person.displayInfo();
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


// This keyword is used to refer to the current object instance of a class. It is commonly used in constructors and methods to distinguish between class attributes and parameters with the same name.
// In the constructor above, 'this.name' refers to the class attribute, while 'name' refers to the parameter passed to the constructor.


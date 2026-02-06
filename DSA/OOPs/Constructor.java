package OOPs;

public class Constructor {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 28);
        Person person2 = new Person("Bob", 35);

        person1.displayInfo();
        System.out.println();
        person2.displayInfo();
    }
}

class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

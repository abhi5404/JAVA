package OOPs;

public class Constructor {
    public static void main(String[] args) {
        ConstructorPerson person1 = new ConstructorPerson("Alice", 28);
        ConstructorPerson person2 = new ConstructorPerson("Bob", 35);

        person1.displayInfo();
        System.out.println();
        person2.displayInfo();
    }
}

class ConstructorPerson {
    private String name;
    private int age;

    // Constructor
    public ConstructorPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

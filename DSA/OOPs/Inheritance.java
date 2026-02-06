package OOPs;

public class Inheritance {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20, "Computer Science");
        student.displayInfo();

    }
    
}

class Student {
    private String name;
    private int age;
    private String major;
    
    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Major: " + major);
    }
}

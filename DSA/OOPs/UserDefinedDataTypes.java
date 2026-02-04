package OOPs;

class Student {
    String name;
    int age;
    String grade;
}

public class UserDefinedDataTypes {
    public static void main(String[] args) {
        // Creating an object of the Student class
        Student s1 = new Student();
        s1.name = "Alice";
        s1.age = 20;
        s1.grade = "A";
        
        // Displaying student details
        System.out.println("Student Name: " + s1.name);
        System.out.println("Student Age: " + s1.age);
        System.out.println("Student Grade: " + s1.grade);
        
    }

}

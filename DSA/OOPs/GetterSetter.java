package OOPs;

public class GetterSetter {
   
}

class PersonGS {
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

     public static void main(String[] args) {
        PersonGS person = new PersonGS();
        person.setName("John");
        person.setAge(30);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());  
        System.out.println();
    }
}

//private variables cannot be accessed directly from outside the class. To access and modify these variables, we use getter and setter methods.
//A getter method is used to retrieve the value of a private variable, while a setter method is used to set or update the value of a private variable.
//In the above code, we have a Person class with private variables 'name' and 'age'. We have defined getter and setter methods for both variables, allowing us to access and modify their values from outside the class.
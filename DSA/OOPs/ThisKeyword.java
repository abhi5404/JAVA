package OOPs;

public class ThisKeyword {
    public static void main(String[] args) {
        Person person = new Person("John", 25);
        person.displayInfo();
    }
}


// This keyword is used to refer to the current object instance of a class. It is commonly used in constructors and methods to distinguish between class attributes and parameters with the same name.
// In the constructor above, 'this.name' refers to the class attribute, while 'name' refers to the parameter passed to the constructor.
// The same applies to 'this.age' and 'age'.

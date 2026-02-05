package OOPs;

public class Polymorphism {
    public static class Dog{
        public void sound() {
            System.out.println("Woof");
        }

    }
    public static class Cat{
        public void sound() {
            System.out.println("Meow");
        }
        
    }
    public static class Human{
        public void sound() {
            System.out.println("Hello");
        }
        
    }
    public static class Lion{
        public void sound() {
            System.out.println("Roar");
        }
        
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Human human = new Human();
        Lion lion = new Lion();
        dog.sound();
        cat.sound();
        human.sound();
        lion.sound();
    }
}

// Polymorphism is a fundamental concept in object-oriented programming that allows objects of different classes to be treated as objects of a common superclass. It enables a single interface to represent different underlying forms (data types).

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

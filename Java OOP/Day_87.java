// Day 87 : Inheritance example

// Parent class
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

// Child class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Day_87 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
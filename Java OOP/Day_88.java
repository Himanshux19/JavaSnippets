// Day 88 : Method overriding

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Day_88 {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.sound();
    }
}
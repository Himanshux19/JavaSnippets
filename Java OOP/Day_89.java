// Day 89 : Abstract class vs Interface

interface Flyable {
    void fly();
}

abstract class Animal {
    abstract void sound();

    void eat() {
        System.out.println("Eating...");
    }
}

class Bird extends Animal implements Flyable {

    @Override
    void sound() {
        System.out.println("Bird chirps");
    }

    @Override
    public void fly() {
        System.out.println("Bird can fly");
    }
}

public class Day_89 {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.sound();
        b.eat();
        b.fly();
    }
}
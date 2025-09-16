package org.nexgen.abstraction;

abstract class Animal {
    abstract void sound(); // abstract method

    void sleep() { // concrete method
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound();
        a1.sleep();

        a2.sound();
        a2.sleep();
    }
}
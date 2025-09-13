package org.nexgen.inheritance.multilevel;

class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Mammals can walk.");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // From Animal
        d.walk();  // From Mammal
        d.bark();  // From Dog
    }
}
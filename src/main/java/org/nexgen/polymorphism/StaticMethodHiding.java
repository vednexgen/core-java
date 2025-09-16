package org.nexgen.polymorphism;

class Parent {
    static void display() {
        System.out.println("Parent static method");
    }
}

class Child extends Parent {
    static void display() {  // Method hiding
        System.out.println("Child static method");
    }
}

public class StaticMethodHiding {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.display();  // Calls Parent's static method (hiding, not overriding)

        Child child = new Child();
        child.display();  // Calls Child's static method
    }
}
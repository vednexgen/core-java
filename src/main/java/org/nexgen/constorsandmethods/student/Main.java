package org.nexgen.constorsandmethods.student;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20);
        Student s2 = new Student("Bob", 22);

        s1.display();
        s2.display();
    }
}
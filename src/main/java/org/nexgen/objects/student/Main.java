package org.nexgen.objects.student;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Alice";
        s1.age = 20;

        s2.name = "Bob";
        s2.age = 22;

        s1.display();
        s2.display();
    }
}
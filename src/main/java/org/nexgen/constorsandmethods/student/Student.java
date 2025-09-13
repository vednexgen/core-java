package org.nexgen.constorsandmethods.student;

class Student {
    String name;
    int age;

    // parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
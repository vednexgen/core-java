package org.nexgen.this_and_static.this_keyword;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;  // Refers to instance variable
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Student s1 = new Student("John", 20);
        s1.display();
    }
}
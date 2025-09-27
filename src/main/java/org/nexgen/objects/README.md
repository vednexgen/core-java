# 🚀 Introduction to Classes and Objects in Java

In Java, **classes** and **objects** are the fundamental building blocks of Object-Oriented Programming (OOP).

---

### 📘 Concept

#### 🏷️ Why OOP?
- Organizes code into reusable units
- Models real-world entities (Car, Student, BankAccount)
- Encourages modularity, readability, and reusability
- Java is 100% Object-Oriented (except primitives)

#### 🏷️ What is a Class?

- A **class** is a blueprint for creating objects.
- It defines properties (fields/attributes) and behaviors (methods).
- It does not allocate memory until an object is created.
- 

#### Syntax:

```java
class ClassName {
    // fields
    // methods
}
```

#### 🏷️ What is an Object?

- An **object** is an instance of a class.
- Objects are created using the `new` keyword.
- Each object has its own copy of fields but can share methods defined in the class.
- Objects bring classes to life by allocating memory.
- Multiple objects can be created from the same class

#### Syntax:

```java
ClassName obj = new ClassName();
```

---

### 📝 Program: Defining a Class and Creating an Object

```java
class Car {
    // fields
    String color;
    int speed;

    // method
    void drive() {
        System.out.println("The car is driving at speed: " + speed);
    }
}
```
```java
public class Main {
    public static void main(String[] args) {
        // creating an object of Car
        Car myCar = new Car();

        // setting values
        myCar.color = "Red";
        myCar.speed = 100;

        // calling method
        myCar.drive();
    }
}
```

### 📝 Program: Multiple Objects of Same Class

```java
class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
```
```java
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
```

### 📝 Program: Object Interaction

```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
}
```
```java
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.add(5, 7);
        System.out.println("Sum: " + result);
    }
}
```

---

### 📌 Key Notes

* **Class** = Blueprint, **Object** = Instance.
* Objects are created using `new` keyword.
* A class can have multiple objects.
* Objects can interact with each other through methods.

---

[![](https://img.shields.io/badge/Go_Back-🔙-d6cadd?style=for-the-badge&labelColor=d6cadd)](../../../../../../TABLE_CONTENT_README.md)


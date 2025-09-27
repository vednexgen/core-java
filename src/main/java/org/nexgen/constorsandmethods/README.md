# Constructors and Methods in Java

In Java, **constructors** and **methods** are essential for creating and manipulating objects. Both look similar but serve different purposes.

## 📘 Concept

### 🏷️ What is a Constructor?

* A **constructor** is a special method used to initialize objects.
* It has the **same name as the class**.
* It does **not** have a return type (not even `void`).
* Called automatically when an object is created using `new`.

#### Types of Constructors:

1. **No-argument Constructor** – Defined by the user with no parameters.
2. **Default Constructor** – Provided by Java if no constructor is defined.
3. **Parameterized Constructor** – Accepts parameters to initialize object with custom values.

🔑 Tip:
- if you add a parameterized constructor, Java will not insert the default constructor for you.
- If you want both default and parameterized constructors, you must explicitly declare the default one

---

### 📝 Program: Default Constructor

```java
class Car {
    String color;

    // default constructor
    Car() {
        color = "Black";
    }

    void display() {
        System.out.println("Car color: " + color);
    }
}
```
```java
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.display();
    }
}
```

### 📝 Program: Parameterized Constructor

```java
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
```
```java
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20);
        Student s2 = new Student("Bob", 22);

        s1.display();
        s2.display();
    }
}
```

---

### 🏷️ What is a Method?

* A **method** is a block of code that performs a specific task.
* Defined inside a class.
* Can be called multiple times using objects.

#### Method Syntax:

```
returnType methodName(parameter) {
    // method body
    return value; // if returnType is not void
}
```
---

### 📝 Program: Simple Method

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
        int result = calc.add(10, 5);
        System.out.println("Sum: " + result);
    }
}
```
---

### 🏷️ Key Differences Between Constructor and Method

| Feature     | Constructor                                 | Method                      |
| ----------- | ------------------------------------------- | --------------------------- |
| Name        | Same as class name                          | Any valid identifier        |
| Return Type | No return type (not even void)              | Must have a return type     |
| Call        | Called automatically when object is created | Called explicitly by object |
| Purpose     | Initializes an object                       | Defines object behavior     |

---

### 📌 Key Notes

- **Constructors** are used for object initialization.
- **Methods** are used for defining behaviors.
- Constructors can be **default, no-argument, or parameterized**.
- Methods can be **overloaded** to handle different types of inputs.

---

[![](https://img.shields.io/badge/Go_Back-🔙-d6cadd?style=for-the-badge&labelColor=d6cadd)](../../../../../../course-docs/TABLE_CONTENT_README.md)
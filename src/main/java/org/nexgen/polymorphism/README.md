# 🚀 Polymorphism in Java

## Introduction
Polymorphism is one of the four pillars of Object-Oriented Programming (OOP).
It allows an object to take many forms and enables code flexibility and reusability.

There are **two types of polymorphism** in Java:

1. **Compile-time polymorphism** (Method Overloading or static binding)
2. **Runtime polymorphism** (Method Overriding or dynamic binding)

---

## 1. Compile-Time Polymorphism (Method Overloading or static binding)

### 📘 Concept

- Occurs when multiple methods in the same class have the **same name but different parameter lists** (different number or type of parameters).
- The compiler determines which method to call **at compile time**.
- The compiler decides which method to call based on the method signature (name + parameter list).
  
❌ Cannot overload only by changing return type.

### 📝 Program: Method Overloading

```java
class Calculator {
    // Method with two int parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with three int parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with double parameters
    double add(double a, double b) {
        return a + b;
    }
}

public class OverloadingConcept {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of 2 ints: " + calc.add(5, 10));
        System.out.println("Sum of 3 ints: " + calc.add(1, 2, 3));
        System.out.println("Sum of 2 doubles: " + calc.add(2.5, 3.5));
    }
}
```

---

## 2. Runtime Polymorphism (Method Overriding or dynamic binding)

### 📘 Concept

* Occurs when a **subclass provides a specific implementation** of a method that is already defined in its parent class.
* The method in the subclass must have the **same name, return type, and parameters** as in the parent class.
* The call is resolved **at runtime** using the object type (dynamic dispatch), not the reference type..

### 📝 Program: Method Overriding

```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class OverridingConcept {
    public static void main(String[] args) {
        Animal a1 = new Dog(); // Upcasting
        Animal a2 = new Cat();

        a1.sound(); // Dog barks
        a2.sound(); // Cat meows
    }
}
```

---

#### 🏷️ Static Methods: Overloading vs Hiding

* **Static methods can be overloaded.**
* **Static methods cannot be overridden.** They can only be **hidden** by defining a method with the same signature in the subclass.

### 📝 Program: Static Method Overloading

```java
class MathUtils {
    static int multiply(int a, int b) {
        return a * b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }
}

public class StaticMethodOverloading {
    public static void main(String[] args) {
        System.out.println(MathUtils.multiply(2, 3));       // 6
        System.out.println(MathUtils.multiply(2.5, 3.5));   // 8.75
    }
}
```

### 📝 Program: Static Method Hiding

```java
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
```

---

### 📌 Key Notes

#### 🏷️ Key Differences Between Overloading & Overriding

| Feature              | Method Overloading                     | Method Overriding                        |
| -------------------- | -------------------------------------- | ---------------------------------------- |
| Definition           | Same method name, different parameters | Same method name and parameters          |
| Return Type          | Can be different                       | Must be same (or covariant)              |
| Inheritance Required | No                                     | Yes, requires inheritance                |
| Resolution           | Compile-time                           | Runtime                                  |
| Access Modifiers     | Can be different                       | Cannot reduce visibility                 |
| `static` Methods     | Can be **overloaded**                  | Cannot be overridden (**can be hidden**) |

---
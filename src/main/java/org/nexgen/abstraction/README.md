# 🚀 Abstraction in Java

Abstraction in Java is the process of hiding the implementation details and showing only the **essential features** of an object. It helps in reducing complexity and increasing code reusability.

In Java, abstraction can be achieved in two ways:

1. **Abstract Classes**
2. **Interfaces**

---

## 1. Abstract Classes
### 📘 Concept

* Declared using the `abstract` keyword.
* Can have **abstract methods** (without a body) and **concrete methods** (with implementation).
* Cannot be instantiated directly (you cannot create objects of an abstract class).
* Used when classes share a common structure but may provide different implementations.

---

### 📝 Program: Abstract Class

```java
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
```

---

## 2. Interfaces
### 📘 Concept

* Declared using the `interface` keyword.
* Defines a contract that implementing classes must follow.
* All methods in an interface are **abstract** by default (until Java 8).
* From Java 8 onwards, interfaces can have **default methods** and **static methods**.
  * **_Default methods_** → methods with a body, declared with the default keyword.
  * **_Static methods_** → belong to the interface itself and can be called without an object.
* A class can **implement multiple interfaces** (supports multiple inheritance). 
* Interfaces can contain:
  * Abstract methods (always public).
  * Public static final constants (always).
  * Default methods (since Java 8).
  * Static methods (since Java 8).
  * Private methods (since Java 9).

---

### 📝 Program: Interface

```java
interface Vehicle {
    void start();
    void stop();

    // Default method (Java 8+)
    default void fuel() {
        System.out.println("Vehicle needs fuel");
    }

    // Static method (Java 8+)
    static void service() {
        System.out.println("Vehicle service in progress");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}

public class CustomInterface {
    public static void main(String[] args) {
        Vehicle v1 = new Car();

        v1.start();
        v1.stop();
        v1.fuel(); // calling default method

        Vehicle.service(); // calling static method
    }
}
```

### 📝 Program:Public Static Final Constants in Interfaces
- By default, all variables in interfaces are public, static, and final.
- They act as constants and must be initialized.

```java
interface Config {
    int MAX_USERS = 100; // implicitly public, static, final
    String APP_NAME = "MyJavaApp"; // implicitly public, static, final
}

public class VariablesInInterface {
    public static void main(String[] args) {
        System.out.println("Max Users: " + Config.MAX_USERS);
        System.out.println("App Name: " + Config.APP_NAME);
    }
}

```

---

### 📌 Key Notes

* **Abstraction** hides implementation details and exposes only essential behavior.
* Achieved via **abstract classes** and **interfaces**.
* Use abstract classes when there is a common base but with partial implementation.
* Use interfaces when you want to define a contract that multiple classes can implement.

#### 🏷️ Key Differences Between Abstract Classes and Interfaces

| Feature                  | Abstract Class                       | Interface                                           |
| ------------------------ | ------------------------------------ | --------------------------------------------------- |
| **_Methods_**            | Can have abstract & concrete methods | Only abstract (default/static allowed since Java 8) |
| **Variables**            | Can have instance variables          | Only `public static final` constants                |
| **Multiple Inheritance** | Not supported                        | Supported                                           |
| **Use Case**             | When classes share common behavior   | When classes share only method contracts            |

---

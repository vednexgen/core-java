# 🚀 Encapsulation in Java

## Introduction

Encapsulation in Java is one of the **four pillars of Object-Oriented Programming (OOP)**. It refers to the **bundling of data (fields) and methods (functions)** that operate on the data into a single unit (class), while restricting direct access to some components.

It helps in **data hiding, security, modularity, and maintainability** of code.

---
### 📘 Concept

#### 🏷️ Key Features of Encapsulation
1. **Data Hiding** – By declaring variables as `private`, we prevent direct access from outside the class.
2. **Controlled Access** – We provide `getter` and `setter` methods to control how variables are accessed and modified.
3. **Improved Security** – Sensitive data is protected from unintended interference.
4. **Reusability & Flexibility** – Code can be modified internally without affecting other parts of the program.

---

### 📝 Program: Encapsulation in Java
```java
class Student {
    // Private variables - Data Hiding
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Student s1 = new Student();

        // Setting values via setter methods
        s1.setName("Alice");
        s1.setAge(20);

        // Getting values via getter methods
        System.out.println("Student Name: " + s1.getName());
        System.out.println("Student Age: " + s1.getAge());

        // Trying invalid age
        s1.setAge(-5); // Will show validation message
    }
}
```
---

### 📌 Key Notes
####  Benefits of Encapsulation
- Encapsulation = **Data + Methods bound together in a class**. 
- Protects the integrity of data.
- Provides flexibility (internal implementation can change without affecting outside code).
- Encourages modular design.

---

[![](https://img.shields.io/badge/Go_Back-🔙-d6cadd?style=for-the-badge&labelColor=d6cadd)](../../../../../../TABLE_CONTENT_README.md)

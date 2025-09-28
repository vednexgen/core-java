# 🚀 Java Data Types – Primitive and Non-Primitive

## 📘 Introduction

In Java, data types define the kind of data a variable can hold.  
Java is **statically typed**, so the type of a variable must be declared before use.

Data types are classified into:
- **Primitive Data Types** (8 basic types)
- **Non-Primitive Data Types** (Objects, Strings, Arrays, etc.)

---

## 🏷️ Primitive Data Types

### 📘 Concept

These are the most basic data types built into Java.  
They store simple values directly in memory.

| Data Type | Size   | Default Value  | Example                | Range                           |
|-----------|--------|----------------|------------------------|---------------------------------|
| `byte`    | 1 byte | 0              | `byte b = 100;`        | -128 to 127                     |
| `short`   | 2 bytes| 0              | `short s = 1000;`      | -32,768 to 32,767               |
| `int`     | 4 bytes| 0              | `int x = 50000;`       | -2,147,483,648 to 2,147,483,647 |
| `long`    | 8 bytes| 0L             | `long l = 100000L;`    | -2^63 to 2^63-1                 |
| `float`   | 4 bytes| 0.0f           | `float f = 3.14f;`     | 7 decimal digits precision      |
| `double`  | 8 bytes| 0.0d           | `double d = 3.14159;`  | 15 decimal digits precision     |
| `char`    | 2 bytes| `'\u0000'`     | `char c = 'A';`        | Unicode characters              |
| `boolean` | 1 bit  | false          | `boolean flag = true;` | true or false                   |

---

### 📝 Program

```java
public class PrimitiveTypes {
    public static void main(String[] args) {
        byte b = 100;
        short s = 1000;
        int i = 50000;
        long l = 100000000L;
        float f = 3.14f;
        double d = 3.14159;
        char c = 'A';
        boolean flag = true;

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + flag);
    }
}
```

---

## 🏷️ Java Non-Primitive (Reference) Data Types  

### 📘 Concept

---
In Java, **non-primitive data types** (also called **reference types**) do not store the actual value directly.  
Instead, they store a **reference (memory address)** pointing to the object in the heap memory.

Unlike primitives, reference types are more powerful because they can:
- Represent complex objects.
- Contain multiple values (e.g., arrays).
- Have methods and properties.

---

### 📝 Program

#### String
- A sequence of characters.
- Immutable (cannot be changed once created).
- Comes with many built-in methods.

```java
public class NonPrimitiveTypes {
    public static void main(String[] args) {
        String greeting = "Hello, Java!";
        System.out.println(greeting);

        // String methods
        System.out.println("Length: " + greeting.length());
        System.out.println("Uppercase: " + greeting.toUpperCase());
        System.out.println("Substring: " + greeting.substring(0, 5));
    }
}
```

---

### 📌 Key Notes 

#### Java Syntax Rules
- Case-sensitive language
- Class name should start with a capital letter
- File name = Class name (public class)
- Each statement ends with ;
- Code blocks enclosed in { }

---

[![](https://img.shields.io/badge/Go_Back-🔙-d6cadd?style=for-the-badge&labelColor=d6cadd)](../../../../../../TABLE_CONTENT_README.md)


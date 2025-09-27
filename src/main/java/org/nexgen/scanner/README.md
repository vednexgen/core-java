# 🚀 Scanner Class: Taking User Input in Java

## 1. Introduction

In Java, the `Scanner` class (from `java.util` package) is used to read **user input** from various sources, most commonly from the **console**.

Why Take User Input?
- Hardcoding values isn’t flexible.
- Real-world apps need data from users.
- Example: ATM asks for PIN, Quiz asks for answers

---

### 📘 Concept

#### 🏷️ Importing Scanner Class

Before using the Scanner class, it must be **imported**:

```java
import java.util.Scanner;
```

#### 🏷️ Creating a Scanner Object

To read input from the console:

```java
Scanner scanner = new Scanner(System.in);
```

* `System.in` represents the **standard input stream** (keyboard).
* `scanner` is the object used to call input methods.
 
#### 🏷️ Reading Different Types of Input

The Scanner class provides various methods to read different types of input:

| Method          | Description                      |
| --------------- | -------------------------------- |
| `nextInt()`     | Reads an integer (`int`)         |
| `nextDouble()`  | Reads a double (`double`)        |
| `nextLine()`    | Reads a line of text (`String`)  |
| `next()`        | Reads a single word (`String`)   |
| `nextBoolean()` | Reads a boolean (`true`/`false`) |
| `nextFloat()`   | Reads a float (`float`)          |
| `nextLong()`    | Reads a long (`long`)            |

---

### 📝 Program: Reading an Integer

```java
import java.util.Scanner;

public class ReadInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Your age is: " + age);
    }
}
```
---

### 📝 Program: Reading a String

```java
import java.util.Scanner;

public class ReadString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "!");
    }
}
```

---

### 📝 Program Reading Multiple Inputs

```java
import java.util.Scanner;

public class ReadMultipleInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
```

---

### 📝 Program: Using `next()` vs `nextLine()`

```java
import java.util.Scanner;

public class ScannerNextVsNextLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.next();  // reads single word

        scanner.nextLine(); // consume leftover newline

        System.out.print("Enter your full address: ");
        String address = scanner.nextLine(); // reads entire line

        System.out.println("First Name: " + firstName);
        System.out.println("Address: " + address);
    }
}
```
---

### 📌 Key Notes

- Always \*\*import \*\*\`\` before using Scanner.
- You can use `nextLine()` to read full lines, `next()` for single words.
- Be careful when mixing `nextLine()` with other `nextX()` methods — sometimes you need to **consume leftover newline**.
- Close the scanner after use to avoid resource leaks:

      scanner.close();


---

### ✨ Summary

* The Scanner class allows you to **take input from the user** via console.
* Supports multiple data types: `int`, `double`, `String`, `boolean`, etc.
* Essential for interactive programs, assignments, and console-based applications.

---

[![](https://img.shields.io/badge/Go_Back-🔙-d6cadd?style=for-the-badge&labelColor=d6cadd)](../../../../../../README.md)


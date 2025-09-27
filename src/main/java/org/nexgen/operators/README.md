# 🚀 Operators in Java

---
## 🏷️ Arithmetic Operators

### 📘 Concept

Arithmetic operators are used to perform **basic mathematical operations** in Java.  
They work with numeric data types (`int`, `double`, `float`, `long`, etc.).

| Operator | Description         | Example (`a=10, b=3`) | Result |
|----------|---------------------|-----------------------|--------|
| `+`      | Addition            | `a + b`               | 13     |
| `-`      | Subtraction         | `a - b`               | 7      |
| `*`      | Multiplication      | `a * b`               | 30     |
| `/`      | Division (quotient) | `a / b`               | 3      |
| `%`      | Modulus (remainder) | `a % b`               | 1      |

---

### 📝 Program

```java
public class ArithmeticOperations {
  public static void main(String[] args) {

    int a = 10, b = 3;

    System.out.println("Addition of l + m = " + (a + b));
    System.out.println("Substraction of l - m = " + (a - b));
    System.out.println("Multiplication of l * m = " + (a * b));
    System.out.println("Division (quotient) of l / m = " + (a / b));
    System.out.println("Modulus (remainder) of l % m = " + (a % b));


    // Division with double
    double x = 10, y = 3;
    System.out.println("Division with double, x / y = " + (x / y));

    // Using Arithmetic in Expressions
    int l = 5, m = 10, n = 2;
    int result = (l + m) * n;
    System.out.println("Arithmetic in Expressions, = " + result);
  }
}
```

---

### 📌 Key Notes

- **Integer Division**: In `int` division, the decimal part is truncated.
    - Example: `10 / 3 = 3`
- **Floating-Point Division**: Use `double` or `float` for precise results.
    - Example: `10.0 / 3 = 3.333...`
- **Precedence**: Operators follow **mathematical precedence** (`*`, `/`, `%` before `+`, `-`).

---

## 🏷️ Relational Operators

### 📘 Concept

Relational operators are used to **compare two values**.  
They always return a **boolean value** (`true` or `false`).


| Operator | Description                  | Example (`a=10, b=20`) | Result  |
|----------|------------------------------|------------------------|---------|
| `==`     | Equal to                     | `a == b`               | false   |
| `!=`     | Not equal to                 | `a != b`               | true    |
| `>`      | Greater than                 | `a > b`                | false   |
| `<`      | Less than                    | `a < b`                | true    |
| `>=`     | Greater than or equal to     | `a >= b`               | false   |
| `<=`     | Less than or equal to        | `a <= b`               | true    |

---

### 📝 Program: Comparing Integers
```java
public class RelationalOperator {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
    }
}
```

### 📝 Program: Relational Operators in if
```java
public class RelationalInIf { 
    public static void main(String[] args) {
      int age = 18;
  
      if (age >= 18) {
          System.out.println("You are eligible to vote!");
      } else {
          System.out.println("You are not eligible to vote.");
      }
  }
}
```

### 📝 Program: Comparing Characters and Strings
```java
public class RelationalOperatorWithString {
  public static void main(String[] args) {
    char ch1 = 'A', ch2 = 'B';
    System.out.println("ch1 < ch2: " + (ch1 < ch2));  // true

    String s1 = "Java";
    String s2 = "Java";
    String s3 = new String("Java");

    System.out.println("s1 == s2: " + (s1 == s2));   // true (same reference)
    System.out.println("s1 == s3: " + (s1 == s3));   // false (different object)
    System.out.println("s1.equals(s3): " + s1.equals(s3)); // true (content check)
  }
}
```

---

### 📌 Key Notes
- Used in **decision making** (`if`, `while`, `for`).
- Work with **numeric types**, **characters**, and **objects (via methods like equals)**.
- **Strings**: Use `.equals()` to compare content, not `==`.

---

## 🏷️ Logical Operators

### 📘 Concept

Logical operators are used to combine multiple **boolean expressions**.  
They are commonly used in **conditional statements** (`if`, `while`, `for`) to control the flow of the program.

| Operator | Symbol | Description                                                    |
|----------|--------|----------------------------------------------------------------|
| AND      | `&&`   | Returns `true` if **both** operands are true                   |
| OR       | `||`   | Returns `true` if **at least one** operand is true             |
| NOT      | `!`    | Reverses the boolean value (`true` → `false`, `false` → `true`)|

---

### 📝 Program: Using AND (`&&`) and OR (`||`)

```java
public class LogicalOperators {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 15;

        // AND operator
        boolean result1 = (a < b) && (c < b);  // true && true
        System.out.println("(a < b) && (c < b): " + result1);

        // OR operator
        boolean result2 = (a > b) || (c < b);  // false || true
        System.out.println("(a > b) || (c < b): " + result2);
    }
}
```


### 📝 Program: Using NOT (!)

```java
public class LogicalNot {
    public static void main(String[] args) {
        boolean isJavaFun = true;
        boolean isFishTasty = false;

        System.out.println("!isJavaFun: " + !isJavaFun);   // false
        System.out.println("!isFishTasty: " + !isFishTasty); // true
    }
}
```

### 📝 Program: Logical Operators in Conditional Statements

```java
public class LogicalInIf {
    public static void main(String[] args) {
        int age = 25;
        boolean hasID = true;

        if (age >= 18 && hasID) {
            System.out.println("You can enter the club.");
        } else {
            System.out.println("Entry denied.");
        }

        boolean isWeekend = false;
        boolean isHoliday = true;

        if (isWeekend || isHoliday) {
            System.out.println("You can relax today.");
        } else {
            System.out.println("You have to work today.");
        }
    }
}
```
---

### 📌 Key Notes
- Use && to ensure all conditions are true.
- Use || to check if any condition is true.
- Use ! to invert a boolean condition.
- Often used in if-else statements, loops, and complex condition checks.

---

[![](https://img.shields.io/badge/Go_Back-🔙-d6cadd?style=for-the-badge&labelColor=d6cadd)](../../../../../../README.md)


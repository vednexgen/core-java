# 🚀 For Loop & Nested Loops in Java

## Introduction

### 📘 Concept

The **for loop** in Java is used when the number of iterations is known in advance. It allows initialization, condition checking, and updation in a single line.

Nested loops allow placing one loop inside another, often used for patterns, matrix operations, or iterating multi-dimensional arrays.

### 🏷️ Simple For Loop

####  Syntax

```
for(initialization; condition; update) {
    // body of loop
}
```

#### 📝 Program: Simple For Loop

```java
public class ForLoop {
    public static void main(String[] args) {
        // Print numbers from 1 to 5
        for(int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }
    }
}
```

**Output:**

```
Number: 1
Number: 2
Number: 3
Number: 4
Number: 5
```

---

### 🏷️ Variations of For Loop

* Initialization can be outside loop.
* Multiple variables can be initialized.
* Update can be multiple expressions.

#### 📝 Program

```
public class MultiVariableForLoop {
    public static void main(String[] args) {
        // Print numbers from 1 to 5
        for(int i = 0, j = 5; i < j; i++, j--) {
            System.out.println("i = " + i + ", j = " + j);
        }
    }
}

```

---

### 🏷️ Nested For Loops

A **nested loop** is a loop inside another loop.

#### 📝 Program: Multiplication Table

```java
public class NestedForLoop {
    public static void main(String[] args) {
        for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <= 3; j++) {
                System.out.print((i * j) + " ");
            }
            System.out.println(); // new line after inner loop
        }
    }
}
```

**Output:**

```
1 2 3
2 4 6
3 6 9
```

---

### 🏷️ Infinite For Loop

```java

public class InfiniteForLoop {
    public static void main(String[] args) {
        for(;;) {
            System.out.println("This is infinite loop");
        }
    }
}

```

---

### 📌 Key Notes

* **for loop** is used when iteration count is known.
* **nested loops** are powerful but can be costly in terms of performance.
* **infinite loops** must be controlled using `break`.

---
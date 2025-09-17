# 🚀 While Loop & Do-While Loop in Java

## Introduction

Loops are used in Java to execute a block of code repeatedly as long as a condition is true. The **while loop** and **do-while loop** are two types of entry-controlled and exit-controlled loops.

---

## 1. While Loop

### 📘 Concept

* The **while loop** is an *entry-controlled loop*.
* The condition is checked **before** executing the body of the loop.
* If the condition is `false` initially, the loop body may never execute.

#### 🏷️ Syntax

```
while (condition) {
    // code to be executed
}
```

### 📝 Program: Print numbers 1 to 5

```java
public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
    }
}
```

**Output:**

```
1
2
3
4
5
```

---

## 2. Do-While Loop

### 📘 Concept

* The **do-while loop** is an *exit-controlled loop*.
* The body of the loop is executed **at least once**, even if the condition is false.
* The condition is checked **after** executing the loop body.

#### 🏷️ Syntax

```
do {
    // code to be executed
} while (condition);
```

### 📝 Program: Print numbers 1 to 5

```java
public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);
    }
}
```

**Output:**

```
1
2
3
4
5
```

---

### 📝 Program: Demonstrating Difference

```java
public class LoopDifference {
    public static void main(String[] args) {
        int x = 0;

        System.out.println("While Loop:");
        while (x > 0) {
            System.out.println("This will not be printed");
        }

        System.out.println("Do-While Loop:");
        do {
            System.out.println("This will be printed once");
        } while (x > 0);
    }
}
```

**Output:**

```
While Loop:
Do-While Loop:
This will be printed once
```

---

### 📌 Key Notes

* **while loop**: Condition is checked first; loop may not execute if condition is false.
* **do-while loop**: Loop executes at least once; condition checked after execution.
* Use **while** when you don’t know the number of iterations but want a condition check first.
* Use **do-while** when the loop body must run at least once.

---
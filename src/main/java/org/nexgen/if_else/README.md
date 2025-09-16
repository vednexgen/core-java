# 🚀 If-Else & Nested If in Java

In Java, decision-making is achieved using conditional statements. The **if-else** statement allows the program to execute certain blocks of code based on whether a condition evaluates to `true` or `false`. When multiple conditions are involved, **nested if** statements are used.

---

## 1. if Statement

### 📘 Concept

- Executes a block of code **only if** the condition is true.

####  Syntax
```
if (condition) {
    // code to be executed if condition is true
}
```
---
### 📝 Program

```java
public class IfStatement {
    public static void main(String[] args) {
        int number = 10;

        if (number > 0) {
            System.out.println("The number is positive");
        }
    }
}
```

---

## 2. if-else Statement
### 📘 Concept

- Provides an **alternative block** of code if the condition is false.

####  Syntax
```
if (condition) {
    // code to be executed if condition is true
} else {
    // code to be executed if condition is false
}
```
---
### 📝 Program
```java
public class IfElseStatement {
    public static void main(String[] args) {
        int number = -5;

        if (number >= 0) {
            System.out.println("The number is non-negative");
        } else {
            System.out.println("The number is negative");
        }
    }
}
```

---

## 3. if-else-if Ladder
### 📘 Concept
- Used to check **multiple conditions** one after another.

#### Syntax
```
if (condition1) {
    // block executed if condition1 is true
} else if (condition2) {
    // block executed if condition2 is true
} else if (condition3) {
    // block executed if condition3 is true
} else {
    // block executed if all conditions are false
}
```
---
### 📝 Program

```java
public class IfElseIfStatement {
    public static void main(String[] args) {
        int marks = 75;

        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 75) {
            System.out.println("Grade: A");
        } else if (marks >= 50) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}
```

---

## 4. Nested if Statement
### 📘 Concept
* An **if statement inside another if** statement.
* Useful when one condition depends on another.

#### Syntax
```
if (condition1) {
    if (condition2) {
        // code executed if both conditions are true
    }
}
```
---

### 📝 Program
```java
public class NestedIfStatement {
    public static void main(String[] args) {
        int age = 20;
        boolean hasVoterID = true;

        if (age >= 18) {
            if (hasVoterID) {
                System.out.println("You are eligible to vote");
            } else {
                System.out.println("You need a voter ID to vote");
            }
        } else {
            System.out.println("You are not eligible to vote");
        }
    }
}
```

---

### 📌 Key Notes

* **if** → checks a condition and executes code if true.
* **if-else** → provides an alternate block when the condition is false.
* **if-else-if ladder** → checks multiple conditions sequentially.
* **nested if** → an if inside another if, used for dependent conditions.

---
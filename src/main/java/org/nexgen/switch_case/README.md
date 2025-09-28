# 🚀 Switch Case in Java

## Introduction

### 📘 Concept

The `switch` case statement in Java is a multi-way branch statement.  
It is a control flow statement that allows you to execute one block of code among many options.  
It is often used as an alternative to multiple `if-else-if` statements, making the code more readable and easier to maintain.

#### 🏷️ Key Points

- The `expression` must evaluate to a byte, short, char, int, enum, String, or wrapper classes like `Integer`, `Character`, etc.
- `case` values must be compile-time constants.
- `break` is used to terminate a case. Without it, execution will "fall through" to the next case.
- `default` is optional but recommended, as it handles unexpected values.

#### 🏷️ Syntax

```
switch (expression) {
    case value1:
        // code block
        break;
    case value2:
        // code block
        break;
    ...
    default:
        // default code block
}
```
---

### 📝 Program: Basic Switch

```java
public class SwitchCase {
    public static void main(String[] args) {
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
```
**Output:**

```
Wednesday
```

---

### 📝 Program: Fall-Through Behavior

- If you omit `break`, execution continues into the next case:

```java
public class SwitchCaseFallThrough {
    public static void main(String[] args) {
        int number = 2;

        switch (number) {
            case 1:
                System.out.println("One");
            case 2:
                System.out.println("Two");
            case 3:
                System.out.println("Three");
        }
    }
}
```

**Output:**

```
Two
Three
```

---

### 📝 Program: Switch with String (Java 7+)

```java
public class StringSwitchCase {
    public static void main(String[] args) {
        String fruit = "Apple";
        switch (fruit) {
            case "Apple":
                System.out.println("It's an apple");
                break;
            case "Banana":
                System.out.println("It's a banana");
                break;
            default:
                System.out.println("Unknown fruit");
        }
    }
}
```

**Output:**

```
It's an apple
```

---

### 📝 Program: Enhanced Switch (Java 14+)

- Java 14 introduced a new form of switch expression with arrow labels and `yield`.

```java
public class EnhancedSwitchCase {
    public static void main(String[] args) {
        String day = "MONDAY";

        String type = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "Weekday";
            case "SATURDAY", "SUNDAY" -> "Weekend";
            default -> "Invalid";
        };

        System.out.println(type);
    }
}
```

**Output:**

```
Weekday
```

---

### 📝 Program: Pattern Matching in Switch (Java 17+ preview, refined later)

- From Java 17 (as a preview feature) and refined in newer versions, `switch` supports **pattern matching**, which makes it more powerful. You can directly check types and extract values.

#### 🏷️ Advantages of Pattern Matching in Switch

* Reduces the need for explicit casting.
* Allows handling of `null` values safely.
* Cleaner and more expressive code.

```java
public class PatternMatchingSwitchCase {

    static String formatter(Object obj) {
        return switch (obj) {
            case Integer i -> String.format("int %d", i);
            case Long l    -> String.format("long %d", l);
            case String s  -> String.format("String '%s'", s);
            case null      -> "null value";
            default        -> obj.toString();
        };
    }

    public static void main(String[] args) {
        System.out.println(formatter(10));
        System.out.println(formatter("Hello"));
        System.out.println(formatter(null));
    }
}
```

**Output:**

```
int 10
String 'Hello'
null value
```

---

### ✨ Summary

* `switch` is an alternative to `if-else-if` for multiple conditions.
* Works with `int`, `char`, `String`, enums, and wrapper classes.
* Use `break` to prevent fall-through.
* Enhanced switch (Java 14+) makes code concise.
* Pattern matching in switch (Java 17+ preview, refined later) adds powerful type-checking and matching.

---

[![](https://img.shields.io/badge/Go_Back-🔙-d6cadd?style=for-the-badge&labelColor=d6cadd)](../../../../../../TABLE_CONTENT_README.md)


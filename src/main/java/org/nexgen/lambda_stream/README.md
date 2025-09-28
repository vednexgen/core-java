# 🚀 Java 8 Basics - Lambdas & Streams

## Introduction

Java 8 introduced **Lambdas** and the **Stream API**, two powerful features that greatly simplified coding and improved readability, especially for working with collections and functional-style programming.

---
### 📘 Concept

### 🏷️ Lambda Expressions

A **lambda expression** is a short block of code which takes parameters and returns a value. It enables functional programming in Java.

#### Syntax

```
(parameters) -> expression

(parameters) -> { statements; }
```

```java
public class Lambda {

    public static void main(String[] args) {

        Runnable r = () -> System.out.println("Hello");
        r.run();

        Comparator<Integer> c = (a, b) -> a - b;
        IO.println(c.compare(2,5));
    }
}
```

### 📝 Program: Without Lambda

```java
public class Lambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Mark");

        // Without Lambda
        for(String name : names) {
            System.out.println(name);
        }
    }
}
```

### 📝 Program: With Lambda

```java
public class Lambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Mark");

        // With Lambda
        names.forEach(name -> System.out.println(name));
    }
}
```

---

### 🏷️ Method References

A shorthand for lambda expressions that call an existing method.

### 📝 Program: Method Reference

```java
public class Lambda {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Mark");
        
        // Method reference
        names.forEach(IO::println);
    }
}
```

---

### 🏷️ Functional Interfaces

A **functional interface** is an interface with exactly one abstract method (can have default & static methods).

* Example: `Predicate`, `Consumer`, `Supplier`, `Function`, `Callable`, `Comparator`

### 📝 Program: Function Interface
```java
@FunctionalInterface
interface MyFunctionalInterface {
    void display(Person person);
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        MyFunctionalInterface msg = (person) -> System.out.println("Name :: " + person.getName());
        msg.display(new Person("VedNexGen"));
    }
}
```

---

### 🏷️ Stream API

The **Stream API** allows you to process collections in a functional style.

#### Features of Streams

* Declarative & readable code
* Supports **filtering**, **mapping**, **sorting**, **reducing**
* Can be sequential or parallel

### 📝 Program: Without Streams

```java
public class Streams {

    public static void main(String[] args) {
        withoutStream();
    }

    private static void withoutStream() {
        List<String> names = Arrays.asList("John", "Jane", "Mark", "Tom");

        List<String> filtered = new ArrayList<>();
        for(String name : names) {
            if(name.startsWith("J")) {
                String newStr = name.concat(" is walking.");
                filtered.add(newStr);
            }
        }
        System.out.println(filtered);
    }
}
```

### 📝 Program: With Streams

```java
public class Streams {

    public static void main(String[] args) {
        withoutStream();
    }

    private static void withStream() {
        List<String> names = Arrays.asList("John", "Jane", "Mark", "Tom");

        List<String> filtered = names.stream()
                .filter(n -> n.startsWith("J")) // Intermediate Operation
                .map(n -> n.concat(" is walking.")) // Intermediate Operation
                .collect(Collectors.toList()); // Terminate Operation

        System.out.println(filtered);
    }
}
```

---

### 📝 Program: Stream with Numbers

```java
public class StreamWithNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        int sum = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        System.out.println("Sum of squares of even numbers: " + sum);
    }
}
```

---

### 📌 Key Notes️

#### Common Stream Operations

| Operation   | Description                           | Example                                    |
| ----------- | ------------------------------------- | ------------------------------------------ |
| `filter()`  | Filters elements based on a condition | `names.stream().filter(n -> n.length()>3)` |
| `map()`     | Transforms each element               | `names.stream().map(String::toUpperCase)`  |
| `sorted()`  | Sorts elements                        | `names.stream().sorted()`                  |
| `forEach()` | Iterates through elements             | `names.forEach(System.out::println)`       |
| `collect()` | Collects result into a list/set/map   | `collect(Collectors.toList())`             |
| `reduce()`  | Reduces to a single value             | `numbers.stream().reduce(0, Integer::sum)` |

---

### ✨ Summary

* **Lambda Expressions** → Enable functional programming in Java.
* **Functional Interfaces** → Key enabler for lambdas.
* **Method References** → Shorter syntax for calling existing methods.
* **Stream API** → Simplifies processing collections with filtering, mapping, reducing.
* **Parallel Streams** → Improve performance with multi-core processing.

💡 With Lambdas & Streams, Java code becomes more concise, readable, and functional.

---

### 🌟 Bouns Topic
⚡  [Parallel Stream](parallel)

---

[![](https://img.shields.io/badge/Go_Back-🔙-d6cadd?style=for-the-badge&labelColor=d6cadd)](../../../../../../TABLE_CONTENT_README.md)


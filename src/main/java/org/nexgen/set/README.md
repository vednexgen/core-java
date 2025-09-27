# 🚀 HashSet in Java

The `HashSet` class in Java is part of the **Collections Framework** and implements the `Set` interface. It is used to store **unique elements** and provides constant-time performance for basic operations like add, remove, and search (on average).

---

## Introduction

### 📘 Concept

* **No duplicate elements** allowed.
* **Unordered collection** → Elements are not stored in insertion order.
* **Null element** → Allows a single `null` element.
* **Backed by HashMap** → Internally uses a `HashMap` to store data.
* **Not synchronized** → If multiple threads access it concurrently, it must be synchronized externally.
* Provides **O(1)** average time complexity for add, remove, and contains operations.

#### Declaration

```java
HashSet<Type> set = new HashSet<>();
```

Example:

```java
HashSet<String> names = new HashSet<>();
```

---

### 📝 Program: Basic Operations

```java
import java.util.*;

public class SimpleHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Apple"); // duplicate, will be ignored

        // Printing elements
        System.out.println("HashSet: " + set);

        // Check if element exists
        System.out.println("Contains Mango? " + set.contains("Mango"));

        // Remove element
        set.remove("Banana");
        System.out.println("After removing Banana: " + set);

        // Iterating through HashSet
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}
```

**Output:** (order may vary)

```
HashSet: [Apple, Mango, Banana]
Contains Mango? true
After removing Banana: [Apple, Mango]
Apple
Mango
```

---

### 📌 Key Notes 

#### 🏷️ When to Use HashSet?

* When you need to **store unique values**.
* When you don’t care about the **insertion order**.
* When you want **fast lookup, insertion, and deletion**.

---

#### 🏷️ Differences Between HashSet and ArrayList

| Feature                  | HashSet                      | ArrayList                 |
| ------------------------ | ---------------------------- | ------------------------- |
| **Duplicates**           | Not allowed                  | Allowed                   |
| **Order**                | Unordered                    | Maintains insertion order |
| **Underlying Structure** | HashMap                      | Dynamic Array             |
| **Performance**          | O(1) for add/remove/contains | O(n) for search           |

---

### ✨ Summary

* `HashSet` is a **collection of unique elements**.
* It is **fast** but does not maintain order.
* Backed internally by a **HashMap**.
* Best choice when uniqueness and performance are required.

---

[![](https://img.shields.io/badge/Go_Back-🔙-d6cadd?style=for-the-badge&labelColor=d6cadd)](../../../../../../README.md)


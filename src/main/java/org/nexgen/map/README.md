# 🚀 HashMap in Java

A **HashMap** in Java is a part of the `java.util` package and implements the `Map<K, V>` interface. It stores elements in the form of **key-value pairs** and provides efficient operations for insertion, deletion, and lookup.

---
## Introduction

### 📘 Concept

#### Key Features of HashMap

* Stores data in **key-value pairs**.
* Keys are **unique**; values can be **duplicate**.
* Allows **one null key** and multiple null values.
* Provides **constant time (O(1))** performance for basic operations like get() and put() in the average case.
* Not synchronized (not thread-safe). For thread-safe operations, use `Collections.synchronizedMap()` or `ConcurrentHashMap`.

#### Internal Working

* HashMap uses a technique called **Hashing**.
* Each key is hashed into a hash code using `hashCode()`.
* The hash code determines the **bucket** where the entry (key-value pair) will be stored.
* If multiple keys end up in the same bucket (**collision**), a **linked list** or **balanced tree (since Java 8)** is used to store entries in that bucket.

---

### 📝 Program: Basic HashMap Usage

```java
import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Adding key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // Accessing values
        System.out.println("Value for key 2: " + map.get(2));

        // Iterating through HashMap
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // Checking if a key or value exists
        System.out.println("Contains key 3? " + map.containsKey(3));
        System.out.println("Contains value 'Apple'? " + map.containsValue("Apple"));

        // Removing a key-value pair
        map.remove(1);
        System.out.println("After removing key 1: " + map);
    }
}
```

---

### 📝 Program: Handling Null Keys and Values

```java
import java.util.HashMap;

public class HashMapNullDemo {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        // Null key
        map.put(null, "Value1");
        map.put(null, "Value2"); // Replaces Value1

        // Null values
        map.put("A", null);
        map.put("B", null);

        System.out.println(map);
    }
}
```

---

### 📌 Key Notes

#### 🏷️ When to Use HashMap

* When you need to store data in **key-value pairs**.
* When **fast search, insert, and delete** operations are required.
* When order of elements is **not important** (for ordered maps, use `LinkedHashMap` or `TreeMap`).

---

### ✨ Summary

* **HashMap** is a widely used collection class in Java for storing key-value pairs.
* Offers **O(1)** performance on average for put/get.
* Allows one **null key** and multiple **null values**.
* Not thread-safe; use `ConcurrentHashMap` for multi-threaded applications.

---

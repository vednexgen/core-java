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

### ▶️ HashMap Internal Working in Java

#### 🏷️ How `HashMap` Stores Data

1. **Hashing the Key**

    * When you call `map.put(key, value)`, the `hashCode()` of the key is computed.
    * This hash is processed and mapped to a **bucket index** using:

      ```
      index = (n - 1) & hash   // where n = number of buckets
      ```
    * Data is stored in an array (called **table**), where each slot is a bucket.

2. **Bucket Structure**

    * Each bucket holds entries (key-value pairs).
    * **Java 7 and earlier**: Linked List of Nodes.
    * **Java 8 and later**: If a bucket has more than 8 entries, the list converts to a **Red-Black Tree** for faster lookup (O(log n)).

#### 🏷️ How Retrieval Works

When calling `map.get(key)`:

1. Compute `hashCode()` of the key.
2. Find the **bucket index** using `(n - 1) & hash`.
3. Traverse the bucket:

    * Compare the **hash**.
    * If hashes match, compare the **keys with `.equals()`**.
    * If both match → return the corresponding value.

#### 🏷️ Handling Hash Collisions

* Two different keys may produce the same bucket index.
* `HashMap` resolves collisions using **chaining**:

    1. Store both entries in the same bucket as linked nodes (or tree nodes if many).
    2. During `get(key)`:

        * Traverse the chain/tree.
        * Compare hashes.
        * Use `.equals()` to find the exact key.

#### 🏷️ Example

```
Map<String, String> map = new HashMap<>();
map.put("FB", "Facebook");  // "FB".hashCode() = 2236
map.put("Ea", "Earth");     // "Ea".hashCode() = 2236 (same!)
```

👉 Both `"FB"` and `"Ea"` have the same hash, so they go to the **same bucket**.

* Internally, the bucket contains:

  ```
  ("FB", "Facebook") -> ("Ea", "Earth")
  ```
* When calling `map.get("Ea")`, it:

    * Finds the bucket.
    * Traverses the nodes.
    * Uses `.equals()` to match the key.
    * Returns `"Earth"`.

`💡 Collision handling in HashMap = chaining (LinkedList/Tree) + equals() check`

---

### 📝 Program: Basic HashMap Usage

```java
import java.util.HashMap;

public class HashMapSample {
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

public class HashMapNull {
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

[![](https://img.shields.io/badge/Go_Back-🔙-d6cadd?style=for-the-badge&labelColor=d6cadd)](../../../../../../TABLE_CONTENT_README.md)


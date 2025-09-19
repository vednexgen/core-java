# 🚀 Java Collections: Arrays

## Introduction

An **Array** in Java is a collection of elements of the same type stored in contiguous memory locations. It is one of the most fundamental and simplest data structures in Java. Arrays are part of the Java language itself (not from `java.util` package like ArrayList or LinkedList).

---

### 🏷️ Characteristics of Arrays

* Fixed size: Once declared, the size of the array cannot be changed.
* Homogeneous elements: All elements must be of the same data type.
* Index-based: Accessing elements is done using their index (0-based).
* Stored in contiguous memory locations.

---

### 📝 Program: Declaring and Initializing Arrays

```java
// Declaration
int[] numbers;

// Initialization with size
numbers = new int[5];

// Declaration + Initialization
int[] values = {10, 20, 30, 40, 50};
```

---

### 📝 Program: Accessing Array Elements

- Elements in array are accessed using index.
- Initial index value always starts with '**0**'

```java
int[] arr = {5, 10, 15};
System.out.println(arr[0]); // Output: 5
System.out.println(arr[1]); // Output: 10
System.out.println(arr[2]); // Output: 15
```

---

### 🏷️ Iterating Over Arrays

#### Using For Loop

```java
int[] arr = {1, 2, 3, 4, 5};
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}
```

#### Using Enhanced For Loop

```java
for (int num : arr) {
    System.out.println(num);
}
```

---

#### Multi-Dimensional Arrays

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

System.out.println(matrix[0][1]); // Output: 2
System.out.println(matrix[2][2]); // Output: 9
```

#### Important Properties

* `length` attribute gives the size of the array.
* Index ranges from `0` to `length-1`.
* Accessing out of range index results in `ArrayIndexOutOfBoundsException`.

```java
int[] arr = new int[3];
System.out.println(arr.length); // Output: 3

// This will throw an exception
System.out.println(arr[3]); // ArrayIndexOutOfBoundsException
```

---

### Advantages of Arrays

* Easy to use.
* Provides fast access (O(1)) to elements using index.
* Memory efficient for storing primitive data types.

---

### Limitations of Arrays

* Fixed size (cannot grow or shrink dynamically).
* Insertion and deletion of elements are costly.
* Only stores homogeneous elements.

---

### When to Use Arrays?

* When the number of elements is **fixed**.
* When you need **fast random access** using indices.
* When working with primitive types for **memory efficiency**.

---

### 📌 Key Notes
Arrays are the simplest form of data structure in Java, useful for storing fixed-size, homogeneous collections with fast index-based access.

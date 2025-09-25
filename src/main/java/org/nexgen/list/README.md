# 🚀 Java Collections: ArrayList & LinkedList

In Java, **Collections** are part of the `java.util` package and provide ready-made data structures for handling groups of objects. Two commonly used classes are **ArrayList** and **LinkedList**, both of which implement the **List interface**.

---

## 1. ArrayList

### 📘 Concept

* Backed by a  [_**dynamic array**_](#dynamic-array).
* Provides **fast random access** (index-based).
* Insertion/removal at the end is fast, but slower insertions and deletions in the middle (requires shifting elements).
* Best when read operations are frequent.

---

### 📝 Program: Using ArrayList

```java
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Accessing elements
        System.out.println("First fruit: " + fruits.get(0));

        // Iterating through elements
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Removing element
        fruits.remove("Banana");
        System.out.println("After removal: " + fruits);
    }
}
```

---

### 2. LinkedList

* Backed by a [**doubly linked list**](#doubly-linked-list).
* Provides **fast insertions and deletions** (no shifting required).
* Slower access (requires traversal).
* Best when insertions/deletions are frequent.

#### Example: Using LinkedList

```java
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();

        // Adding elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");

        // Adding at specific positions
        animals.addFirst("Elephant");
        animals.addLast("Tiger");

        // Accessing elements
        System.out.println("First animal: " + animals.getFirst());
        System.out.println("Last animal: " + animals.getLast());

        // Iterating
        for (String animal : animals) {
            System.out.println(animal);
        }

        // Removing elements
        animals.removeFirst();
        animals.removeLast();
        System.out.println("After removal: " + animals);
    }
}
```

---

### 3. Key Differences

| Feature                    | ArrayList                        | LinkedList                    |
| -------------------------- | -------------------------------- | ----------------------------- |
| **Underlying Structure**   | Dynamic Array                    | Doubly Linked List            |
| **Access Time (get)**      | O(1) (fast)                      | O(n) (slow)                   |
| **Insert/Delete (middle)** | O(n) (shifting required)         | O(1) (just pointer changes)   |
| **Memory Usage**           | Less (stores data only)          | More (stores data + links)    |
| **Best Use Case**          | Frequent read, rare modification | Frequent insertions/deletions |

---

### 4. Common Operations

```java
import java.util.*;

public class CommonOperations {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        // Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Check if contains
        System.out.println("Contains 20? " + numbers.contains(20));

        // Replace element
        numbers.set(1, 25);

        // Iterate over list
        for (Integer num : numbers) {
            System.out.println("Number: " + num);
        }

        // Convert to LinkedList
        List<Integer> linkedNumbers = new LinkedList<>(numbers);
        System.out.println("LinkedList: " + linkedNumbers);
    }
}
```

---

### Dynamic Array

- Internal Working (Dynamic Array)
- Internally, ArrayList uses an Object[] elementData array.
- Default capacity: 10 (if not specified).
- When the array is full and a new element is added, ArrayList creates a new array with larger capacity.
- The growth formula is:
  - int newCapacity = oldCapacity + (oldCapacity >> 1); 
  - This means the new capacity = 1.5 × old capacity.  

    **Example of Growth:**
    - Old capacity = 10 → New capacity = 15
    - Old capacity = 15 → New capacity = 22
    - Old capacity = 22 → New capacity = 33

- After calculating new capacity, ArrayList uses System.arraycopy() to copy all existing elements into the new array, then adds the new element.
- This resize operation is O(n), but since it doesn’t happen every time, the average add() remains O(1) amortized.

⚡ So, “backed by a dynamic array” = an array that grows automatically when needed, unlike normal arrays with fixed length.

[🔙](#1-arrayList)
---
### Doubly Linked List
* **Implements a doubly linked list**: Internally, `LinkedList` is made up of nodes. Each node contains three parts:

  1. The data (value stored).
  2. A reference to the previous node.
  3. A reference to the next node.
     This structure allows traversal in both directions (forward and backward).
* **Allows fast insertion and deletion**: Unlike `ArrayList`, which may need to shift multiple elements during insertion or deletion, `LinkedList` only requires updating a few references (pointers). For example, to insert a new node, we adjust the `next` and `prev` references of the neighboring nodes, making insertion and deletion operations generally faster, especially in the middle of the list.

[🔙](#2-linkedList)
---

✅ **Summary**

* Use **ArrayList** when you need **fast random access** and **less insertion/deletion**.
* Use **LinkedList** when you need **frequent insertions/deletions**.
* Both implement `List` interface → can be used interchangeably in many cases.

# 🚀 Parallel Streams in Java 8

## Introduction
### 📘 Concept

#### 🏷️ What is a Parallel Stream?

A **parallel stream** is a stream that splits its elements into **multiple chunks** and processes them **concurrently** using **multiple threads** from the **ForkJoinPool (common pool)**.

👉 Tasks are divided and executed in parallel, improving performance on **multi-core processors**.

---

#### How to Create a Parallel Stream

**Syntax**
```
list.parallelStream();
list.stream().parallel();
```

---

### 📝 Program: Normal vs Parallel Stream

```java
import java.util.List;
import java.util.stream.IntStream;

public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 20).boxed().toList();

        System.out.println("Sequential Stream:");
        numbers.stream().forEach(n ->
            System.out.println(Thread.currentThread().getName() + " -> " + n)
        );

        System.out.println("\nParallel Stream:");
        numbers.parallelStream().forEach(n ->
            System.out.println(Thread.currentThread().getName() + " -> " + n)
        );
    }
}
```

Sample Output

```
Sequential Stream:
main -> 1
main -> 2
main -> 3
...

Parallel Stream:
ForkJoinPool.commonPool-worker-3 -> 5
main -> 1
ForkJoinPool.commonPool-worker-1 -> 7
...
```

👉 _Notice_: In parallel streams, multiple threads (worker threads + main thread) process elements simultaneously.

---

#### 🏷️ Internal Working

1. **Splitting** – The stream source (like a list) is split into subparts.
2. **Task submission** – Each chunk is submitted to a worker thread.
3. **Execution** – Tasks are executed in parallel using the **ForkJoinPool**.
4. **Combining** – Results are merged at the end.

---
#### 🏷️ When to Use Parallel Streams

✔️ Use when:

* Large dataset (e.g., millions of elements).
* CPU-intensive operations (math calculations, transformations).
* Order of processing is not important.

❌ Avoid when:

* Small dataset (overhead > performance gain).
* I/O operations (DB calls, file read/write).
* Order matters (parallel streams don’t guarantee order unless `.forEachOrdered`).

---

### 📝 Program: Example with Performance

```java
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelPerfTest {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 100_000_000).boxed().collect(Collectors.toList());

        // Sequential
        long start = System.currentTimeMillis();
        long count1 = numbers.stream().filter(n -> n % 2 == 0).count();
        long end = System.currentTimeMillis();
        System.out.println("Sequential count: " + count1 + " in " + (end - start) + " ms");

        // Parallel
        start = System.currentTimeMillis();
        long count2 = numbers.parallelStream().filter(n -> n % 2 == 0).count();
        end = System.currentTimeMillis();
        System.out.println("Parallel count: " + count2 + " in " + (end - start) + " ms");
    }
}
```

✔️ Typically, the **parallel stream** will run faster on multi-core CPUs for big data.

---

### 📌 Key Notes

* Uses **ForkJoinPool.commonPool()** (default thread pool).
* Default pool size = number of available processor cores.
* You can **change the pool size** with:

  ```
  System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "8");
  ```
* ⚠️ Be careful: changing this affects **all parallel streams** in the JVM.

---

### ✨ Summary

* Parallel streams split tasks and run them **concurrently**.
* Best for **CPU-heavy, large datasets**.
* Avoid for **I/O tasks** or **small collections**.
* Parallelism is powered by the **ForkJoinPool**.

---
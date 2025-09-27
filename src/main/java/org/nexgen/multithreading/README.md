# 🚀 Multithreading in Java

Multithreading in Java is a process of executing multiple threads simultaneously. A thread is a lightweight subprocess, the smallest unit of processing. Multithreading allows better utilization of CPU by running multiple tasks concurrently.

---

## 📘 Concept

### ▶️ Threads

#### 🏷️ What is a Thread?

* A **thread** is a unit of execution within a process.
* Every Java program has at least one thread — the **main thread**.
* Java provides built-in support for multithreading via the `Thread` class and `Runnable` interface.

#### 🏷️ Benefits of Multithreading

* Efficient CPU utilization.
* Concurrent execution of tasks.
* Useful for tasks like animations, games, server requests handling, etc.

#### 🏷️ Life Cycle of a Thread

A thread in Java can exist in different states:

1. **New** → Thread object created, not started yet.
2. **Runnable** → After calling `start()`, waiting for CPU time.
3. **Running** → Currently executing.
4. **Waiting/Blocked** → Temporarily inactive.
5. **Terminated** → Completed execution.

---

#### 🏷️ Creating Threads

### 📝 Program: 1 Extending the Thread Class

```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}
```

### 📝 Program 2. Implementing the Runnable Interface

```java
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        t1.start();
    }
}
```

---

### ▶️ Thread Methods

* `start()` → Starts the thread.
* `run()` → Contains the code executed by the thread.
* `sleep(ms)` → Makes thread pause for some time.
* `join()` → Waits for a thread to finish.
* `getName()` / `setName()` → Get or set thread name.
* `setPriority(int)` → Set priority (1–10).

---

### ▶️ Thread Synchronization

- When multiple threads access shared resources without synchronization, it may cause data inconsistency (also called race conditions).  
- Synchronization ensures that only one thread can access the critical section (shared resource) at a time.

### 📝 Program: Using synchronized keyword

```java
class Counter {
    int count = 0;

    public synchronized void increment() {
        count++;
    }
}

public class SyncExample {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            for(int i=0; i<1000; i++) c.increment();
        });

        Thread t2 = new Thread(() -> {
            for(int i=0; i<1000; i++) c.increment();
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Count = " + c.count);
    }
}
```

### ▶️️ Synchronization Mechanisms

- Synchronized Methods → Whole method is synchronized.
- Synchronized Blocks → Only critical section is locked.
    ```
    synchronized(this) {
    // critical section
    }
    ```
- Lock Objects (java.util.concurrent.locks.Lock) → More control over locking.

---

### ▶️️ Daemon Threads

* Low-priority threads that run in the background (like garbage collector).
* Use `setDaemon(true)` to make a thread daemon.

---

### ▶️ Thread Communication

Threads can communicate using:

* `wait()` → Causes thread to wait until another thread notifies.
* `notify()` → Wakes a single waiting thread.
* `notifyAll()` → Wakes all waiting threads.

---

### 📝 Program: Producer-Consumer Problem

```java
class SharedResource {
    private int data;
    private boolean available = false;

    public synchronized void produce(int value) throws InterruptedException {
        while (available) wait();
        data = value;
        available = true;
        System.out.println("Produced: " + value);
        notify();
    }

    public synchronized void consume() throws InterruptedException {
        while (!available) wait();
        System.out.println("Consumed: " + data);
        available = false;
        notify();
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try { resource.produce(i); Thread.sleep(500);} catch (Exception e) {}
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try { resource.consume(); Thread.sleep(500);} catch (Exception e) {}
            }
        });

        producer.start();
        consumer.start();
    }
}
```

---

### ✨ Summary Summary

* **Multithreading** allows concurrent execution in Java.
* Threads can be created by **extending Thread** or **implementing Runnable**.
* Synchronization is crucial to prevent **data inconsistency**.
* Java provides features like **daemon threads**, **inter-thread communication**, and **thread lifecycle management**.

---
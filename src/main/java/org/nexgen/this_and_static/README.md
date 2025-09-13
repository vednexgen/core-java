# 🚀 this & static Keyword in Java

## `this` Keyword

### 📘 Concept

The `this` keyword in Java is a reference variable that refers to the current object.

Use Cases of `this`
1. To differentiate instance variables from local variables.
2. To invoke current class methods.
3. To invoke current class constructors.
4. To pass the current object as a parameter.

---

### 📝 Program: Differentiating Instance & Local Variables
```java
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;  // Refers to instance variable
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Student s1 = new Student("John", 20);
        s1.display();
    }
}
```

### 📝 Program: Calling Another Constructor using `this()`
```java
class Book {
    String title;
    double price;

    Book() {
        this("Unknown", 0.0);  // Calls parameterized constructor
    }

    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    void display() {
        System.out.println("Book: " + title + ", Price: " + price);
    }
}

public class ThisConstructor {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Java Basics", 499);
        b1.display();
        b2.display();
    }
}
```
---

## `static` Keyword

### 📘 Concept

The `static` keyword is used for memory management. It can be applied to variables, methods, blocks, and nested classes.

Use Cases of `static`
1. **Static Variable** → Shared across all objects.
2. **Static Method** → Belongs to class, not object.
3. **Static Block** → Runs once when class is loaded.
4. **Static Class** → Nested static class inside another class.

---

### 📝 Example 1: Static Variable
```java
class Counter {
    static int count = 0;

    Counter() {
        count++;
    }

    void display() {
        System.out.println("Count: " + count);
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        c3.display(); // Output: Count: 3
    }
}
```

### 📝 Program: Static Method
```java
class MathUtil {
    static int square(int x) {
        return x * x;
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        System.out.println("Square of 5: " + MathUtil.square(5));
    }
}
```

### 📝 Program: Static Block
```java
class StaticBlockExample {
    static {
        System.out.println("Static block executed before main method!");
    }

    public static void main(String[] args) {
        System.out.println("Main method executed.");
    }
}
```

### 📝 Program: Static Nested Class
```java
class Outer {
    static class Inner {
        void display() {
            System.out.println("Inside static nested class");
        }
    }
}

public class StaticNestedClass {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();
        obj.display();
    }
}
```

---

### 📌 Key Notes

- `this` refers to the current object.
- `this()` calls another constructor.
- `static` members belong to the class, not instances, thus are shared across all objects.
- `static` is useful for memory optimization and utility methods.

---
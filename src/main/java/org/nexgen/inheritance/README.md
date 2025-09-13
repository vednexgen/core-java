# 🚀 Inheritance and `super` keyword in Java

Inheritance in Java allows a class (**child/subclass**) to acquire properties and behaviors of another class (**parent/superclass**).  
It enables **code reusability**, **method overriding**, and establishes an **is-a relationship** between classes.

---
## 1. Inheritance

### 📘 Concept

#### 🏷️ Types of Inheritance in Java

1. **Single Inheritance** → A class inherits from one superclass.
2. **Multilevel Inheritance** → A class inherits from another subclass, forming a chain. Child → Parent → Grandparent
3. **Hierarchical Inheritance** → Multiple classes inherit from one superclass.

⚠️ Java does **not** support **multiple inheritance** with classes (to prevent ambiguity), but it can be achieved using **interfaces**.

#### 🔑 Why Java disallows multiple inheritance of classes (detailed)
- **Diamond problem / method ambiguity**  
  Suppose A defines void foo(), B extends A (or another chain) and C extends A, and D tried to inherit from both B and C. If B and C override foo() differently, what should D.foo() be? The language must define a consistent resolution rule; that adds complexity to language, JVM, and mental model.
- **Field (state) ambiguity**  
  If two parent classes each have an instance field with the same name, which field would the child have? Sharing state in multiple inheritance can be ambiguous and error-prone.
- **Simpler object model & single root**  
  Java chose a simpler, safer object model: each class has a single direct superclass (single inheritance chain), and java.lang.Object is the ultimate root.
- **Maintainability and readability**  
  Multiple class inheritance complicates method lookup rules and makes code harder to reason about, maintain, and test.

---

### 📝 Program: Single Inheritance

```java
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // Inherited method
        d.bark();  // Child method
    }
}
```

### 📝 Program: Multilevel Inheritance

```java
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Mammals can walk.");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // From Animal
        d.walk();  // From Mammal
        d.bark();  // From Dog
    }
}
```

### 📝 Program: Hierarchical Inheritance

```java
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows.");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();

        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}
```

---

### 📌 Key Notes

* Use **`extends`** keyword to inherit a class.
* Child class can access **all non-private members** of the parent class.
* Inheritance supports **Single**, **Multilevel**, and **Hierarchical** types.
* Use **interfaces** to achieve **multiple inheritance** in Java.

---

### ✨ Summary

* Inheritance provides **code reuse** and simplifies design.
* Parent class → common properties and methods.
* Child class → specialized properties and methods.
* Helps implement **polymorphism** and **method overriding**.

---

## 2. super Keyword in Java

### 📘 Concept

The `super` keyword in Java is a reference variable that refers to the **immediate parent class object**.  
It is used to access parent class members (methods, fields, and constructors) that are overridden or hidden by the child class.

#### 🏷️ Uses of `super` Keyword

1. **Access parent class variables** when they are hidden by child class variables.
2. **Call parent class methods** when overridden in the child class.
3. **Call parent class constructors** from the child class constructor.

---

### 📝 Program: Accessing Parent Class Variable

```java
class ParentVariable {
    int num = 100;
}

class ChildVariable extends ParentVariable {
    int num = 200;

    void display() {
        System.out.println("ChildVariable num: " + num);
        System.out.println("ParentVariable num: " + super.num);
    }
}

public class ParentClassVariable {
    public static void main(String[] args) {
        ChildVariable obj = new ChildVariable();
        obj.display();
    }
}
```

### 📝 Program: Calling Parent Class Method

```java
class ParentMethod {
    void show() {
        System.out.println("ParentMethod's show method");
    }
}

class ChildMethod extends ParentMethod {
    void show() {
        System.out.println("ChildMethod's show method");
        super.show();
    }
}

public class ParentClassMethod {
    public static void main(String[] args) {
        ChildMethod obj = new ChildMethod();
        obj.show();
    }
}
```

### 📝 Program: Calling Parent Class Constructor

```java
class Parent {
    Parent() {
        System.out.println("Parent class constructor");
    }
}

class Child extends Parent {
    Child() {
        super();
        System.out.println("Child class constructor");
    }
}

public class ParentClassConstructor {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}
```

---

### 📌 Key Notes

- `super` can be used to refer to **parent class variables** and **methods**.
- `super()` can be used to call **parent class constructors**.
- It helps in **resolving ambiguity** between parent and child class members.
- Must be the **first statement** in a child class constructor when calling `super()`.

---

### ✨ Summary

* `super` provides access to parent class members.
* Useful for **inheritance scenarios** where child class overrides parent methods or hides variables.
* Essential for calling parent constructors and ensuring proper initialization.

---
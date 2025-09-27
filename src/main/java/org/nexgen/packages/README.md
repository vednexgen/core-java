# 🚀 Packages in Java

## 📘 Concept

### 🏷️ What is a Package?

A `package` in Java is a way to group related classes, interfaces, and sub-packages together. It provides **modularity**, **reusability**, and helps **avoid name conflicts**.

Think of a package as a **folder** in your computer that stores related files.

---

### 🏷️ Advantages of Packages

* **Organized code**: Groups related classes together.
* **Avoids name conflicts**: Classes with the same name can exist in different packages.
* **Reusability**: Classes in one package can be reused in another project.
* **Encapsulation**: Access modifiers work better with packages to restrict access.
* **Maintenance**: Easier to manage and maintain code.

---

### 🏷️ Types of Packages

1. **Built-in Packages**
    * Java provides many pre-defined packages.
    * Examples:
        * `java.util` → Collections Framework classes like `ArrayList`, `HashMap`
        * `java.io` → Input/Output classes
        * `java.sql` → Database connectivity
2. **User-defined Packages**
    * Created by developers to group related classes.

---

### ▶️ Creating a Package

#### Step 1: Create a package

```java
package org.nexgen.packages;  // declare package at top

public class MyClass {
    public void showMessage() {
        System.out.println("Hello from MyClass in mypackage!");
    }
}
```

#### Step 2: Compile with `-d` option

```
javac -d . MyClass.java
```

This will create a folder named `mypackage` containing `MyClass.class`.

#### Step 3: Use the package in another class

```java
package org.nexgen.packages.mypackage;

import org.nexgen.packages.MyClass;

public class TestPackage {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showMessage();
    }
}
```

---

### 📝 Program: Built-in Package Usage

```java
package org.nexgen.packages;

import java.util.ArrayList;

public class BuiltInPackageDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        System.out.println(list);
    }
}
```

---

## Best Practices

- Always use your reverse Internet domain name as the root (e.g., `com.example`).
- Keep related classes together.
- Never use default package (`no package;`) for real projects.
- Use meaningful package names.

---

### 📌 Key Notes

* Packages help in organizing and modularizing code.
* Java has **built-in packages** and allows **user-defined packages**.
* Access modifiers determine scope across packages.
* Compilation with `-d` is required to generate package structure.

---

[![](https://img.shields.io/badge/Go_Back-🔙-d6cadd?style=for-the-badge&labelColor=d6cadd)](../../../../../../course-docs/TABLE_CONTENT_README.md)


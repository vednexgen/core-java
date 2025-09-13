# 🚀 Access Modifiers in Java

Access modifiers in Java define the **visibility** or **scope** of classes, methods, and variables.  
They control where a class member can be accessed from.

## 📘 Concept

Java provides **4 access modifiers**:

- `public`
- `protected`
- `default` (no modifier)
- `private`

---

### 🏷️ `public` Access Modifier

- Accessible **from anywhere** (any class, any package).
- Most permissive access level.

### 📝 Program

```java
// File: PublicExample.java
package package1;

public class PublicExample {
    public String message = "I am public";

    public void showMessage() {
        System.out.println(message);
    }
}
```

```java
package package2;

import package1.PublicExample;

public class TestPublic {
    public static void main(String[] args) {
        PublicExample obj = new PublicExample();
        obj.message = "I am accessed publicly";
        obj.showMessage(); // Accessible everywhere
    }
}
```

---

### 🏷️ `protected` Access Modifier

- Accessible **within the same package**.
- Accessible in **subclasses**, even if they are in different packages.

### 📝 Program

```java
// File: ProtectedExample.java
package package1;

public class ProtectedExample {
    protected String message = "I am protected";

    protected void showMessage() {
        System.out.println(message);
    }
}
```

```java
package package2;

import package1.ProtectedExample;

class Child extends ProtectedExample {
    public void display() {
        showMessage(); // Accessible because of inheritance
    }
}

public class TestProtected {
    public static void main(String[] args) {
        Child child = new Child();
        child.display(); // Works

        // ProtectedExample obj = new ProtectedExample();
        // obj.showMessage(); // ❌ Not accessible without inheritance
    }
}
```
---

### 🏷️ `default` (Package-Private) Access Modifier

- If no access modifier is specified, it is accessible **only within the same package**.
- Not accessible from outside the package.

### 📝 Program

```java
// File: DefaultExample.java
package package1;

class DefaultExample {
    String message = "I am default (package-private)";

    void showMessage() {
        System.out.println(message);
    }
}
```

```java
package package1;

public class TestDefault {
    public static void main(String[] args) {
        DefaultExample obj = new DefaultExample();
        obj.showMessage(); // Works because in same package
    }
}
```

❌ If you try to access `DefaultExample` from another package:

```java
package package2;
import package1.DefaultExample; // ERROR: class not visible
```

---

### 🏷️ `private` Access Modifier

- Accessible **only within the same class**.
- Most restrictive access level.

### 📝 Program

```java
// File: PrivateExample.java
package package1;

public class PrivateExample {
    private String message = "I am private";

    private void showMessage() {
        System.out.println(message);
    }

    public void display() {
        showMessage(); // Accessible inside the same class
    }
}
```

```java
package package1;

public class TestPrivate {
    public static void main(String[] args) {
        PrivateExample obj = new PrivateExample();
        obj.display();  // Works because public method calls private method

        // obj.showMessage(); // ❌ Not accessible directly
    }
}
```

---

### 📌 Key Notes

* Use `public` for methods and classes meant to be accessed widely.
* Use `protected` when working with inheritance.
* Use `default` when restricting access to the same package.
* Use `private` for encapsulation and restricting access to within the class only.

---

### ✨ Summary

#### _The access to members permitted by each modifier:_

| Modifier      | Same Class | Same Package | Subclass (diff package) | Other Package |
|---------------|:----------:|:------------:|:-----------------------:|:-------------:|
| **public**    |     ✅     |      ✅      |            ✅           |       ✅      |
| **protected** |     ✅     |      ✅      |            ✅           |       ❌      |
| **default**   |     ✅     |      ✅      |            ❌           |       ❌      |
| **private**   |     ✅     |      ❌      |            ❌           |       ❌      |

#### _Let us see which all members of Java can be assigned with the access modifiers:_

| Members of JAVA | Private | Default | Protected | Public |
|-----------------|:-------:|:-------:|:---------:|:------:|
| Class           |   ❌    |   ✅    |    ❌    |   ✅   |
| Variable        |   ✅    |   ✅    |    ✅    |   ✅   |
| Method          |   ✅    |   ✅    |    ✅    |   ✅   |
| Constructor     |   ✅    |   ✅    |    ✅    |   ✅   |
| interface       |   ❌    |   ✅    |    ❌    |   ✅   |
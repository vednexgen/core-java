# 🚀 Annotations in Java

Annotations are metadata tags introduced in Java 5. They provide information about code, used by compilers, tools, and frameworks for enforcing rules, generating code, or changing runtime behavior.

### 🏷️ Built-in Annotations

| Annotation                                                          | Description                                                                 |
|---------------------------------------------------------------------|-----------------------------------------------------------------------------|
| `@Override`                                                         | Indicates a method overrides a method in a superclass.                      |
| `@Deprecated`                                                       | Marks a method/class as deprecated (not recommended for use).               |
| `@SuppressWarnings`                                                 | Instructs the compiler to suppress specified warnings.                      |
| `@FunctionalInterface`                                              | Marks an interface as a functional interface (exactly one abstract method). |
| `@SafeVarargs`                                                      | Suppresses warnings about heap pollution with varargs.                      |
| `@Retention`, `@Target`, `@Inherited`, `@Documented`, `@Repeatable` | Meta-annotations for custom annotations.                                    |

### 📝 Program: Custom Annotations

You can define your own annotations using `@interface`.

```java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TestInfo {
    String author();
    int priority() default 1;
}
```

### 📝 Program: Applying Annotations

```java
public class AnnotationDemo {

    @TestInfo(author = "Alice", priority = 2)
    public void testMethod() {
        System.out.println("Test Method executed.");
    }
}
```

### 📝 Program: Accessing Annotations via Reflection

Annotations retained at runtime can be accessed using Java’s Reflection API.

```java
import java.lang.reflect.Method;

public class AnnotationProcessor {
    public static void main(String[] args) throws Exception {
        Method method = AnnotationDemo.class.getMethod("testMethod");
        if (method.isAnnotationPresent(TestInfo.class)) {
            TestInfo info = method.getAnnotation(TestInfo.class);
            System.out.println("Author: " + info.author());
            System.out.println("Priority: " + info.priority());
        }
    }
}
```

### 🏷️ Meta-annotations

Meta-annotations are annotations applied to other annotations:

- `@Retention`
- `@Target`
- `@Documented`
- `@Inherited`

### 📝 Program

```java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Marker {
}
```

---

### 🏷️ Retention Policies and Target Types in Java Annotations

#### 🔹 Retention Policies

**Retention Policy** determines how long annotations are retained and at which stage they are discarded or made available. This is controlled by the meta-annotation `@Retention`, which takes a value from the `java.lang.annotation.RetentionPolicy` enum. The possible values are:

| Retention Policy          | Description                                                                                                          | Use Case Example           |
|--------------------------|----------------------------------------------------------------------------------------------------------------------|----------------------------|
| `RetentionPolicy.SOURCE`  | Annotation is present only in source code and discarded by the compiler. Not present in `.class` files.              | `@Override`, `@SuppressWarnings` |
| `RetentionPolicy.CLASS`   | Annotation is recorded in the `.class` file but not available at runtime. (Default if not specified)                 | Used by compilers/tools    |
| `RetentionPolicy.RUNTIME` | Annotation is recorded in the `.class` file and available at runtime via reflection.                                 | `@Deprecated`, custom annotations for frameworks |

#### 📝 Program

```java
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyRuntimeAnnotation {}
```
Here, `MyRuntimeAnnotation` will be available at runtime for reflection.

---

#### 🔹 Target Types

**Target Type** (also known as Element Type) specifies where an annotation can be applied, such as classes, methods, fields, etc. This is controlled by the meta-annotation `@Target`, which takes values from the `java.lang.annotation.ElementType` enum.

| ElementType Value     | Can annotate...             | Example usage           |
|----------------------|-----------------------------|------------------------|
| `TYPE`               | Class, interface, enum      | `@Entity`              |
| `FIELD`              | Field (instance variables)  | `@Autowired`           |
| `METHOD`             | Method                      | `@Test`                |
| `PARAMETER`          | Parameter                   | `@RequestParam`        |
| `CONSTRUCTOR`        | Constructor                 |                        |
| `LOCAL_VARIABLE`     | Local variable              |                        |
| `ANNOTATION_TYPE`    | Annotation type             |                        |
| `PACKAGE`            | Package declaration         |                        |
| `TYPE_PARAMETER`     | Type parameter (Java 8+)    |                        |
| `TYPE_USE`           | Any use of a type (Java 8+) |                        |

#### 📝 Program

```java
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Target({ElementType.METHOD, ElementType.TYPE})
public @interface MyCustomAnnotation {}
```
Here, `MyCustomAnnotation` can be applied to both classes and methods.

---

#### 📌 Comparision Table

| Meta-Annotation | Purpose                                  | Example                                                  |
|-----------------|------------------------------------------|----------------------------------------------------------|
| `@Retention`    | How long annotation is kept              | `@Retention(RetentionPolicy.RUNTIME)`                    |
| `@Target`       | Where annotation can be applied           | `@Target({ElementType.METHOD, ElementType.TYPE})`        |

---

### ✨ Summary

Annotations are powerful tools for code documentation, validation, and runtime processing. They’re widely used in frameworks like Spring, Hibernate, and JUnit.

---

[![](https://img.shields.io/badge/Go_Back-🔙-d6cadd?style=for-the-badge&labelColor=d6cadd)](../../../../../../course-docs/TABLE_CONTENT_README.md)
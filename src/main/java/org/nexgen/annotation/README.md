# Annotations in Java

## Overview

Annotations are metadata tags introduced in Java 5. They provide information about code, used by compilers, tools, and frameworks for enforcing rules, generating code, or changing runtime behavior.

## Built-in Annotations

- `@Override`: Indicates a method overrides a superclass method.
- `@Deprecated`: Marks code as obsolete.
- `@SuppressWarnings`: Suppresses compiler warnings for the annotated element.

## Custom Annotations

You can define your own annotations using `@interface`.

```java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TestInfo {
    String author();
    int priority() default 1;
}
```

## Applying Annotations

```java
public class AnnotationDemo {

    @TestInfo(author = "Alice", priority = 2)
    public void testMethod() {
        System.out.println("Test Method executed.");
    }
}
```

## Accessing Annotations via Reflection

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

## Meta-annotations

Meta-annotations are annotations applied to other annotations:

- `@Retention`
- `@Target`
- `@Documented`
- `@Inherited`

Example:

```java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Marker {
}
```

## Retention Policies

- `SOURCE`: Discarded during compilation.
- `CLASS`: Present in class files, not visible at runtime.
- `RUNTIME`: Available at runtime via reflection.

## Target Types

- `ElementType.TYPE`: Class, interface, enum
- `ElementType.FIELD`: Field
- `ElementType.METHOD`: Method
- `ElementType.PARAMETER`: Parameter

## Summary

Annotations are powerful tools for code documentation, validation, and runtime processing. They’re widely used in frameworks like Spring, Hibernate, and JUnit.

# 🚀 First Java Program – Hello World & main() Method

## 📘 Introduction
Java is one of the most widely used programming languages in the world.  
Every Java program begins with a **class** and executes from a special method called **`main`**.

The simplest program we can write in Java is the famous **Hello World** program.  
This program displays the text `Hello, World!` on the console.

---

## 1. The Hello World Program
### 📝 Program
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### 📘 Concept

---
public static void main(String[] args)  
<access_modifier> <direct_call_keyword> <return_type> main (<command_line_args>)  

This is the entry point of any Java program.
  - Let’s break it:
    - public → accessible from anywhere.
    - static → JVM can call this method without creating an object.
    - void → this is return type, method doesn’t return anything so use '*void*'. 
    - main → special name recognized by the JVM. 
    - String[] args → array of command-line arguments.

### ▶️ Execution Flow

---
1. Write code in HelloWorld.java.  
2. Compile: javac HelloWorld.java → generates HelloWorld.class.  
3. Run: java HelloWorld → JVM looks for main method and starts execution.

##  2. Using Command Line Arguments (args)

### 📝 Program
```java
public class CommandLineExample {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("You entered: " + args[0]);
        } else {
            System.out.println("No arguments provided!");
        }
    }
}
```
### 📘 Concept

---
- args is an array of strings passed when the program is run.  
- args[0] → first argument, args[1] → second argument, and so on.  
- args.length gives the number of arguments provided.

### ▶️ Execution Flow

---
1. Write code in CommandLineExample.java.
2. Compile: javac CommandLineExample.java → generates CommandLineExample.class.
3. Run: java CommandLineExample → JVM looks for main method and starts execution without any arguments.
4. Run: java CommandLineExample John → JVM looks for main method and passes command line arguments to program.

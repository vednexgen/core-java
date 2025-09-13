package org.nexgen.datatypes;

public class NonPrimitiveTypes {
    public static void main(String[] args) {
        String greeting = "Hello, Java!";
        System.out.println(greeting);

        // String methods
        System.out.println("Length: " + greeting.length());
        System.out.println("Uppercase: " + greeting.toUpperCase());
        System.out.println("Substring: " + greeting.substring(0, 5));
    }
}

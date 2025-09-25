package org.nexgen.set;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Apple"); // duplicate, will be ignored

        // Printing elements
        System.out.println("HashSet: " + set);

        // Check if element exists
        System.out.println("Contains Mango? " + set.contains("Mango"));

        // Remove element
        set.remove("Banana");
        System.out.println("After removing Banana: " + set);

        // Iterating through HashSet
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}
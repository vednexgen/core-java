package org.nexgen.list;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Accessing elements
        System.out.println("Initial Fruits List -->> " + fruits);
        System.out.println("First fruit -->> " + fruits.get(0));

        // Iterating through elements
        System.out.println("Iterating through elements using for loop -->>");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        System.out.println("Iterating through elements using for enhanced loop -->>");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Removing element
        fruits.remove("Banana");
        System.out.println("After removal -->> " + fruits);
    }
}
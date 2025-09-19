package org.nexgen.list;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();

        // Adding elements
        System.out.println("Adding elements -->>");
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");

        // Adding at specific positions
        System.out.println("Adding elements at specific positions -->>");
        animals.addFirst("Elephant");
        animals.addLast("Tiger");

        // Accessing elements
        System.out.println("First animal -->> " + animals.getFirst());
        System.out.println("Last animal -->> " + animals.getLast());

        // Iterating
        System.out.println("Iterating using for loop -->>");
        for (String animal : animals) {
            System.out.println(animal);
        }

        // Removing elements
        System.out.println("Removing elements -->>");
        animals.removeFirst();
        animals.removeLast();
        System.out.println("After removal: " + animals);
    }
}
package org.nexgen.list;

import java.util.*;

public class CommonOperations {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        // Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Check if contains
        System.out.println("List Size -->> " + numbers.size());

        // Check if contains
        System.out.println("Contains 20 ? -->> " + numbers.contains(20));

        System.out.println("Initial ArrayList numbers -->> " + numbers);

        // Replace element
        numbers.set(1, 25);

        System.out.println("Updated ArrayList numbers -->> " + numbers);

        for(Integer num : numbers) {
            num++;
            IO.println(num);
        }

        numbers.forEach(IO::println);

        // Convert to LinkedList
        List<Integer> linkedNumbers = new LinkedList<>(numbers);
        System.out.println("LinkedList linkedNumbers -->> " + linkedNumbers);
    }
}
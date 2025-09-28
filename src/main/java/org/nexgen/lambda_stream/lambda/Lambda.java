package org.nexgen.lambda_stream.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Lambda {

    public static void main(String[] args) {

        // Regular way to use Interface
        ConsumeImpl consume = new ConsumeImpl();
        consume.accept("Some String");

        // Use interface using inner class
        Consumer<String> consumer = new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        };
        consumer.accept("Ved");

        // Use Interface using lambda function
        Consumer<String> cons = (name) -> System.out.println(name);
        cons.accept("NexGen");

        // Use block instead of single expression
        Runnable r = () -> {
            System.out.println("Hello");
            System.out.println("World");
            System.out.println("Good");
            System.out.println("Morning");
        };
        r.run();

        Comparator<Integer> c = (a, b) -> a - b;
        IO.println(c.compare(8,5));


        List<String> names = Arrays.asList("John", "Jane", "Mark");

        // Without Lambda
        System.out.println("Using Without Lambda");
        for(String name : names) {
            System.out.println(name);
        }

        // With Lambda
        System.out.println("Using for each with lambda");
        names.forEach((name) -> System.out.println(name));

        // Method reference
        System.out.println("Using Method reference");
        names.forEach(System.out::println);

        // Usage of BiConsumer
        BiConsumer biConsumer = (fname, lname) -> {
            System.out.println(fname + " " + lname);
        };
        biConsumer.accept("Ved", "NexGen");

    }
}

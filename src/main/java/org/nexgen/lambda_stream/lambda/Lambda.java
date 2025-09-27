package org.nexgen.lambda_stream.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda {

    public static void main(String[] args) {

        Runnable r = () -> System.out.println("Hello");
        r.run();

        Comparator<Integer> c = (a, b) -> a - b;
        IO.println(c.compare(2,5));


        List<String> names = Arrays.asList("John", "Jane", "Mark");

        // Without Lambda
        for(String name : names) {
            System.out.println(name);
        }

        // With Lambda
        names.forEach(name -> System.out.println(name));

        // Method reference
        names.forEach(IO::println);

    }
}

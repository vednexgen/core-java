package org.nexgen.lambda_stream.parallel;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 20).boxed().toList();

        System.out.println("Sequential Stream:");
        numbers.stream().forEach(n ->
            System.out.println(Thread.currentThread().getName() + " -> " + n)
        );

        System.out.println("\nParallel Stream:");
        numbers.parallelStream().forEach(n ->
            System.out.println(Thread.currentThread().getName() + " -> " + n)
        );
    }
}
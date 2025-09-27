package org.nexgen.lambda_stream.stream;

import java.util.Date;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelStream {

    public static void main(String[] args) {
        withParallelStream();
        withoutParallelStream();
    }

    private static void withoutParallelStream() {
        List<Integer> numbers = IntStream.rangeClosed(1, 1000).boxed().toList();
        long startTime = new Date().getTime();
        int sum = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        long endTime = new Date().getTime();
        IO.println("Execution Time :: " + (endTime - startTime));
        System.out.println("Sum of squares of even numbers: " + sum);
    }

    private static void withParallelStream() {
        List<Integer> numbers = IntStream.rangeClosed(1, 1000).boxed().toList();
        long startTime = new Date().getTime();
        int sum = numbers.parallelStream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        long endTime = new Date().getTime();
        IO.println("Execution Time :: " + (endTime - startTime));
        System.out.println("Sum of squares of even numbers: " + sum);
    }
}

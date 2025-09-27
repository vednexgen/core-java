package org.nexgen.lambda_stream.parallel;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelPerfTest {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 100_000_000).boxed().collect(Collectors.toList());

        // Sequential
        long start = System.currentTimeMillis();
        long count1 = numbers.stream().filter(n -> n % 2 == 0).count();
        long end = System.currentTimeMillis();
        System.out.println("Sequential count: " + count1 + " in " + (end - start) + " ms");

        // Parallel
        start = System.currentTimeMillis();
        long count2 = numbers.parallelStream().filter(n -> n % 2 == 0).count();
        end = System.currentTimeMillis();
        System.out.println("Parallel count: " + count2 + " in " + (end - start) + " ms");
    }
}
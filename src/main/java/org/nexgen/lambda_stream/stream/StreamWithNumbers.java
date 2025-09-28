package org.nexgen.lambda_stream.stream;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class StreamWithNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        long startTime = new Date().getTime();
        int sum = numbers.stream()
                .filter(n -> n % 2 == 0) // 2, 4, 6
                .map(n -> n * n) // 4, 16, 36
                .reduce(0, Integer::sum);
        long endTime = new Date().getTime();
        IO.println("Execution Time :: " + (endTime - startTime) + "ms");
        System.out.println("Sum of squares of even numbers: " + sum);
    }
}

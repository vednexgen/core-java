package org.nexgen.lambda_stream.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

    public static void main(String[] args) {
        withoutStream();
        withStream();
    }

    private static void withStream() {
        List<String> names = Arrays.asList("John", "Jane", "Mark", "Tom");

        List<String> filtered = names.stream()
                .filter(n -> n.startsWith("J"))
                .collect(Collectors.toList());

        System.out.println(filtered);
    }

    private static void withoutStream() {
        List<String> names = Arrays.asList("John", "Jane", "Mark", "Tom");

        List<String> filtered = new ArrayList<>();
        for(String name : names) {
            if(name.startsWith("J")) {
                filtered.add(name);
            }
        }
        System.out.println(filtered);
    }
}

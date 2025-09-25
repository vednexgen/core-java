package org.nexgen.map;

import java.util.HashMap;

public class HashMapNullDemo {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        // Null key
        map.put(null, "Value1");
        map.put(null, "Value2"); // Replaces Value1

        // Null values
        map.put("A", null);
        map.put("B", null);

        System.out.println(map);
    }
}
package org.nexgen.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Adding key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        System.out.println("Initial Map: " + map);

        // Accessing values
        System.out.println("Value for key 2: " + map.get(2));

        // Iterating through HashMap
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key);
        }

        for (String value : map.values()) {
            System.out.println("Value: " + value);
        }

        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        for (Map.Entry entry : map.entrySet()) {
            System.out.println("Entry Key: " + entry.getKey() + ", Entry Value: " + entry.getValue());
        }

        // Checking if a key or value exists
        System.out.println("Contains key 3? " + map.containsKey(3));
        System.out.println("Contains value 'Apple'? " + map.containsValue("Apple"));

        // Removing a key-value pair
        map.remove(1);
        System.out.println("After removing key 1: " + map);
    }
}
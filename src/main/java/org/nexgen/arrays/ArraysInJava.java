package org.nexgen.arrays;

public class ArraysInJava {

    public static void main(String[] args) {
        // Declaration
        int[] numbers;

        // Initialization with size
        numbers = new int[5];

        // Declaration + Initialization
        int[] values = {10, 20, 30, 40, 50};

        IO.println("Read Values from Array");
        IO.println(values[0]); // Output: 10
        IO.println(values[1]); // Output: 20
        IO.println(values[2]); // Output: 35

        // Using For Loop
        IO.println("Using For Loop");
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            IO.println(arr[i]);
        }

        // Using Enhanced For Loop
        IO.println("Using Enhanced For Loop");
        for (int num : arr) {
            IO.println(num);
        }

        // Multi-Dimensional Arrays
        IO.println("Multi-Dimensional Arrays");
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        IO.println(matrix[0][1]); // Output: 2
        IO.println(matrix[2][2]); // Output: 9

        IO.println("Important Properties");
        IO.println(arr.length); // Output: 5

        // This will throw an exception
        IO.println(arr[5]);

    }
}

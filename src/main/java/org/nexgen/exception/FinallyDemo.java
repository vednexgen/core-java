package org.nexgen.exception;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            int arr[] = new int[3];
            arr[5] = 10; // risky code
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error: " + e);
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
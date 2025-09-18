package org.nexgen.for_loop;

public class MultiVariableForLoop {
    public static void main(String[] args) {
        // Print numbers from 1 to 5
        for(int i = 0, j = 5; i < j; i++, j--) {
            System.out.println("i = " + i + ", j = " + j);
        }
    }
}
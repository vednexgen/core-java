package org.nexgen.for_loop;

public class NestedForLoop {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            for(int j = 1; j <= 10; j++) {
                System.out.print((i * j) + " ");
            }
            System.out.println(); // new line after inner loop
        }
    }
}
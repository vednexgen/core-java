package org.nexgen.while_do_while;

public class LoopDifference {
    public static void main(String[] args) {
        int x = 0;

        System.out.println("While Loop:");
        while (x > 0) {
            System.out.println("This will not be printed");
        }

        System.out.println("Do-While Loop:");
        do {
            System.out.println("This will be printed once");
        } while (x > 0);
    }
}
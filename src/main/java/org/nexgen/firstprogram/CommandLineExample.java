package org.nexgen.firstprogram;

public class CommandLineExample {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("You entered: " + args[0]);
        } else {
            System.out.println("No arguments provided!");
        }
    }
}
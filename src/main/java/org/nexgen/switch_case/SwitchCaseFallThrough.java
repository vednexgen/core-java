package org.nexgen.switch_case;

public class SwitchCaseFallThrough {
    public static void main(String[] args) {
        int number = 2;

        switch (number) {
            case 1:
                System.out.println("One");
            case 2:
                System.out.println("Two");
            case 3:
                System.out.println("Three");
        }
    }
}
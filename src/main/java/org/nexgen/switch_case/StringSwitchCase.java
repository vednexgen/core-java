package org.nexgen.switch_case;

// Java 7+
public class StringSwitchCase {
    public static void main(String[] args) {
        String fruit = "Apple";
        switch (fruit) {
            case "Apple":
                System.out.println("It's an apple");
                break;
            case "Banana":
                System.out.println("It's a banana");
                break;
            default:
                System.out.println("Unknown fruit");
        }
    }
}
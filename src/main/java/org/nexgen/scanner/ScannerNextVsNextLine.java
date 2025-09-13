package org.nexgen.scanner;

import java.util.Scanner;

public class ScannerNextVsNextLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.next();  // reads single word

        scanner.nextLine(); // consume leftover newline

        System.out.print("Enter your full address: ");
        String address = scanner.nextLine(); // reads entire line

        System.out.println("First Name: " + firstName);
        System.out.println("Address: " + address);
    }
}
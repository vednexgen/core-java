package org.nexgen.access.modifier.private_am.pack_one;

public class PrivateExample {
    private String message = "I am private";

    private void showMessage() {
        System.out.println(message);
    }

    public void display() {
        showMessage(); // Accessible inside the same class
    }
}
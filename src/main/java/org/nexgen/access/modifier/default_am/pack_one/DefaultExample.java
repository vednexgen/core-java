package org.nexgen.access.modifier.default_am.pack_one;

class DefaultExample {
    String message = "I am default (package-private)";

    void showMessage() {
        System.out.println(message);
    }
}
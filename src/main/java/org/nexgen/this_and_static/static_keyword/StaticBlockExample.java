package org.nexgen.this_and_static.static_keyword;

class StaticBlockExample {
    static {
        System.out.println("Static block executed before main method!");
    }

    public static void main(String[] args) {
        System.out.println("Main method executed.");
    }
}
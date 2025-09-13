package org.nexgen.operators;

public class LogicalOperators {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 15;

        // AND operator
        boolean result1 = (a < b) && (c < b);  // true && true
        System.out.println("(a < b) && (c < b): " + result1);

        // OR operator
        boolean result2 = (a > b) || (c < b);  // false || true
        System.out.println("(a > b) || (c < b): " + result2);
    }
}
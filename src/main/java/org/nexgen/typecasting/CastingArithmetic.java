package org.nexgen.typecasting;

public class CastingArithmetic {
    public static void main(String[] args) {
        int a = 10;
        double b = 3.0;

        // Widening: int is promoted to double automatically
        double result1 = a + b;
        System.out.println("Result of a + b: " + result1);

        // Narrowing: explicit cast to int
        int result2 = (int) (a + b);
        System.out.println("Result after casting to int: " + result2);
    }
}
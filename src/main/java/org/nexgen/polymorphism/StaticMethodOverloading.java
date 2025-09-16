package org.nexgen.polymorphism;

class MathUtils {
    static int multiply(int a, int b) {
        return a * b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }
}

public class StaticMethodOverloading {
    public static void main(String[] args) {
        System.out.println(MathUtils.multiply(2, 3));       // 6
        System.out.println(MathUtils.multiply(2.5, 3.5));   // 8.75
    }
}
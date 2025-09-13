package org.nexgen.operators;

public class ArithmeticOperations {
    public static void main(String[] args) {

        int a = 10, b = 3;

        System.out.println("Addition of l + m = " + (a + b));
        System.out.println("Substraction of l - m = " + (a - b));
        System.out.println("Multiplication of l * m = " + (a * b));
        System.out.println("Division (quotient) of l / m = " + (a / b));
        System.out.println("Modulus (remainder) of l % m = " + (a % b));


        // Division with double
        double x = 10, y = 3;
        System.out.println("Division with double, x / y = " + (x / y));

        // Using Arithmetic in Expressions
        int l = 5, m = 10, n = 2;
        int result = (l + m) * n;
        System.out.println("Arithmetic in Expressions, = " + result);
    }
}

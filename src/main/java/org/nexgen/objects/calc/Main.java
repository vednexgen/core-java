package org.nexgen.objects.calc;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.add(5, 7);
        System.out.println("Sum: " + result);
    }
}
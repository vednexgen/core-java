package org.nexgen.typecasting;

public class ExplicitCasting {
    public static void main(String[] args) {
        double myDouble = 9.78;
        int myInt = (int) myDouble; // manual casting: double to int

        System.out.println("Double value: " + myDouble);
        System.out.println("Integer value: " + myInt);
    }
}
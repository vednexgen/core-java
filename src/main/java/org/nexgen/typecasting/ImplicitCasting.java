package org.nexgen.typecasting;

public class ImplicitCasting {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt; // automatic casting: int to double

        System.out.println("Integer value: " + myInt);
        System.out.println("Double value: " + myDouble);
    }
}
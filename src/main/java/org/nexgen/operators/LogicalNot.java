package org.nexgen.operators;

public class LogicalNot {
    public static void main(String[] args) {
        boolean isJavaFun = true;
        boolean isFishTasty = false;

        System.out.println("!isJavaFun: " + !isJavaFun);   // false
        System.out.println("!isFishTasty: " + !isFishTasty); // true
    }
}
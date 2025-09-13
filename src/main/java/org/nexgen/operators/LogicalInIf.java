package org.nexgen.operators;

public class LogicalInIf {
    public static void main(String[] args) {
        int age = 25;
        boolean hasID = true;

        if (age >= 18 && hasID) {
            System.out.println("You can enter the club.");
        } else {
            System.out.println("Entry denied.");
        }

        boolean isWeekend = false;
        boolean isHoliday = true;

        if (isWeekend || isHoliday) {
            System.out.println("You can relax today.");
        } else {
            System.out.println("You have to work today.");
        }
    }
}
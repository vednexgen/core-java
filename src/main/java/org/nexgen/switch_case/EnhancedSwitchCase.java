package org.nexgen.switch_case;

// Java 14
public class EnhancedSwitchCase {
    public static void main(String[] args) {
        String day = "MONDAY";

        String type = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "Weekday";
            case "SATURDAY", "SUNDAY" -> "Weekend";
            default -> "Invalid";
        };

        System.out.println(type);
    }
}
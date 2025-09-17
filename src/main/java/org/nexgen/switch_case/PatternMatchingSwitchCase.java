package org.nexgen.switch_case;

// Java 17
public class PatternMatchingSwitchCase {

    static String formatter(Object obj) {
        return switch (obj) {
            case Integer i -> String.format("int %d", i);
            case Long l    -> String.format("long %d", l);
            case String s  -> String.format("String '%s'", s);
            case null      -> "null value";
            default        -> obj.toString();
        };
    }

    public static void main(String[] args) {
        System.out.println(formatter(10));
        System.out.println(formatter("Hello"));
        System.out.println(formatter(null));
    }
}
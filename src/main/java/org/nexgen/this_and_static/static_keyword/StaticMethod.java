package org.nexgen.this_and_static.static_keyword;

class MathUtil {
    static int square(int x) {
        return x * x;
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        System.out.println("Square of 5: " + MathUtil.square(5));
    }
}
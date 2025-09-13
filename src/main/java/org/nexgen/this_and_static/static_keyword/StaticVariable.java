package org.nexgen.this_and_static.static_keyword;

class Counter {
    static int count = 0;

    Counter() {
        count++;
    }

    void display() {
        System.out.println("Count: " + count);
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        c3.display(); // Output: Count: 3
    }
}
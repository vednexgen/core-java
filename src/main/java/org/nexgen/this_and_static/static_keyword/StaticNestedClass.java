package org.nexgen.this_and_static.static_keyword;

class Outer {
    static class Inner {
        void display() {
            System.out.println("Inside static nested class");
        }
    }
}

public class StaticNestedClass {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();
        obj.display();
    }
}
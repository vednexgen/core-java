package org.nexgen.access.modifier.default_am.pack_one;

public class TestDefault {
    public static void main(String[] args) {
        DefaultExample obj = new DefaultExample();
        obj.showMessage(); // Works because in same package
    }
}
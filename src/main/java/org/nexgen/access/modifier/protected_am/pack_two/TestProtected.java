package org.nexgen.access.modifier.protected_am.pack_two;

public class TestProtected {
    public static void main(String[] args) {
        Child child = new Child();
        child.display(); // Works

        // ProtectedExample obj = new ProtectedExample();
        // obj.showMessage(); // ❌ Not accessible without inheritance
    }
}
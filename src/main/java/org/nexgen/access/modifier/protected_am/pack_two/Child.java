package org.nexgen.access.modifier.protected_am.pack_two;


import org.nexgen.access.modifier.protected_am.pack_one.ProtectedExample;

class Child extends ProtectedExample {
    public void display() {
        showMessage(); // Accessible because of inheritance
    }
}

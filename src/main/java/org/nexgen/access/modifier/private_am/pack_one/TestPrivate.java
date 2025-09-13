package org.nexgen.access.modifier.private_am.pack_one;

public class TestPrivate {
    public static void main(String[] args) {
        PrivateExample obj = new PrivateExample();
        obj.display();  // Works because public method calls private method

//         obj.showMessage(); // ❌ Not accessible directly
    }
}
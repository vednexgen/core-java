package org.nexgen.access.modifier.public_am.pack_two;


import org.nexgen.access.modifier.public_am.pack_one.PublicExample;

public class TestPublic {
    public static void main(String[] args) {
        PublicExample obj = new PublicExample();
        obj.message = "I am accessed publicly...";
        obj.showMessage(); // Accessible everywhere
    }
}
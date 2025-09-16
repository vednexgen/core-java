package org.nexgen.inheritance_and_super.super_keyword;

class ParentConstructor {
    ParentConstructor() {
        System.out.println("Parent class constructor");
    }
}

class ChildConstructor extends ParentConstructor {
    ChildConstructor() {
        super();
        System.out.println("Child class constructor");
    }
}

public class ParentClassConstructor {
    public static void main(String[] args) {
        ChildConstructor obj = new ChildConstructor();
    }
}
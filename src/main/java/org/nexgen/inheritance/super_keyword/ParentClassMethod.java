package org.nexgen.inheritance.super_keyword;

class ParentMethod {
    void show() {
        System.out.println("ParentMethod's show method");
    }
}

class ChildMethod extends ParentMethod {
    void show() {
        System.out.println("ChildMethod's show method");
        super.show();
    }
}

public class ParentClassMethod {
    public static void main(String[] args) {
        ChildMethod obj = new ChildMethod();
        obj.show();
    }
}
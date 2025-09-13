package org.nexgen.inheritance.super_keyword;

class ParentVariable {
    int num = 100;
}

class ChildVariable extends ParentVariable {
    int num = 200;

    void display() {
        System.out.println("ChildVariable num: " + num);
        System.out.println("ParentVariable num: " + super.num);
    }
}

public class ParentClassVariable {
    public static void main(String[] args) {
        ChildVariable obj = new ChildVariable();
        obj.display();
    }
}
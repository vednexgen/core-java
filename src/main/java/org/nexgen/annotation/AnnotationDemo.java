package org.nexgen.annotation;

public class AnnotationDemo {

    @TestInfo(author = "Alice", priority = 2)
    public void testMethod() {
        System.out.println("Test Method executed.");
    }
}
package org.nexgen.annotation;

import java.lang.reflect.Method;

public class AnnotationProcessor {
    public static void main(String[] args) throws Exception {
        Method method = AnnotationDemo.class.getMethod("testMethod");
        if (method.isAnnotationPresent(Info.class)) {
            Info info = method.getAnnotation(Info.class);
            System.out.println("Author: " + info.author());
            System.out.println("Priority: " + info.priority());
        }
    }
}
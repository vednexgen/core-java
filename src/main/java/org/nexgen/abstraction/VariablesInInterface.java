package org.nexgen.abstraction;

interface Config {
    int MAX_USERS = 100; // implicitly public, static, final
    String APP_NAME = "MyJavaApp"; // implicitly public, static, final
}

public class VariablesInInterface {
    public static void main(String[] args) {
        System.out.println("Max Users: " + Config.MAX_USERS);
        System.out.println("App Name: " + Config.APP_NAME);
    }
}
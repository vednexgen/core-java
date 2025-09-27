package org.nexgen.lambda_stream.lambda;

@FunctionalInterface
interface MyFunctionalInterface {
    void display();
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        MyFunctionalInterface msg = () -> System.out.println("Hello from Lambda!");
        msg.display();
    }
}
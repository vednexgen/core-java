package org.nexgen.lambda_stream.lambda;

@FunctionalInterface
interface MyFunctionalInterface {
    void display(Person person);
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        MyFunctionalInterface msg = (person) -> System.out.println("Name :: " + person.getName());
        msg.display(new Person("VedNexGen"));
    }
}
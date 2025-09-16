package org.nexgen.abstraction;

interface Vehicle {
    void start();
    void stop();

    // Default method (Java 8+)
    default void fuel() {
        System.out.println("Vehicle needs fuel");
    }

    // Static method (Java 8+)
    static void service() {
        System.out.println("Vehicle service in progress");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}

public class CustomInterface {
    public static void main(String[] args) {
        Vehicle v1 = new Car();

        v1.start();
        v1.stop();
        v1.fuel(); // calling default method

        Vehicle.service(); // calling static method
    }
}
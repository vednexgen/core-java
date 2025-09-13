package org.nexgen.objects.car;

public class Main {
    public static void main(String[] args) {
        // creating an object of Car
        Car myCar = new Car();

        // setting values
        myCar.color = "Red";
        myCar.speed = 100;

        // calling method
        myCar.drive();
    }
}
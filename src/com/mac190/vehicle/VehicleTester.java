package com.mac190.vehicle;

public class VehicleTester {
    public static void main(String[] args) {
        //create a BMW
        BMW yourCar = new BMW("123FD34", "X5", "Gray");
        System.out.println("Your car: " + yourCar);

        Tesla yourTesla = new Tesla("123FGH455", "Model 3", "White");
        System.out.println("Your tesla: " + yourTesla);
        //use a reference to a Vehicle to drive the BMW.
        Vehicle V = yourCar;
        V.moveForward();
        try {
            V.speedUp(120);
            V.speedUp(20);
        }catch (Exception e){
            System.out.println("Cauggt an exception: " + e.getMessage());
        }
        //TODO: catch ohter unchecked exceptions in the the right order.
        System.out.println("Your car: " + yourCar);
        //Moving the referrence V from the BMW to the Tesla
        V = yourTesla;
        V.moveForward();
        try {
            V.speedUp(130);
        }catch (Exception e){
            System.out.println("Caught an exception: " + e.getMessage());
        }
        //TODO: Catch other exceptions
        System.out.println("V: " + V);
        V.moveBackwards();
        // Ho to use an interface
        iDrive driver = yourCar;
        //only methods defined in the interface can be accessed using
        //the interface no other setter ot getter of variables
        driver.moveForward();
        driver.brake();
        driver.moveForward();
        //An interface can move from one object to another object
        driver = yourTesla;
        System.out.println("driver: " + driver);
        try {
            driver.speedUp(40);
        }catch (Exception e){
            System.out.println("Caught an exception: " + e.getMessage());
        }
//TODO: catch the ohter excetions in the right order.
    }
}

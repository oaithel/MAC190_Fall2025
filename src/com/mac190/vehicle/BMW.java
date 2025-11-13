package com.mac190.vehicle;
/*
Design a class BMW, that is a Vehicle, in adition it has the following:
FuelType is gas
Make is "BMW"
Model (example "X6")
It has a Color and number of seats as well.

Implement the methods as follows:
turnLeft, just display turning left the degree amount
same for turn right
Brake implement it so that the car is in stop mode
moveForward implement it so that the car moves forward only if it was in state
stopping state already
Same for moveBackwards
implement speedUp to increase the speed by the input
and display the speed, limit the speed to 100miles/hour
speedUp only increases the speed if it is movingForward.

Test your class.

 */
public class BMW extends Vehicle{
    //TODO: Continue implement BMW, Tesla classes and test them


    @Override
    void turnRight(double degrees) {

    }

    @Override
    void turnLeft(double degrees) {

    }

    @Override
    void brake() {

    }

    @Override
    boolean speedUp(double speed) {
        return false;
    }

    @Override
    boolean moveBackwards() {
        return false;
    }

    @Override
    boolean moveForward() {
        return false;
    }
}

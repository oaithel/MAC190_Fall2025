package com.mac190.vehicle;

import java.util.Objects;

/*
Design a class BMW, that is a Vehicle, in adition it has the following:
FuelType is gas
Make is "BMW"
Model (example "X6")
It has a Color and number of seats as well.

Implement the methods as follows:
turnLeft, just display turning left the degree amount
same for turn right
Brake implement it so that the car is not in stop mode and put in stop mode
moveForward implement it so that the car moves forward only if it was in state
stopping state already
Same for moveBackwards
implement speedUp to increase the speed by the input
and display the speed, limit the speed to 100miles/hour
speedUp only increases the speed if it is movingForward.

Test your class.

Modify the class so that it throws a checked exception if the speed is about to go above 100.
Modify the tester to catch the exception.

 */
public class BMW extends Vehicle implements iDrive{
    //TODO: Continue implement BMW, Tesla classes and test them
    private String color, model;
    private State state;
    private double speed;

    public BMW(){
        super("N/A", "BMW","GAS");
        model = "N/A";
        color = "N/A";
        state = State.STOP;
        speed = 0;

    }
    public BMW(String v, String m, String c){
        super(v, "BMW","GAS");
        model = m;
        color = c;
        state = State.STOP;
        speed = 0;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "BMW{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", state=" + state +
                ", speed=" + speed +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof BMW bmw)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(color, bmw.color) && Objects.equals(model, bmw.model);
    }


    @Override
    public void turnRight(double degrees) {
        System.out.println("My BMW is truning right " + degrees + " degrees");
    }

    @Override
    public void turnLeft(double degrees) {
        System.out.println("My BMW is truning right " + degrees + " degrees");
    }

    @Override
    public void brake() {
        if(state == State.STOP){
            System.out.println("The car in in stop state already");
            return;
        }
        System.out.println("Stopping...");
        state = State.STOP;
        speed = 0;
    }

    @Override
    public boolean speedUp(double speed) throws Exception{
        if (state == State.MOVINGFORWAD && this.speed < 100) {
            this.speed = Math.min((this.speed + speed), 100);
            System.out.println("Driving at " + this.speed + " miles/hour");
            return true;
        } else {
            System.out.println("Cannot speed!");
            if (this.speed >= 100) {
                //throw exception
                throw new Exception("BMW: We are already past 100 miles/hour");
            }
            if (state == State.MOVINGBACKWARD) {
                //throw an unchecked exception with message "Moving backwards cannot speed"

            }
        }
        return false;
    }

    @Override
    public boolean moveBackwards() {
        if(state == State.STOP){
            System.out.println("Moving backwards, pay attention");
            state = State.MOVINGBACKWARD;
            return true;
        }
        if(state == State.MOVINGBACKWARD){
            System.out.println("We are already moving backwards");
            return false;
        }
        System.out.println("Moving forward, cannot move backwards before stopping");
        return false;
    }

    @Override
    public boolean moveForward() {
        if(state == State.STOP){
            System.out.println("Moving forward at initial speed of: 10 m/h");
            speed = 10;
            state = State.MOVINGFORWAD;
            return true;
        }
        if(state == State.MOVINGFORWAD){
            System.out.println("Already moving forward");
            return false;
        }
        System.out.println("Moving backward, need to stop first");
        return false;
    }
}

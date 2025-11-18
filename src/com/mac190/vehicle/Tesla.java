package com.mac190.vehicle;

import java.util.Objects;

/*
Design a class Tesla, that is a Vehicle, in addition it has the following:
FuelType is electric
Make is "Tesla"
Model of the car
It has a Color and number of seats as well.

Implement the methods as follows:
turnLeft, just display turning left the degree amount
same for turn right
Brake implement it so that the car is in stop mode
moveForward implement it so that the car moves forward only if it was in state
stopping state already
Same for moveBackwards
implement speedUp to increase the speed by no more than 10miles/hour
or the input and display the speed, limit the speed to 80miles/hour
speedUp only increases if it is movingForward.

Test your class.

 */
public class Tesla extends Vehicle implements iDrive{

    private String color, model;
    private State state;
    private double speed;

    public Tesla(){
        super("N/A", "Tesla","ELECTRIC");
        model = "N/A";
        color = "N/A";
        state = State.STOP;
        speed = 0;

    }
    public Tesla(String v, String m, String c){
        super(v, "Tesla","ELECTRIC");
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
        return "Tesla{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", state=" + state +
                ", speed=" + speed +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Tesla tsla)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(color, tsla.color) && Objects.equals(model, tsla.model);
    }


    @Override
    public void turnRight(double degrees) {
        System.out.println("My Tesla is truning right " + degrees + " degrees");
    }

    @Override
    public void turnLeft(double degrees) {
        System.out.println("My Tesla is truning right " + degrees + " degrees");
    }

    @Override
    public void brake() {
        if(state == State.STOP){
            System.out.println("The tesla car in in stop state already");
            return;
        }
        System.out.println("Stopping...");
        state = State.STOP;
        speed = 0;
    }

    @Override
    public boolean speedUp(double speed) {
        if (state == State.MOVINGFORWAD && this.speed < 80) {
            this.speed = Math.min((this.speed + Math.min(speed, 10)), 80);
            System.out.println("Driving at " + this.speed + " miles/hour");
            return true;
        } else {
            System.out.println("Cannot speed!");
            if (speed >= 80) {
                System.out.println("limit speed reached");
                return false;
            }
            if (state == State.MOVINGBACKWARD) {
                System.out.println("Moving backwards");
                return false;
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

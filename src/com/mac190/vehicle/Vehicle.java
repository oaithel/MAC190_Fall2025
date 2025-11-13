package com.mac190.vehicle;

import java.util.Objects;

/*
Design a n abstract class Vehicle that has the following:
VIN number,
Make (the brand)
FuelType

Methods, you want any derived class to implement the following methods
void turnRight(double degrees);
void turnLeft(double degrees);
void brake(); //puts the car into a stop mode.
boolean speedUp(double speed);
boolean moveBackwards();
boolean moveForward();

 */
abstract class Vehicle {
    private String VIN, make, fuelType;

    public Vehicle(){
        VIN = "N/A";
        make = "N/A";
        fuelType = "N/A";
    }
    public Vehicle(String v, String m, String f){
        VIN = v;
        make = m;
        fuelType = f;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "VIN='" + VIN + '\'' +
                ", make='" + make + '\'' +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Vehicle ve)) return false;
        return Objects.equals(VIN, ve.VIN) && Objects.equals(make, ve.make) && Objects.equals(fuelType, ve.fuelType);
    }

    abstract void turnRight(double degrees);
    abstract void turnLeft(double degrees);
    abstract void brake(); //puts the car into a stop mode.
    abstract boolean speedUp(double speed);
    abstract boolean moveBackwards();
    abstract boolean moveForward();

}

package com.mac190.composition;

import java.util.Objects;

/*
Design a class Rectangle that has the following properties:
1- double length and width
2- default constructor set both to 0
3- constructor that accepts one input set both to that input, if negative
set it to absolute value
4- constructor that accepts two inputs, first for length and second for width
set to absolute value if negative
5- setters getters for length and width
6- toString and equals.
7- method static Rectangle add (Rectangle r, double a) returns a Rectangle similar to r with
length and width augmented by a
8- method rectangle add (rectangle r) that returns a rectangle that is the sum
of the two rectangles r and this
9- Method to return perimeter
10- method to return area
 */
public class Rectangle {
    private double length, width;

    public Rectangle(){
        this.setLength(0);
        this.setWidth(0);
    }
    public Rectangle(double a){
        this.setLength(a);
        this.setWidth(a);
    }
    public Rectangle(double a, double b){
        this.setLength(a);
        this.setWidth(b);
    }
    public double getLength() {
        return length;
    }

    public void setLength(double len) {
        this.length = Math.abs(len);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double wid) {
        this.width = Math.abs(wid);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }

    @Override
    public boolean equals(Object obj) {
        if(!obj.getClass().equals(this.getClass()))
            return false;
        Rectangle rec = (Rectangle) obj; //cast obj into a Rectangle object
        //comparate this and rec

        if((Double.compare(this.length, rec.length) ==0) && (Double.compare(this.width, rec.width) == 0)){
            return true;
        }
        return false;
    }
    public static Rectangle add(Rectangle r, double a) {
        //create a new Rectangle with length of r plus a same for width
        Rectangle R1 = new Rectangle(r.length + a, r.width + a);
        //return it
        return R1;
    }

    //this returned a Rectangle that is the sum of this and r
    //sum lengths and widths together.
    public Rectangle add (Rectangle r){
        //how many input object do we have? Two: r and this
        //The output is a third Rectangle object which is the sum of the two
        Rectangle R1 = new Rectangle(this.length + r.length, this.width + r.width);
        return R1;
    }
    public static Rectangle add(Rectangle r1, Rectangle r2){
        Rectangle R1 = new Rectangle(r1.length + r2.length, r1.width + r2.width);
        return R1;
    }
    public double perimeter(){
        return 2*this.length + 2*this.width;
    }
    public double area(){
        return this.length*this.width;
    }
}

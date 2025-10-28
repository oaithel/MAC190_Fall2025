package com.mac190.midtermreview;

import java.util.Objects;

/*
Implement the class iCircle using inheritance. We know that every Circle is
a point since every circle has a center (one to one correspondence)
iCircle will inherite every member variable and method of Point
 */
public class iCircle extends Point{
    private double radius;

    public iCircle(){
        //create the default Point in iCircle
        super();
        radius = 0;
    }
    public iCircle(Point p, double r){
        super(p); // use the copy constructor of Point
        radius = r;
    }
    public iCircle(double a, double b, double r){
        super(a, b);
        radius = r;
    }
    //copy constructor of a Circle
    public iCircle(iCircle c){
        //make a copy of the center of c
        super(c);//because c is a Point
        radius = c.radius;
    }
    public Point getCenter() {
        return this; //this is a Point and iCircle
    }

    public void setCenter(Point center) {
        this.setX(center.getX());
        this.setY(center.getY());
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //setX, setY getX and getY are inherited from Point class, no need to redefine them

    @Override
    public String toString() {
        return "{" + super.toString() + ", " + radius +"}";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof iCircle)) return false;
        iCircle ic = (iCircle) o;
        return (Double.compare(radius, ic.radius) == 0 && super.equals(ic));
    }

    public double area(){
        return Math.PI* Math.pow(radius, 2);
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public iCircle add(iCircle c){
        //adding this and c to create a third Circle.
        iCircle res = new iCircle(Point.add(this, c), this.radius + c.radius);
        return res;
    }
    public static iCircle add(iCircle C1, iCircle c){
        //adding this and c to create a third Circle.
        iCircle res = new iCircle(Point.add(C1, c), C1.radius + c.radius);
        return res;
    }
}

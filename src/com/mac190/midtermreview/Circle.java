package com.mac190.midtermreview;

import java.util.Objects;

public class Circle {
    private Point center;
    private double radius;

    public Circle(){
        center = new Point();
        radius = 0;
    }
    public Circle(Point p, double r){
        center = new Point(p); // use the copy constructor of Point
        radius = r;
    }
    public Circle(double a, double b, double r){
        center = new Point(a, b);
        radius = r;
    }
    //copy constructor of a Circle
    public Circle(Circle c){
        //make a copy of the center of c
        center = new Point(c.center);
        radius = c.radius;
    }
    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getX(){
        return center.getX();
    }
    public double getY(){
        return center.getY();
    }
    public void setX(double a){
        center.setX(a);
    }
    public void setY(double a){
        center.setY(a);
    }

    @Override
    public String toString() {
        return "{" + center.toString() + ", " + radius +"}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(radius, circle.radius) == 0 && Objects.equals(center, circle.center);
    }
    public double area(){
        return Math.PI* Math.pow(radius, 2);
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public Circle add(Circle c){
        //adding this and c to create a third Circle.
        Circle res = new Circle(Point.add(this.center, c.center), this.radius + c.radius);
        //OR using the non-static add method in Point
        //Circle res = new Circle(this.center.add(c.center), this.radius + c.radius);

        return res;
    }
    public static Circle add(Circle C1, Circle c){
        //adding this and c to create a third Circle.
        Circle res = new Circle(Point.add(C1.center, c.center), C1.radius + c.radius);
        //OR using the non-static add method in Point
        //Circle res = new Circle(C1.center.add(c.center), C1.radius + c.radius);

        return res;
    }
}

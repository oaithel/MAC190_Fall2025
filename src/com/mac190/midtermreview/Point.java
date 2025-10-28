package com.mac190.midtermreview;

import java.util.Objects;

public class Point {
    private double X, Y;

    public Point(){
        this.X = this.Y = 0;
    }
    public Point(double a){
        this.X = a;
        this.Y = a;
    }
    public Point(double a, double b){
        this.X = a;
        this.Y = b;
    }
    //copy constructor
    public Point(Point p){
       this.X = p.X;
       this.Y = p.Y;
    }
    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        Y = y;
    }

    @Override
    public String toString() {
        return "(" + X +", " + Y +")";
    }

    public boolean equals(Object o) {
        if (o == null || !(o instanceof Point)) return false;
        Point p = (Point) o;
        return Double.compare(this.X, p.X) == 0 && Double.compare(this.Y, p.Y) == 0;
    }

    public double distance(Point p){
        return Math.sqrt(Math.pow(this.X-p.X, 2) + Math.pow(this.Y-p.Y, 2));
    }

    //add method non-static
    public Point add(Point p){
        Point res = new Point((this.X + p.X)/2, (this.Y + p.Y)/2);
        return res;
    }
    //static add
    public static Point add(Point P1, Point p){
        Point res = new Point((P1.X + p.X)/2, (P1.Y + p.Y)/2);
        return res;
    }

}

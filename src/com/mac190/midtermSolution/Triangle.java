package com.mac190.midtermSolution;

public class Triangle {
    private double base, height;

    public Triangle(){
        base = height = 0;
    }
    public Triangle(double b, double h) {
        base = b;
        height = h;
    }
    public Triangle(double b) {
        base = b;
        height = b;
    }
    //copy constructor
    public Triangle(Triangle t){
        base = t.base;
        height = t.height;
    }
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double area(){
        return (1.0/2.0)*base*height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
    public boolean equals(Triangle t){
        if(t == null) return false;
        return (this.base == t.base && this.height == t.height);
    }
    public Triangle add(Triangle t){
        //we have two Triangle objects: this and t
        //we make a third one
        Triangle newTriangle = new Triangle(this.base+t.base, (this.height+t.height)/2.0);
        return newTriangle;
    }
    public static Triangle add(Triangle s, Triangle t){
        //we have two Triangle objects: s and t
        //we make a third one
        Triangle newTriangle = new Triangle(s.base+t.base, (s.height+t.height)/2.0);
        return newTriangle;
    }
}

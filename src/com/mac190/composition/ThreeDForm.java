package com.mac190.composition;

import java.util.Objects;

/*
design a class ThreeDForm that has the following properties:
1- a private member base which is a Rectangle object as the base
of the ThreeDForm and a height which is a double.
2- Default constructor where you create a default rectangle as base and
height 0
3- Constructor that accepts one double, constructs the base with one input
and height set to the input
4- constructor that accepts a rectangle and a double sets base to the rectanfgle
and height to the double.
5- setters: setLength(double l) , setWidth(double w), setHeight(double h)
setBase(Rectangle b)
6- getters: double getLength(), double getWidth(), double getHeight(),
Rectangle getBase()
7- toString [(lenght, width), height]
8- equals, use methods defined in rectangle class whenever possible
9- ThreeDForm add (int a) returns a threeDForm same as this with
all sides augmented by a
10- static ThreeDForm add(ThreeDForm t1, ThreeDForm t2) returns a ThreeDForm
that is the sum of t1 and t2.
11- method volume, which is the area of the base multiplied by the height
11- In a tester ShapeTester, test both classes extensively.
 */
public class ThreeDForm {
    private Rectangle base;
    private double height;

    //constructors
    public ThreeDForm(){
        base = new Rectangle();
        height = 0;
    }
    public ThreeDForm(double a){
        base = new Rectangle(a);
        height = Math.abs(a);
    }

    public ThreeDForm(Rectangle r, double a){
        base = new Rectangle(r.getLength(), r.getWidth()); //this is a preference
        //so that you have an object independent of r.
        height = Math.abs(a);
    }

    public Rectangle getBase() {
        return base;
    }
    public void setBase(Rectangle base) {
        this.base = base;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = Math.abs(height);
    }
    public double getLength(){
        return base.getLength();
    }
    public void setLength(double l){
        base.setLength(l);
    }
    public double getWidth(){
        return base.getWidth();
    }
    public void setWidth(double l){
        base.setWidth(l);
    }

    @Override
    public String toString() {
        return "ThreeDForm{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ThreeDForm that = (ThreeDForm) o;
        return Double.compare(height, that.height) == 0
                && this.base.equals(that.getBase());
    }
    //ThreeDForm add (int a) returns a threeDForm same as this with
    //all sides augmented by a

    public ThreeDForm add(int a){
        ThreeDForm T = new ThreeDForm(Rectangle.add(this.base, a), this.height+a);
        return T;
    }

    //10- static ThreeDForm add(ThreeDForm t1, ThreeDForm t2) returns a ThreeDForm
    //that is the sum of t1 and t2.
    public static ThreeDForm add(ThreeDForm T1, ThreeDForm T2){
        ThreeDForm T3 = new ThreeDForm(T1.base.add(T2.base), T1.height + T2.height);
        return T3;
    }
    public double volume(){
        return this.base.area()*this.height;
    }

}

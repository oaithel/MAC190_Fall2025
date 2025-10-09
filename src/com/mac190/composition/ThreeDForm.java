package com.mac190.composition;
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
11- In a tester ShapeTester, test both classes extensively.
 */
public class ThreeDForm {
    private Rectangle base;
    private double height;
}

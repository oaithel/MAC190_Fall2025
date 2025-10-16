package com.mac190.composition;
/*
Test both classes in this tester.
 */
public class ShapeTester {
    static void main() {
        //create a default Rectangle
        Rectangle R1 = new Rectangle();
        //show it
        System.out.println("R1: " + R1);
        //set length to 4 width to 2
        R1.setWidth(2);
        R1.setLength(4);
        System.out.println("R1: " + R1 + " Perim: " + R1.perimeter() + " area: " + R1.area());
        //create ThreeDForm all sides same 5
        ThreeDForm T1 = new ThreeDForm(5);
        System.out.println("T1: " + T1);
        //display the perim nd area of the base of T1
        System.out.println("T1 base perim: " + T1.getBase().perimeter() + " T1 base area: " + T1.getBase().area());

        //add 5 to R1

        //create R2 a Rectangle with 3 and 4, display it

        //create R3 that is the sum of R1 and R2, display it

        //Create T2 a ThreeDForm with R2 and 4, display it

        //add T2 to T1, display both

        //create R4 that is the sum of the bases of T1 and T2, display it.

    }
}

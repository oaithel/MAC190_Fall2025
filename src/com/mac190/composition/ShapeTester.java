package com.mac190.composition;

import org.w3c.dom.css.Rect;

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
        R1 = Rectangle.add(R1, 5);
        System.out.println("R1: " + R1);
        //create R2 a Rectangle with 3 and 4, display it
        Rectangle R2 = new Rectangle(3, 4);
        System.out.println("R2: " + R2);
        //create R3 that is the sum of R1 and R2, display it
        //Rectangle R3 = R1.add(R2);
        //same as above using the static add method
        Rectangle R3 = Rectangle.add(R1, R2);
        System.out.println("R3: " + R3);
        //Create T2 a ThreeDForm with R2 and 4, display it
        ThreeDForm T2 = new ThreeDForm(R2, 4);
        System.out.println("T2: " + T2);
        //add T2 to T1, display both
        T1 = ThreeDForm.add(T1, T2);
        System.out.println("T1: " + T1 + " T2: " + T2);
        //create R4 that is the sum of the bases of T1 and T2, display it.
        Rectangle R4 = T1.getBase().add(T2.getBase());
        System.out.println("R4: " + R4);
    }
}

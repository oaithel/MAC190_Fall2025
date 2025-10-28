package com.mac190.midtermreview;

public class MidtermTester {
    static void main() {
        Point P1 = new Point();
        System.out.println("P1: " + P1);
        P1.setX(2);
        P1.setY(4);
        System.out.println("P1: " + P1);
        Point P2 = new Point(3, 6);
        System.out.println("P1: "+ P1 + " P2: " + P2 + "  Distance P1-P2: " + P1.distance(P2));
        //create a midPoint between P1 and P2
        Point P3 = P1.add(P2);
        //Using the static method
        //Point P3 = Point.add(P1, P2);
        System.out.println("P3: " + P3);
        iCircle C1 = new iCircle(P1, 2);
        System.out.println("C1: " + C1 + " area: " + C1.area() + " perim: " + C1.perimeter());
        //create a copy of C1
        iCircle C2 = new iCircle(C1);
        System.out.println("C2: " + C2 + " area: " + C2.area() + " perim: " + C2.perimeter());
        if(C1.equals(C2)){
            System.out.println("C1 is same as C2");
        }else{
            System.out.println("Problem C1 is not same as C2");
        }

        //change the x of the center of C1 to 4.1, through the center, don't use
        //the setX of Circle
        C1.getCenter().setX(4);
        System.out.println("C1: " + C1 + " area: " + C1.area() + " perim: " + C1.perimeter());
        //compute the distance from the center of C1 and the center of C2
        double d = C1.getCenter().distance(C2.getCenter());
        System.out.println("Distance from center of C1 to center of C2 is: " + d);
        Point P4 = new Point(4, 4);

        if(C1.equals(P4)){
            System.out.println("C1 is same as P4");
        }else{
            //will be false because P4 is not an instance of iCircle
            System.out.println("C1 is of course not same as P4");
        }

        if(P4.equals(C1)){
            //will be true because C1 is an instance of Point and
            //the two points are equal.
            System.out.println("P4 is same as C1");
        }else{
            System.out.println("P4 is not same as C1");
        }
    }
}

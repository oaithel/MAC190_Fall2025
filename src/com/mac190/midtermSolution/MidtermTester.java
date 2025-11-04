package com.mac190.midtermSolution;

public class MidtermTester {
    public static void main(String[] args) {
        //create a Triangle
        Triangle T1 = new Triangle(2, 3);
        Triangle T2 = new Triangle(4, 5);
        Triangle T3 = T1.add(T2);
        System.out.println("T3: " + T3);
        //add T1 to T2 using static add method:
        System.out.println("T2: " + T2 + " T1: " + T1);
        T2 = Triangle.add(T2, T1);
        System.out.println("T2: " + T2 + " T1: " + T1);
        Pyramid P1 = new Pyramid(T1, 5);
        Pyramid P2 = new Pyramid(2, 3, 5);
        System.out.println("P1: " + P1 + " P2: " + P2);
        if(P1.equals(P2)){
            System.out.println("P1 is same as P2");
        }else{
            System.out.println("P1 is not same as P2");
        }
        //create P3 as the sum of P1 and P2, using non-static
        Pyramid P3 = P1.add(P2);
        //using static
        //Pyramid P3 = Pyramid.add(P1, P2);
        System.out.println("P3: " + P3);

    }
}

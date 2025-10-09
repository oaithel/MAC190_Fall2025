package com.mac190.maxmin;

public class MaxMinTester {
    public static void main(String[] args) {
        //create a default MaxMin M1
        MaxMin M1 = new MaxMin();
        System.out.println("M1: " + M1);
        //set min to 2 and max to 6
        M1.setMaxMin(2, 6);
        System.out.println("M1: " + M1);
        //set min to 10
        M1.setMin(10);
        System.out.println("M1: " + M1);
        MaxMin M2 = new MaxMin(5, 1);
        System.out.println("M2: " + M2);
        //Trace
        M1.add(3);
        System.out.println("M1: " + M1); // (6, 10) add does not change M1
        M2.add(M1);
        System.out.println("M2: " + M2); //(1, 5) add will not change M1 or M2
        MaxMin M3 = MaxMin.add(M1, M2);
        System.out.println("M3: " + M3); //(7, 15 we creating a new object
        //add 3 to M1
        M1 = M1.add(3);
        System.out.println("M1: " + M1);
        //Add M1 to M2
        M2 = M2.add(M1);
        System.out.println("M2: " + M2); //(10, 18)
        //Same question using the static add method, add M1 to M2 using the static method
        M2 = MaxMin.add(M2, M1);
        System.out.println("M2: " + M2);
    }
}

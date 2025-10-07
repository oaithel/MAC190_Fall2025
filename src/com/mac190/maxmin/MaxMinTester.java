package com.mac190.maxmin;

public class MaxMinTester {
    static void main() {
        //create a default MaxMin M1
        MaxMin M1 = new MaxMin();
        System.out.println("M1: " + M1);
        //set min to 2 and max to 6
        M1.setMaxMin(2, 6);
        System.out.println("M1: " + M1);
        //set min to 10
        M1.setMin(10);
        System.out.println("M1: " + M1);
    }
}

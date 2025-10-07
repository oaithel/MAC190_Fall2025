package com.mac190.prime;

public class PrimeTester {
    static void main() {
        //create a default prime object call it P1
        Prime P1 = new Prime();
        System.out.println("P1: " + P1);
        //set P1 to 9
        P1.setPrime(9);
        System.out.println("P1: " + P1);
        //create a Prime with value 8
        Prime P2 = new Prime(8);
        System.out.println("P2: " + P2);
        if(P1.equals(P2)){
            System.out.println("P1 is equal to P2");
        }else{
            System.out.println("P1 is Not equal to P2");
        }
//change
        //add 4 to P1
        P1 = P1.add(4);
        System.out.println("P1: " + P1);
        //create a new object P3 that is P2 augmented by 10
        Prime P3 = P2.add(10);
        System.out.println("P2: " + P2 + " P3: " + P3);
        //add P1 to P2
        P2 = P2.add(P1);
        System.out.println("P2: " + P2 + " P1: " + P1);
    }
}

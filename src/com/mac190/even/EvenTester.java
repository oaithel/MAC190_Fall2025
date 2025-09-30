package com.mac190.even;

public class EvenTester {
    public static void main(String[] args) {
        //create an Even object E1.
        Even E1 = new Even();
        //display it using the toString
        System.out.println("E1: " + E1);
        //set it to 9
        E1.setEven(9);
        //display it.
        System.out.println("E1: " + E1);
        //Create an Even object with value 11 right when you create it.
        Even E2 = new Even(11);
        System.out.println("E2: " + E2);
        //create a new Object that is E1 added to it 5, call it E3.
        Even E3 = E1.add(5); //this is the object on which a method is invoked. In this case
        //add method is invoked on E1
        //display it.
        System.out.println("E1: " + E1 + " E3: " + E3);
        E2.add(9); //here this is E2
        System.out.println("E2: " + E2); //E2 will be 12. add methods returned a new
        //object with even = 22, but it's not used and destroyed
        //To change E2 we do this
        E2 = E2.add(9);
        System.out.println("E2: " + E2);
        //adding two Even objects
        E3 = E1.add(E2);
        System.out.println("E3: " + E3 + " E2: " + E2 + " E1: " + E1);

    }
}

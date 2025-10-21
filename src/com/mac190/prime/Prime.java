package com.mac190.prime;
/*
Design a class Prime that has the following properties:
1- One integer private member variable prime that is prime at all times.
2- A default constructor that sets prime to the first prime: 2.
3- A constructor that accepts an input and sets prime to that input if it's prime
otherwise it sets prime to the first prime number larger than the input. In constructors always
use setters.
4- setter to set prime to a given input if it's prime else it will be set to the first prime
larger than the input.
5- getter
6- toString
7- public boolean equals that accepts a Prime objects, returns true if this and the input
Prime objects are equal.
8- public Prime add(int a) that returns a new Prime object that is the sum of this and a
9- public Prime add( Prime p) returns a Prime object that is the sum of this and p.
10 - In a separate tester, test your class extensively!!.


 */
public class Prime {
    protected int prime;

    //default constructor
    public Prime(){
        prime = 2;
    }
    //constructor that accepts an integer and sets prime to the closest prime
    //to that integer
    public Prime(int p){
        //call the setter
        this.setPrime(p);
    }

    //getters and setters
    public int getPrime(){
        return this.prime;
    }
    public void setPrime(int pri){
        while(!isPrime(pri)){
            pri++;
        }
        //at the end of the loop a will be prime
        this.prime = pri;
    }

    //Use the following method to decide if a number is prime or not.
    public static boolean isPrime(int n) {
        //if the number is smaller than 2 return false.
        if(n < 2) {
            return false;
        }
        //if the number is 2 return true.
        if(n == 2) {
            return true;
        }
        //if the number is even return false;
        if(n % 2 == 0){
            return false;
        }
        //go through a loop from 3 to the squareRoot of the number (inclusive) by steps of 2 (3, 5, 7)
        for(int i = 3; i <= Math.sqrt(n); i+= 2) {
            //if number is divisible by i, then return false;
            if(n%i == 0){
                return false;
            }
        }
        //At the end of loop, return true.
        return true;
    }
    public String toString(){
        return "prime: " + prime;
    }

    public boolean equals(Prime p){
        //How many objects do you have here?
        //there are two objects: p and this
        if(this.prime == p.prime){
            return true;
        }else{
            return false;
        }
    }
//change
    public Prime add(int a){
        //How many Prime objects are there?: this and the one you create
        // and return
        //create a Prime object
        Prime P = new Prime(a + this.prime);
        return P;
    }
    public Prime add(Prime p){
        //How many Prime objects are there?: Three: this, p and the one you create
        // and return
        //create a Prime object
        Prime res = new Prime(p.prime + this.prime);
        return res;
    }

}

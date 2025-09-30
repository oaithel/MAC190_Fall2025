package com.mac190.even;
/*
Design and code a class Even that has the following properties:
One private member integer that is even at all times, call it even.
-getter for even
-setter, the setter should work in a way that if the input is not even then it's added one
to make it even.
- method String toString() returns the object as a string:
public String toString() {
    //create a string st.
    //add to it any attribute from the object (any value of your variables in the form
    you want it to be displayed)
    //return the string.
 }

 - method public Even add(int n): returns the object Even that is same as this object augmented
 by n.
 public Even add(int n) {
    //create an Even object.
    //set it to even + n.

    //return the object.
}
In a seprate tester class, test your Even class.

Constructors
Overloading
The concept of "this"
 */
public class Even {
    private int even;

    //A constructor is amethod without a type with the same name as the class.
    //it allows you to construct objects with initial attributes.
    //The constructor that does not accept inputs is the default constructor

    //default constructor
    public Even(){
        even = 2;
    }
    //Constructor that accepts a value
    public Even(int num){
        this.setEven(num);
    }

    //setter getter
    public int getEven(){
        return even;
    }
    public void setEven(int a){
        if(a % 2 == 1){
            a++;
        }
        even = a;
    }

    public String toString(){
        return "even: " + even;
    }

    //add method to add a number to an existing Even object and return the new object
    public Even add(int a){
        //create Even object
        Even E = new Even(this.even + a);
        return E;
    }
    public Even add(Even a){
        //How many Even object are there here? three: a, this and E the object we return
        //create Even object
        Even E = new Even(this.even + a.getEven());
        return E;
    }

    //The sme method name used with different paremeters is called overloading.
    //You can overload as long as the input parameters are of different type or different
    //number. You cannot overload solely based on the return type.
    //Example  public Even add(int a) and public int add(int a) is not allowed
    //You cannot overload based ONLY on the return value
}

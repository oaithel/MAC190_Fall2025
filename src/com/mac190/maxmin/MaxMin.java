package com.mac190.maxmin;
/*
Design and code a class MaxMin that has the following properties:
Two integer member variables max and min where min is always smaller
than max.
//default constructor to set both to 0
//constructor that accepts one value and stes both to that value
//constructor that accepts two values and set min to the smallest
and max to the largest.

//getters for min and max
//setter setMinMax that accepts two values and sets min to smallest and max to largest
//setter setMin that accepts an integer and if the integer is larger than max, then
min is set to old value of max and max to the input value. Otherwise set min to
input value
//setter setMax that accepts an integer and if the input is smaller than min then max is set
to old value of min and min to input value. Otherwise set max to the input value

//toString method
//equals method

//method MinMax add(int a) that adds a to both min and max and returns a new
MinMax object
//method MinMax add(MinMax m) returns a MinMax object tht is the sum of this and
m objects.
//method static MinMax(MinMax m1, MinMax m2) that returns a MinMax object that
is the sum of m1 and m2.
//Test your class extensively.


 */
public class MaxMin {
    private int min, max;

    public MaxMin(){
        min = max = 0;
    }

    public MaxMin(int a){
        min = max = a;
    }

    public MaxMin(int a, int b){
        this.setMaxMin(a, b);
    }

    //getters
    public int getMin(){
        return this.min;
    }
    public int getMax(){
        return this.max;
    }
    //setters
    public void setMaxMin(int a, int b){
        if(a > b){
            this.max = a;
            this.min = b;
        }else{
            this.max = b;
            this.min = a;
        }
    }
    //setter for min
    public void setMin(int a){
        if(a > max){
            min = max;
            max = a;
        }else{
            min = a;
        }
    }
    //setter max
    public void setMax(int a){
        if(a < min){
            //set max to old min
            max = min;
            //set min to input
            min = a;
        }else{
            max = a;
        }
    }

    public String toString(){
        return "(" + min + ", " + max + ")";
    }

    public MaxMin add(int a){
        //create a new MaxMin object
        MaxMin M = new MaxMin(this.min + a, this.max+a);
        return M;
    }
    public MaxMin add(MaxMin m){
        //create a new MaxMin object
        MaxMin M = new MaxMin(this.min + m.min, this.max+m.max);
        return M;
    }
    public static MaxMin add(MaxMin m1, MaxMin m2){
        //How many objects do we have total? Three objects: m1, m2 and the
        //one we create to return. There is no "this" in static methods
        //because the method belongs to the class not to a specific
        //object. When this method is called, it's invoked on the class.
        MaxMin M = new MaxMin(m1.min + m2.min, m1.max+m2.max);
        return M;
    }
}

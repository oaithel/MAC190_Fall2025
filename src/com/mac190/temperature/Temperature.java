package com.mac190.temperature;

import java.text.NumberFormat;

//Modify the temperature program to implement it as a class.
//In your class you have one member variable for temperature, which
//the input from the user and two methods one to convert from celcius to fahrenheit
//and the other to convert from fahrenheit to celcius.
//vave another class tester where you test your class.
/*
Encapsulation would have no sense if there is no access specifiers for member variable.
Access specifiers/access modifiers specify access restrictions on members variables:
1- private: access is restricted to the class itself and nothing else.
2- default: when no specifier is put before the variable access id restricted to the package.
Only classes within the package can access the variable, but not outside, even in a derived class
3- protected: access is restricted to the package and derived classes even if they are
not in the same package (inheritance)
4- public: access is granted to everyone independent of the class or package.
In general, we declare member variables as private.
The problem when a variable is private, you cannot access it from outside the class. In order
to grant access to the variable from outside, we provide methods to read the variable (getters/accessors)
and method to change/mutate/modify/write the variable (setters/mutators).

//getters
public typeOfVarible getVariableName(){
        return variableName;
}
//setters
public void setVariableName(variableType input){
    variableName = input;
}

For our Temperature class, the variable is temperature it's a double, therefore we have a getter
public double getTemperature(){
    return temperature;
}
//setter
public void setTemperature(double input){
    temperature = input;
}
 */


public class Temperature {
    private double temperature;

    public double getTemperature(){
        return temperature;
    }
    //setter
    public void setTemperature(double input){
        temperature = input;
    }

    public void fahrenheitToCelcius(){
        double celcius = (temperature - 32)*5.0/9.0;
        NumberFormat nbf = NumberFormat.getInstance();
        nbf.setMaximumFractionDigits(2);
        System.out.println(temperature + " in celcius is: " + nbf.format(celcius));
    }
    public void celciusToFahrenheit(){
        double fah = temperature*9.0/5.0 + 32;
        NumberFormat nbf = NumberFormat.getInstance();
        nbf.setMaximumFractionDigits(2);
        System.out.println(temperature + " in fahrenheit is: " + nbf.format(fah));
    }
}

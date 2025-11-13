package com.mac190.abstractclasses;

public class AbstractTester {
    static void main() {
        //You cannot make an object AbstractAnimal, because it's an abstract
        //class and it does not have all the code.
        //AbstractAnimal A = new AbstractAnimal();
        AbstractAnimal A = new aDog();
        A.speak();


    }
}

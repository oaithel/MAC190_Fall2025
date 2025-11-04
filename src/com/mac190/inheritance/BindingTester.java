package com.mac190.inheritance;

import java.sql.SQLOutput;

public class BindingTester {
    public static void main(String[] args) {
        //create a Default Animal object A1
        Animal A1 = new Animal();
        System.out.println("A1: " + A1);
        //set it to Carnivore, Cats, age 4, color Gray
        A1.setDiet("Carnivore");
        A1.setSpecies("Cats");
        A1.setAge(4);
        A1.setColor("Gray");
        System.out.println("A1: " + A1);
        //create a Dog D1: Shiwawa, age 5, color White, name: milou,
        Dog D1 = new Dog("White", 4, "milou", "Shiwawa");
        System.out.println("D1: " + D1);
        //create a Cat  C1: age 4, Gray, "Siamoa", "Johnwick"
        Cat C1 = new Cat("Gray", 4, "Johnwick", "Siamoa");
        System.out.println("C1: " + C1);
        //Compare the Animal A1 to the Cat C1
        if(A1.equals(C1)){
            System.out.println("A1 is same as C1");
        }else{
            System.out.println("A1 is not same as C1");
        }
        //compare the Cat C1 to the Animal A1
        if(C1.equals(A1)){
            System.out.println("C1 is same as A1");
        }else{
            System.out.println("C1 is not same as A1");
        }

        //Get the animal within cat and call it A2.
        //We use a reference to an Animal and assign the cat to it
        Animal A2 = (Animal) C1;
        System.out.println("A2: " + A2);
        //invoke speak on A1 and speak on A2 (see the difference).
        System.out.println("Speak on A1: ");
        A1.speak();
        System.out.println("Speak on A2: ");
        A2.speak();
        //Make a Cat C2 out of A2
        Cat C2 = (Cat) A2;
        System.out.println("C2: "  + C2);
        /* This will trigger a ClassCast Exception, not enough data to make a Cat
        Cat C3 = (Cat) A1; //Problem will happen at runtime.
        System.out.println("C3: " + C3);
         */

        /* Run time exception, we cannot make a Dog out of a Cat eventhough we have enough
        information to make a Dog, but still you cannot make a Dog out of a Cat because
        they are of different classes.
        //Make a Dog out of A2
        Dog D2 = (Dog) A2;
        System.out.println("D2: " + D2);
        */
        A2 = (Animal) D1;
        //here A2 is no longer referencing the Cat C1 but now it is referencing the Dog D1
        System.out.println("A2: " + A2);
        //Try to make a Dog D2 out of A2

        //Now if you try to make a Cat out of A2 it will not work, it will crash.
        Cat C4 = (Cat) A2;
        System.out.println("C4: "  + C4);
        //display it.
    }
}

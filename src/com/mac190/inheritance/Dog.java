package com.mac190.inheritance;

import java.util.Objects;

/*
Design a class Dog that has everything an animal has in addition
a Dog has a breed, and a name
equals/toString
The method speak() here display "Waf! Waf!"
 */
/*
Every Dog IS an Animal. When you answer a question what is a certain
object by IS another object we use inheritance. When there is a one
to one correspondence, we use inheritance.

Can we use inheritance for MaxMinPrime?  MaxMinPrime HAS two Prime
it IS NOt a Prime therefore we use composition not inheritance.

Can ThreeDForm class use inheritance from Rectangle? YES, because
every ThreeDForm IS a rectangle augmented/extended by a height.

In our case Dog class will extend the class Animal, therefore Dog will
inherite everything defined in Animal (species, color, diet and age and all setters
getters constructors, speak ...)
We add breed and name

 */
public class Dog extends Animal {
    private String name, breed;

    public Dog(){
        //construct a default Animal
        super();
        this.setSpecies("Canine");
        this.setDiet("Omnivore");
        name = "Unknown";
        breed = "Unknown";
    }
    public Dog(String c, int a, String n, String b){
        super("Canine", "Omnivore", c, a);
        name = n;
        breed = b;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Dog dog)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(name, dog.name) && Objects.equals(breed, dog.breed);
    }

    @Override
    public void speak() {
        System.out.println("Waf! Waf!");
    }
}

package com.mac190.abstractclasses;

import java.util.Objects;

public class aDog extends AbstractAnimal {
    private String name, breed;

    public aDog(){
        //construct a default Animal
        super();
        this.setSpecies("Canine");
        this.setDiet("Omnivore");
        name = "Unknown";
        breed = "Unknown";
    }
    public aDog(String c, int a, String n, String b){
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
        return "aDog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof aDog dog)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(name, dog.name) && Objects.equals(breed, dog.breed);
    }

    @Override
    public void speak() {
        System.out.println("Waf! Waf!");
    }
}

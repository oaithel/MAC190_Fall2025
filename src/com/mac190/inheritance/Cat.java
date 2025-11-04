package com.mac190.inheritance;

import java.util.Objects;

public class Cat extends Animal {
    private String name, breed;

    public Cat(){
        //construct a default Animal
        super();
        this.setSpecies("Cats");
        this.setDiet("Carnivore");
        name = "Unknown";
        breed = "Unknown";
    }
    public Cat(String c, int a, String n, String b){
        super("Cats", "Carnivore", c, a);
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
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cat cat)) return false;
        if (!super.equals(o)) return false;
        return name.equals(cat.name) && breed.equals(cat.breed);
    }

    @Override
    public void speak() {
        System.out.println("Miaawww! Miawwww!");
    }
}

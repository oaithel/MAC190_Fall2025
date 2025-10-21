package com.mac190.inheritance;

//Design a class Animal where an animal is defined by
//its species, color, age, diet
//setters/ getters/ default constructor and a constructor that accepts
//everything.
//toString and equals methods
//a method speak() that displays "I don't know how to speak yet!!"

import java.util.Objects;

public class Animal {
    private String species, diet, color;
    private int age;

    public Animal(){
        species = "Unknown";
        diet = "Unknown";
        color = "Unknown";
        age = 0;
    }
    public Animal(String s, String d, String c, int a){
        species = s;
        diet = d;
        color = c;
        age = a;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Animal animal)) return false;
        return age == animal.age && Objects.equals(species, animal.species) && Objects.equals(diet, animal.diet) && Objects.equals(color, animal.color);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", diet='" + diet + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
    public void speak(){
        System.out.println("don't know how to speak yet!");
    }
}

package com.mac190.abstractclasses;

/*
Very often a base class does not know how a specific method will be implemented.
For instance, we don't know how to implement the method speak in Animal. So we
let the derived classes implement and we need to FORCE them to implement.
The method speak in this case needs to be declared as abstract with no code.
If a class has one abstract method then it has to be declared abstract, because
you cannot instantiate it, you cannot make objects out of it.
 */


abstract class AbstractAnimal {
    private String species, diet, color;
    private int age;

    public AbstractAnimal(){
        species = "Unknown";
        diet = "Unknown";
        color = "Unknown";
        age = 0;
    }
    public AbstractAnimal(String s, String d, String c, int a){
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
        if (!(o instanceof AbstractAnimal animal)) return false;
        return age == animal.age && species.equals(animal.species) && diet.equals(animal.diet) && color.equals(animal.color);
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
    abstract void speak();
}
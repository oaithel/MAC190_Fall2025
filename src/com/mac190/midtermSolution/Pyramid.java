package com.mac190.midtermSolution;

public class Pyramid {
    private Triangle baseTriangle;
    private double pyramidHeight;
    public Pyramid(){
        baseTriangle = new Triangle();
        pyramidHeight = 0;
    }
    public Pyramid(Triangle t, double h){
        baseTriangle = new Triangle(t);//OR baseTriangle = t;
        pyramidHeight = h;
    }
    public Pyramid(double b, double c, double h){
        baseTriangle = new Triangle(b, c);//OR baseTriangle = t;
        pyramidHeight = h;
    }
    public Pyramid(double b){
        baseTriangle = new Triangle(b);//OR baseTriangle = t;
        pyramidHeight = b;
    }
    public Pyramid(Pyramid p){
        baseTriangle = new Triangle(p.baseTriangle);
        pyramidHeight = p.pyramidHeight;
    }
    public double getBase(){
        return this.baseTriangle.getBase();
    }
    public void setBase(double b){
        this.baseTriangle.setBase(b);
    }
    public double getHeight(){
        return this.baseTriangle.getHeight();
    }
    public void setHeight(double b){
        this.baseTriangle.setHeight(b);
    }
    public Triangle getBaseTriangle() {
        return baseTriangle;
    }

    public void setBaseTriangle(Triangle baseTriangle) {
        this.baseTriangle = baseTriangle;
    }

    public double getPyramidHeight() {
        return pyramidHeight;
    }

    public void setPyramidHeight(double pyramidHeight) {
        this.pyramidHeight = pyramidHeight;
    }
    public double volume(){
        return (1.0/3.0)*this.getBaseTriangle().area()*this.pyramidHeight;
    }

    @Override
    public String toString() {
        return "Pyramid{" +
                "baseTriangle=" + baseTriangle +
                ", pyramidHeight=" + pyramidHeight +
                '}';
    }
    public boolean equals(Pyramid p){
        if(p == null) return false;
        return (this.baseTriangle.equals(p.getBaseTriangle()) && this.pyramidHeight == p.getPyramidHeight());
    }

    public Pyramid add(Pyramid p){
        //We have two Pyramid objects: this and p
        //We create a third one
        //Using the static add method in Triangle class
        //Pyramid newPyramid = new Pyramid(Triangle.add(this.getBaseTriangle(), p.getBaseTriangle()), (this.getPyramidHeight() + p.getPyramidHeight())/2.0);

        //Using the non-static add method in Triangle class
        Pyramid newPyramid = new Pyramid(this.getBaseTriangle().add(p.getBaseTriangle()), (this.getPyramidHeight() + p.getPyramidHeight())/2.0);
        return newPyramid;
    }
    public static Pyramid add(Pyramid s, Pyramid p){
        //We have two Pyramid objects: s and p
        //We create a third one
        //Using the static add method in Triangle class
        //Pyramid newPyramid = new Pyramid(Triangle.add(s.getBaseTriangle(), p.getBaseTriangle()), (s.getPyramidHeight() + p.getPyramidHeight())/2.0);

        //Using the non-static add method in Triangle class
        Pyramid newPyramid = new Pyramid(s.getBaseTriangle().add(p.getBaseTriangle()), (s.getPyramidHeight() + p.getPyramidHeight())/2.0);
        return newPyramid;
    }
}

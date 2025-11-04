package com.mac190.midtermSolution;

public class iPyramid extends Triangle{
    private double pyramidHeight;
    public iPyramid(){
        super();
        pyramidHeight = 0;
    }
    public iPyramid(Triangle t, double h){
        super(t);
        pyramidHeight = h;
    }
    public iPyramid(double b, double c, double h){
        super(b, c);
        pyramidHeight = h;
    }
    public iPyramid(double b){
        super(b);
        pyramidHeight = b;
    }
    public iPyramid(iPyramid p){
        super(p); //p is also a Triangle, every iPyramid is a Triangle
        pyramidHeight = p.pyramidHeight;
    }

    public Triangle getBaseTriangle() {
        return this;
    }

    public void setBaseTriangle(Triangle baseTriangle) {
        this.setBase(baseTriangle.getBase());
        this.setHeight(baseTriangle.getHeight());
    }

    public double getPyramidHeight() {
        return pyramidHeight;
    }

    public void setPyramidHeight(double pyramidHeight) {
        this.pyramidHeight = pyramidHeight;
    }
    public double volume(){
        return (1.0/3.0)*super.area()*this.pyramidHeight;
    }

    @Override
    public String toString() {
        return "Pyramid{" +
                "baseTriangle=" + super.toString() +
                ", pyramidHeight=" + pyramidHeight +
                '}';
    }
    public boolean equals(iPyramid p){
        //p is iPyramid and therefore it is a Triangle object as well (by inheritance)
        if(p == null) return false;
        return (super.equals(p) && this.pyramidHeight == p.getPyramidHeight());
    }

    public iPyramid add(iPyramid p){
        //We have two iPyramid objects: this and p
        //We create a third one
        //Using the static add method in Triangle class
        //iPyramid newPyramid = new iPyramid(Triangle.add(this, p), (this.getPyramidHeight() + p.getPyramidHeight())/2.0);

        //Using the non-static add method in Triangle class
        iPyramid newPyramid = new iPyramid(super.add(p), (this.getPyramidHeight() + p.getPyramidHeight())/2.0);
        return newPyramid;
    }
    public static iPyramid add(iPyramid s, iPyramid p){
        //We have two iPyramid objects: s and p
        //We create a third one
        //Using the static add method in Triangle class
        //iPyramid newPyramid = new iPyramid(Triangle.add(s, p), (s.getPyramidHeight() + p.getPyramidHeight())/2.0);

        //Using the non-static add method in Triangle class
        iPyramid newPyramid = new iPyramid(s.add(p.getBaseTriangle()), (s.getPyramidHeight() + p.getPyramidHeight())/2.0);
        return newPyramid;
    }
}

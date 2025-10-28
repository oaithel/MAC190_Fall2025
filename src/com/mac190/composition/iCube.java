package com.mac190.composition;
/*
Implement ThreeDForm class using inheritance. iCube inherits
from Rectangle and has heigh as member. All methods remain the same.
 */
public class iCube extends Rectangle{
    private double height;

    //constructors
    public iCube(){
        super();
        height = 0;
    }
    public iCube(double a){
        super(a);
        height = Math.abs(a);
    }

    public iCube(Rectangle r, double a){
        super(r.getLength(), r.getWidth()); //this is a preference
        //so that you have an object independent of r.
        height = Math.abs(a);
    }

    public Rectangle getBase() {
        return this;
    }
    public void setBase(Rectangle base) {
        this.setLength(base.getLength());
        this.setWidth(base.getWidth());
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {

        this.height = Math.abs(height);
    }
    @Override
    public String toString() {
        return "ThreeDForm{" +
                "base=" + super.toString() +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof iCube)) return false;
        iCube that = (iCube) o;
        return Double.compare(height, that.height) == 0
                && super.equals(that.getBase());
    }

    public iCube add(int a){
        iCube T = new iCube(Rectangle.add(this, a), this.height+a);
        return T;
    }

    //10- static ThreeDForm add(ThreeDForm t1, ThreeDForm t2) returns a ThreeDForm
    //that is the sum of t1 and t2.
    public static iCube add(iCube T1, iCube T2){
        iCube T3 = new iCube((Rectangle)T1.add(T2), T1.height + T2.height);
        return T3;
    }
    public double volume(){
        return super.area()*this.height;
    }

}

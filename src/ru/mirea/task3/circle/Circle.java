package ru.mirea.task3.circle;

public class Circle {
    double radius;
    double len;
    public Circle(double r){
        this.radius=r;
        this.len= 3.14*2*radius;
    }
    public Circle(double len,double rad){
        this.len= len;
        this.radius= rad;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setLen(double len) {
        this.len = len;
    }
    public double getRadius() {
        return radius;
    }
    public double getLen() {
        return len;
    }
    public String toString(){
        return this.radius+", dlina okr:"+this.len;
    }
}

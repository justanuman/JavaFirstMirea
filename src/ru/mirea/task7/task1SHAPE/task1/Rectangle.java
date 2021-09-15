package ru.mirea.task7.task1SHAPE.task1;
import lab3.task1.Shape;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle()
    {
        this.width = 2;
        this.length = 1;
        this.filled = false;
        this.color = "blue";
    }
    public Rectangle(double w, double h)
    {
        this.width = w;
        this.length = h;
        this.filled = false;
        this.color = "blue";
    }
    public Rectangle(double w, double h, String c, boolean i)
    {
        this.width = w;
        this.length = h;
        this.filled = i;
        this.color = c;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return getLength()*getWidth();
    }

    @Override
    public double getPerimeter() {
        return 2*getLength()+2*getWidth();
    }
    @Override
    public String toString() {
        return "Shape: rectangle, width: "+this.width+"length: "+this.length+" color: "+this.color;
    }
}

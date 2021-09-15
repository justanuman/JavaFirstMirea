package ru.mirea.task7.task1SHAPE.task1;


public class Square extends Rectangle{
    public double side;
    public Square()
    {
        this.side =1;
        this.filled=true;
        this.color= "Black";
    }
    public Square(double s){
        this.side=s;
    }
    public Square(double s, String color, boolean fil)
    {
        this.side=s;
        this.color= color;
        this.filled= fil;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return getSide()*getSide();
    }

    @Override
    public double getPerimeter() {
        return 4*getSide();
    }
    @Override
    public String toString() {
        return "Shape: square, side: "+getSide()+" color: "+this.color;
    }
}

package ru.mirea.task4.task2BALL;

public class Ball {
    private double x =  0.0;
    private double y =  0.0;
    public Ball(double x,double y)
    {
        this.x=x;
        this.y=y;
    }
    public Ball(){}
    public double getX()
    {
        return x;
    }
    public void setX(double x)
    {
      this.x=x;
    }
    public double getY()
    {
        return y;
    }
    public void setY(double x)
    {
        this.y=x;
    }
    public void move( double xDisp, double yDisp){
        x+=xDisp;
        y+=yDisp;
    }
    @Override
    public String toString() {
        return "Ball @ ("+this.x+", "+this.y+").";
    }
}

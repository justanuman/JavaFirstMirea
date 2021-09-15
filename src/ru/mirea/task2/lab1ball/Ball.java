package ru.mirea.task2.lab1ball;

public class Ball {
    private String color;
    private int rad;
    public Ball(String c, int r)
    {
        color = c;
        rad = r;
    }
    public Ball(int r)
    {
        color = "white";
        rad = r;
    }
    public Ball (String c)
    {
        color = c;
        rad = 0;
    }
    public void setRad(int r)
    {
        this.rad = r;
    }
    public void setColor(String c)
    {
        this.color= c;
    }
    public String toString(){
        return this.color+", rad: "+this.rad;
    }
}


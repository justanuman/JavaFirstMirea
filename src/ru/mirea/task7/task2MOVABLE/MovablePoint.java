package ru.mirea.task7.task2MOVABLE;

public class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;
    public MovablePoint(int x,int y,int xS, int yS)
    {
        this.x=x;
        this.y=y;
        this.xSpeed=xS;
        this.ySpeed=yS;
    }
    public String toString() {
        return "x: "+x+" y: "+y;
    }
    @Override
    public void moveUp() {
        this.y++;
    }

    @Override
    public void moveDown() {
        this.y--;
    }

    @Override
    public void moveLeft() {
        this.x--;
    }

    @Override
    public void moveRight() {
        this.x++;
    }
}

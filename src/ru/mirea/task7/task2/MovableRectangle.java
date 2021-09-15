package ru.mirea.task7.task2;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    MovableRectangle(int x1, int y1, int x2, int y2, int onex, int oney)
    {
        topLeft= new MovablePoint(x1, y1, onex, oney);
        bottomRight =  new MovablePoint(x2, y2, onex, oney);
    }
    public String toString() {
        return "rectangle " + topLeft.x + ", " + topLeft.y + ", " + bottomRight.x + ", " + bottomRight.y + "";
    }
    @Override
    public void moveUp() {topLeft.moveUp(); bottomRight.moveUp();}
    @Override
    public void moveDown() {topLeft.moveDown(); bottomRight.moveDown();}
    @Override
    public void moveRight() {topLeft.moveRight(); bottomRight.moveRight();}
    @Override
    public void moveLeft() {topLeft.moveLeft(); bottomRight.moveLeft();}
}


package ru.mirea.task8.task1;

public class Square extends Shape {
    public Square(String color, int x, int y, int w, int h) {
        super(color, x, y,w,h);
    }
    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public String getColor() {
        return color;
    }
}

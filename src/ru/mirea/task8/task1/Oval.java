package ru.mirea.task8.task1;

public class Oval extends Shape {
    public Oval(String color, int x, int y, int w, int h) {
        super(color, x, y, w, h);
    }

    @Override
    public int getX() {
        return 0;
    }

    @Override
    public int getY() {
        return 0;
    }

    @Override
    public String getColor() {
        return null;
    }
}

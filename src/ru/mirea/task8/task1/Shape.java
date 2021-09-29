package ru.mirea.task8.task1;

public abstract class Shape {
    String color;
    int x;
    int y;
    int w;
    int h;
    public Shape(String color, int x, int y, int w, int h)
    {setX(x);
    setY(y);
    setH(h);
    setW(w);
    setColor(color);}
    public abstract int getX();
    public abstract int getY();
    public abstract String getColor();

    public void setW(int w) {
        this.w = w;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setColor(String color) {
        this.color = color;
    }
}

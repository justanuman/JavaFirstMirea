package ru.mirea.task5.dish;

public  abstract class Dish {
    protected String name;
    protected String color;
    Boolean isFull;
    public Dish (String color, boolean filled) {
        setColor(color);
        setFull(filled);
    }
    public Dish () {
        setColor("Blue");
        setFull(true);
        setFull(false);
    }
    public abstract int getVolume();
    public abstract String getMaterial();
    public abstract String toString();
    public void setColor(String color) {
        this.color = color;
    }
    public void setFull(Boolean full) {
        isFull = full;
    }
    public void setName(String name) {
        this.name = name;
    }
}

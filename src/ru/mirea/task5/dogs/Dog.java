package ru.mirea.task5.dogs;

public abstract class Dog {
    protected String tip;
    protected String name;
    public Dog(String tip, String name){
        setTip(tip);
        setName(name);
    }

    protected Dog() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getName() {
        return name;
    }

    public abstract String toString();
}

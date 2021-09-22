package ru.mirea.task5.dogs;

public class Shibainu extends Dog{
    public Shibainu(String name)
    {
        setTip("Shibainu");
        setName(name);
    }

    @Override
    public String toString() {
        return getName() +" is a funny yellow dog";
    }
}


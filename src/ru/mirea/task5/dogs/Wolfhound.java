package ru.mirea.task5.dogs;

public class Wolfhound extends Dog{
    public Wolfhound(String name)
    {
        setTip("wolfhound");
        setName(name);
    }

    @Override
    public String toString() {
        return getName() +" is a big wolfhound";
    }
}

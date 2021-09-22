package ru.mirea.task6;

public class Planets implements Nameable{
    private String name;
    public Planets(String name) {
        this.name=name;
    }
    @Override
    public String getName() {
        return this.name;
    }
    public static void main(String[] args)
    {
        Planets mercilessCullwing= new Planets("Venus");
        System.out.println(mercilessCullwing.getName());
    }
}

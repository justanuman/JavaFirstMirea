package ru.mirea.task6;

import ru.mirea.task1.opt1.TaskOne;

public class Planes implements Priceable {
    private int price;
    public Planes(int price) {
        this.price=price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
    public static void main(String[] args)
    {
        Planes clarityOfwisdom= new Planes(23000);
        System.out.println(clarityOfwisdom.getPrice());
    }
}

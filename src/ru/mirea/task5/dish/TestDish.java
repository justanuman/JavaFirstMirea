package ru.mirea.task5.dish;

public class TestDish {
    public static void main(String[] args) {
        Dish d1 = new Bowl(25, "black",true);
        Dish d2 = new Pan(200,"white",true,0);
        System.out.println(d1);
        System.out.println(d2);
        ((Bowl) d1).shatter();
        ((Pan) d2).heatup();
        System.out.println(d1);
        System.out.println(d2);
    }}

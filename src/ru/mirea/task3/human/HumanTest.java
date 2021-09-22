package ru.mirea.task3.human;

import ru.mirea.task3.circle.Circle;

public class HumanTest {
    public static void main(String[] args)
    {
        Brain c1= new Brain(20,"Brian", 'M');
        Heart c2 =new Heart(2,"Dorn", 'M');
        System.out.println(c1);
        System.out.println(c2);
        c1.coma();
        c2.stop();
        System.out.println(c1);
        System.out.println(c2);
    }
}

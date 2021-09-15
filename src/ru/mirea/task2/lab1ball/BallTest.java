package ru.mirea.task2.lab1ball;

public class BallTest {
    public static void main(String[] args)
    {
        Ball b1 = new Ball("red",150);
        Ball b2 = new Ball("blue",23);
        Ball b3 = new Ball(24);
        b3.setColor("black");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}

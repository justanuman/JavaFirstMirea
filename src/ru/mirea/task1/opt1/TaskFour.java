package ru.mirea.task1.opt1;
import java.util.Arrays;
import java.util.Random;
import java.lang.Math;

public class TaskFour {
    public static void main(String[] args){
        Random rand = new Random();
        int[] Mas = new int[10];
        double[] unknownMas = new double[10];
        for (int i = 0; i < 10; i++) {
            Mas[i]=rand.nextInt(200);
            unknownMas[i]= Math.random();
            System.out.println(Mas[i]+"|"+unknownMas[i]);
        }
        Arrays.sort(Mas);
        Arrays.sort(unknownMas);
        System.out.println("______________________");
        for (int i = 0; i < 10; i++) {
            System.out.println(Mas[i]+"|"+unknownMas[i]);
        }
    }
}
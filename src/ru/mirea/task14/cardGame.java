package ru.mirea.task14;
import java.io.*;

import java.util.*;
public class cardGame {
    public static void main(String[] args)
    {
        ArrayDeque<Integer> first = new ArrayDeque<Integer> ();
        ArrayDeque<Integer> second = new ArrayDeque<Integer> ();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            first.offer(input.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            second.offer(input.nextInt());
        }
        int i=0;
        while(true)
        {
            if(i==106)
            {
                System.out.print("botva");
                break;
            }
            if(first.size()==0)
            {
                System.out.print("second ");
                System.out.print(i);
                break;
            }
            if(second.size()==0)
            {
                System.out.print("first");
                System.out.print(i);
                break;
            }
            int cardOne= (int) first.remove();
            int cardTwo= (int) second.remove();
            if((cardOne>cardTwo)&&(cardOne!=9)&&(cardTwo!=0))
            {
                first.add(cardOne);
                first.add(cardTwo);
            }else{
                second.add(cardOne);
                second.add(cardTwo);
            }
            i++;
        }

    }

}
 /*
        Scanner input = new Scanner(System.in);
        Stack first = new Stack();
        System.out.println("Insert elements:");
        for (int i = 0; i < 5; i++) {
            first.push(input.nextInt());
        }
        //System.out.println(first);
        Stack second = new Stack();
        System.out.println("Insert elements:");
        for (int i = 0; i < 5; i++) {
            second.push(input.nextInt())
            ;}
        int i=0;
        while(true)
        {

            if(i==106)
            {
                System.out.print("botva");
                break;
            }
            if(first.empty())
            {
                System.out.print("second ");
                System.out.print(i);
                break;
            }
            if(second.empty())
            {
                System.out.print("first");
                System.out.print(i);
                break;
            }
            int cardOne= (int) first.pop();
            int cardTwo= (int) second.pop();
            if((cardOne>cardTwo)&&(cardOne!=9)&&(cardTwo!=0))
            {
                first.push(cardOne);
                first.push(cardTwo);
            }else{
                second.push(cardOne);
                second.push(cardTwo);
            }
            i++;
        }
 */
/*
Scanner input = new Scanner(System.in);
        Queue<Integer> first= new LinkedList<>();
        Queue<Integer> second= new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            first.offer(input.nextInt());
        }
        System.out.println("Insert elements:");
        for (int i = 0; i < 5; i++) {
            second.offer(input.nextInt());}
        int i=0;
        while(true)
        {
            if(i==106)
            {
                System.out.print("botva");
                break;
            }
            if(first.size()==0)
            {
                System.out.print("second ");
                System.out.print(i);
                break;
            }
            if(second.size()==0)
            {
                System.out.print("first");
                System.out.print(i);
                break;
            }
            int cardOne= (int) first.remove();
            int cardTwo= (int) second.remove();
            if((cardOne>cardTwo)&&(cardOne!=9)&&(cardTwo!=0))
            {
                first.add(cardOne);
                first.add(cardTwo);
            }else{
                second.add(cardOne);
                second.add(cardTwo);
            }
            i++;
        }
        */
/*
ArrayDeque<Integer> first = new ArrayDeque<Integer> ();
        ArrayDeque<Integer> second = new ArrayDeque<Integer> ();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            first.offer(input.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            second.offer(input.nextInt());
        }
        int i=0;
        while(true)
        {
            if(i==106)
            {
                System.out.print("botva");
                break;
            }
            if(first.size()==0)
            {
                System.out.print("second ");
                System.out.print(i);
                break;
            }
            if(second.size()==0)
            {
                System.out.print("first");
                System.out.print(i);
                break;
            }
            int cardOne= (int) first.remove();
            int cardTwo= (int) second.remove();
            if((cardOne>cardTwo)&&(cardOne!=9)&&(cardTwo!=0))
            {
                first.add(cardOne);
                first.add(cardTwo);
            }else{
                second.add(cardOne);
                second.add(cardTwo);
            }
            i++;
        }
        */
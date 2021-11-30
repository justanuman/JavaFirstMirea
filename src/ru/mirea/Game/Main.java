package ru.mirea.Game;
import javax.swing.*;
public class Main {
    public  static void main(String[] args)
    {
        JFrame f = new JFrame("gonochki");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(1280, 600);
        f.add(new Road());
        f.setVisible(true);
    }

}

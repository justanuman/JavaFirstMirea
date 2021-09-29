package ru.mirea.task8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Pic {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        String path = in.nextLine();
        Icon icon = new ImageIcon(path);
        JLabel label = new JLabel(icon);
        JFrame f = new JFrame("pic");
        f.getContentPane().add(label);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}

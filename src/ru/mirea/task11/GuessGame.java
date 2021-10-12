package ru.mirea.task11;
import java.util.Random;
import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GuessGame extends JFrame {
    JTextField smallField;
    JButton but1= new JButton("GUESS");
    int secret;
    int cnt=0;
    int min = 0;
    int max = 20;
    int diff = max - min;
    Random random = new Random();
    String check;
    public GuessGame()
    {
        super("game");
        int secret = random.nextInt(diff + 1);
        secret += min;
        check  = Integer.toString(secret);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        int finalSecret = secret;
        but1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                if(check.equals(smallField.getText()))
                {
                    JOptionPane.showMessageDialog(GuessGame.this, "YOU WON ");cnt=0;
                    int secret = random.nextInt(diff + 1);
                    secret += min;}
                else{
                    cnt++;
                    if (finalSecret >Integer.valueOf(smallField.getText())){ JOptionPane.showMessageDialog(GuessGame.this, "WRONG, actually its higher "+check+" "+ Integer.toString(cnt)+" Tries ");}
                    else{JOptionPane.showMessageDialog(GuessGame.this, "WRONG, actually its lower "+check+" "+ Integer.toString(cnt)+" Tries ");}
                    if (cnt==3){
                        JOptionPane.showMessageDialog(GuessGame.this, "YOU LOST ");cnt=0;}
                }
            }
        });
        smallField = new JTextField(2);
        JPanel contents = new JPanel(new FlowLayout(FlowLayout.LEFT));
        contents.add(smallField);
        contents.add(but1);
        setContentPane(contents);
        // Определяем размер окна и выводим его на экран
        setSize(400, 130);
        setVisible(true);
    }
    public static void main(String[] args) {
        new GuessGame();
    }
}

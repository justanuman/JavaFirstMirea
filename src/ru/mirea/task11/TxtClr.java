package ru.mirea.task11;
import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TxtClr extends JFrame
{
    JButton but1= new JButton("3");
    JButton but2= new JButton("14");
    JButton but3= new JButton("32");
    JButton but4= new JButton("ital");
    JButton but5= new JButton("plain");
    JButton but6= new JButton("bold");
    int currsize=14;
    String currstyle="dialog";
    public TxtClr()
    {
        super("JTextArea");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JTextArea area1 = new JTextArea(" поле", 8, 10);
        area1.setFont(new Font("Times new roman", Font.PLAIN, 14));
        area1.setTabSize(10);
        JPanel contents = new JPanel();
        contents.add(new JScrollPane(area1));
        but1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                currsize=3;
                area1.setFont(new Font("Dialog", Font.PLAIN, currsize));

            }
        });
        but2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                currsize=14;
                area1.setFont(new Font("Dialog", Font.PLAIN, currsize));

            }
        });
        but3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                currsize=32;
                area1.setFont(new Font("Dialog", Font.PLAIN, currsize));

            }
        });
        but4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                area1.setFont(new Font(currstyle, Font.ITALIC, currsize));
            }
        });
        but5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                area1.setFont(new Font(currstyle, Font.PLAIN, currsize));
            }
        });
        but6.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                area1.setFont(new Font("Comic Sans", Font.BOLD, currsize));
            }
        });
        contents.add(but1);
        contents.add(but2);
        contents.add(but3);
        contents.add(but4);
        contents.add(but5);
        contents.add(but6);
        setContentPane(contents);
        setSize(400, 300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new TxtClr();
    }
}
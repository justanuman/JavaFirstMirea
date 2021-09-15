package ru.mirea.task9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameGUI extends JFrame {
    int milanScore=0;
    int madridScore=0;
    String lastScore;
    JLabel scor = new JLabel("0:0");
    JLabel last= new JLabel("last scorer is");
    JButton but1= new JButton("SCORE FOR MILAN");
    JButton but2= new JButton("SCORE FOR MADRID");
    JButton butEnd= new JButton("End match");
    JPanel[] pnl = new JPanel[9];
    public GameGUI()
    {
        super("GAME");
        setLayout(new GridLayout(3,3));
        pnl[0] = new JPanel();
        pnl[0].add(new JLabel("AC MADRID"));
        add(pnl[0]);
        pnl[1] = new JPanel();
        pnl[1].add(scor);

        add(pnl[1]);
        pnl[2] = new JPanel();
        pnl[2].add(new JLabel("MILAN"));
        add(pnl[2]);
        //YY
        pnl[3] = new JPanel();
        pnl[3].add(but2);
        but2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                madridScore++;
                scor.setText(String.valueOf(madridScore)+":"+String.valueOf(milanScore));
                lastScore="last scorer is madrid";
            }
        });
        add(pnl[3]);
        //YY
        pnl[4] = new JPanel();
        pnl[4].add(butEnd);
        butEnd.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                if(madridScore>milanScore)
                {
                scor.setText("winner is madrid");
                }else if (madridScore<milanScore){
                    scor.setText("winner is milan");
                }else{ scor.setText("STALEMATE");};
                milanScore=0;
                madridScore=0;
                last.setText(lastScore);
            }
        });
        add(pnl[4]);
        pnl[5] = new JPanel();
        pnl[5].add(but1);
        but1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                milanScore++;
                scor.setText(String.valueOf(madridScore)+":"+String.valueOf(milanScore));
                lastScore="last scorer is milan";
            }
        });
        add(pnl[5]);
        pnl[6] = new JPanel();
        add(pnl[6]);
        pnl[7] = new JPanel();
        pnl[7].add(last);
        add(pnl[7]);
        pnl[8] = new JPanel();
        add(pnl[8]);
        setSize(800,600);
        }
    public static void main(String[]args)
    {
        new GameGUI().setVisible(true);
    }
}
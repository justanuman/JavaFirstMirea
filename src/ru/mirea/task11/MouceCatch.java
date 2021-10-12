package ru.mirea.task11;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Moucecatch extends JFrame
{
    JLabel lbl = new JLabel("");
    JLabel lbl1 = new JLabel("");
    JLabel lb2 = new JLabel("");
    JLabel lbl3 = new JLabel("");
    JLabel lbl5 = new JLabel("");
    public Moucecatch ()
    {
        setSize(400,400);
        setLayout(new BorderLayout());
        add(lbl,BorderLayout.SOUTH);
        addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a) {}
            public void mouseEntered(MouseEvent a) { JOptionPane.showMessageDialog(Moucecatch.this, "welcome to South");}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });
        add(lbl1,BorderLayout.NORTH);
        addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a) {}
            public void mouseEntered(MouseEvent b) {JOptionPane.showMessageDialog(Moucecatch.this, "welcome to North");}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });
        add(lb2,BorderLayout.CENTER);
        addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a) {}
            public void mouseEntered(MouseEvent a) { JOptionPane.showMessageDialog(Moucecatch.this, "welcome to center");}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });
        add(lbl3,BorderLayout.WEST);
        addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a) {}
            public void mouseEntered(MouseEvent b) {JOptionPane.showMessageDialog(Moucecatch.this, "welcome to west");}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });
        add(lbl3,BorderLayout.EAST);
        addMouseListener(new MouseListener()
        {
            public void mouseExited(MouseEvent a){}
            public void mouseClicked(MouseEvent a) {}
            public void mouseEntered(MouseEvent b) {JOptionPane.showMessageDialog(Moucecatch.this, "welcome to east");}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
        });

    }
    public static void main(String[]args)
    {
        new Moucecatch().setVisible(true);
    }
}
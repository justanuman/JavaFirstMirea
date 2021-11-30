package ru.mirea.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Player {
    public static final int MAX_V = 100;
    public static final int MIN_Y = 40;
    public static final int MAX_Y = 420;
    Image car = new ImageIcon("C:\\Users\\user\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\Game\\res\\ae86.png").getImage();
    int vel=2;
    int accl=0;
    int lane=0;
    int s=0;
    int layer1=0;
    int x=100;
    int y=100;
    int layer2=1280;
    public void move(){
        s+=vel;
        vel+=accl;
        if(vel<=0)
        {
            vel=0;
        }
        y-=lane;
        if (vel>= MAX_V){vel=MAX_V;}
        if(y<MIN_Y){y=MIN_Y;}
        if(y>MAX_Y){y=MAX_Y;}


        if(layer2-vel<=0)
        {
            layer1=0;
            layer2=1280;
        }else{
        layer1-=vel;
        layer2-=vel;}
    }
    public void keyPressed(KeyEvent e) {
     int key = e.getKeyCode();
     if (key== KeyEvent.VK_RIGHT)
        {
            accl+= 1;
        }
        if (key== KeyEvent.VK_LEFT)
        {
            accl-=1;
        }
        if (key== KeyEvent.VK_UP)
        {
            lane+= 1;
        }
        if (key== KeyEvent.VK_DOWN)
        {
            lane-=1;
        }

    }
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if (key== KeyEvent.VK_RIGHT || key== KeyEvent.VK_LEFT);
        {
            accl=0;
        }
        if (key== KeyEvent.VK_UP || key== KeyEvent.VK_DOWN)
        {
            lane=0;
        }
    }
}

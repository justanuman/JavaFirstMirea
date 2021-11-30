package ru.mirea.Game;
import java.awt.*;
import javax.swing.*;
import java.awt.*;

public class Rider {
    int x, v, y;
    Road road;
    Image car = new ImageIcon("C:\\Users\\user\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\Game\\res\\ridercar.png").getImage();
    public Rider(int x, int y, int v, Road road)
    {
        this.x=x;
        this.y=y;
        this.v=v;
        this.road= road;
    }
    public void move()
    {
        x=x- road.player.vel +v;
    }
}

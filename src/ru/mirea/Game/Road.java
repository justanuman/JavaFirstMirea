package ru.mirea.Game;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import  javax.swing.Timer;
import javax.swing.*;
import java.util.List;
public class Road extends JPanel implements ActionListener, Runnable{
    Timer mainTimer = new Timer(20, this);
    Image road = new ImageIcon("C:\\Users\\user\\IdeaProjects\\JavaFirstMirea\\src\\ru\\mirea\\Game\\res\\road.png").getImage();
    Player player = new Player();
    Thread riderFactory = new Thread(this);
    List <Rider> riderList= new ArrayList<Rider>();
    public void paint( Graphics g)
    {
        g= (Graphics2D) g;
        g.drawImage(road,0,0,null);
        g.drawImage(road,player.layer1,0 ,null);
        g.drawImage(road,player.layer2,0 ,null);

        g.drawImage(player.car,player.x,player.y ,null);
        Iterator<Rider> r = riderList.iterator();
        while (r.hasNext()){
            Rider ride = r.next();
            if(ride.x>2000 || ride.x<-2000){
                r.remove();
            }else{
                ride.move();
                g.drawImage(ride.car,ride.x,ride.y,null);
           }
        }
    }
    public Road()
    {
        mainTimer.start();
        riderFactory.start();
        addKeyListener( new MyKeyAdapter());
        setFocusable(true);
    }

    @Override
    public void run() {
        while(true){
            Random rand = new Random();
            try{
            Thread.sleep(rand.nextInt(2000));
            riderList.add(new Rider(1300, rand.nextInt(500), rand.nextInt(100),this));
            }
            catch (InterruptedException e)
            {e.printStackTrace(); }
        }
    }

    private class MyKeyAdapter extends KeyAdapter
    {
        @Override
        public void keyPressed(KeyEvent e) {
            player.keyPressed(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
            player.keyReleased(e);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        player.move();
        repaint();
    }
}

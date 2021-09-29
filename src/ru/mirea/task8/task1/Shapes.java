package ru.mirea.task8.task1;
import javax.swing.*;
import java.awt.*;

public class Shapes extends JFrame {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.add(new CustomPaintComponent());
        int frameWidth = 300;
        int frameHeight = 300;
        frame.setSize(frameWidth, frameHeight);
        frame.setVisible(true);
    }
    static class CustomPaintComponent extends Component {
        public void paint(Graphics g) {

            Graphics2D g2d = (Graphics2D)g;
            int x = 0;
            int y = 0;
            int w = getSize().width-1;
            int h = getSize().height-1;
            g2d.drawLine(x, y, w, h);
            g2d.drawOval(x, y, w, h);
            g2d.setColor(Color.RED);
            g2d.drawRect(x, y, w, h);

        }

    }

}
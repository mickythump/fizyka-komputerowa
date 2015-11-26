import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Chart extends JPanel {
    boolean draw;
    int size = 300;

    public Chart() {
        setBorder(BorderFactory.createLineBorder(Color.black));
   }

    public Dimension getPreferredSize() {
        return new Dimension(size, size);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(draw) {
            for(int i = 1; i < 190; i += 5) {
                g.fillOval((int) (size * Math.random()), (int) (size * Math.random()), 10, 10);
            }
        }
        try {
            Thread.sleep(100);
        } catch(InterruptedException t) { }

        repaint();
    }
}
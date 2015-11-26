import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Chaos extends JPanel {
    boolean draw;
    int size = 300;
    int [][] siec = new int [size][size];
    int part_num = 3;
    Particle [] walker = new Particle [part_num];

    public Chaos() {
        draw = false;
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                siec[i][j] = 0;
            }
        }
        walker[0] = new Particle(size/2, size/2);
        walker[1] = new Particle(size/4, size/4);
        walker[2] = new Particle(size/2, size/2);

        siec[size/2][size/2] = 1;
        siec[size/4][size/4] = 1;
        siec[size/2][size/2] = 1;

        setBorder(BorderFactory.createLineBorder(Color.black));
    }

    public Dimension getPreferredSize() {
        return new Dimension(size, size);
    }

    void step(int which) {
        int x = walker[which].get_x();
        int y = walker[which].get_y();
        double rand = Math.random();
        if(rand < 0.25) {
            x += 1;
            if(x == size) {
                x = 0;
            }
        }
        else if(rand < 0.5) {
            x -= 1;
            if(x == -1) {
                x = size - 1;
            }
        }
        else if(rand < 0.75) {
            y += 1;
            if(y == size) {
                y = 0;
            }
        }
        else {
            y -= 1;
            if(y == -1) {
                y = size - 1;
            }
        }

        if(siec[x][y] == 0) {
            siec[walker[which].get_x()][walker[which].get_y()] = 0;
            walker[which].set_x(x);
            walker[which].set_y(y);
            siec[x][y] = 1;
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(draw) {
            for(int part = 0; part < part_num; part++) {
                int index = (int)(part_num * Math.random());
                step(index);
            }
            for(int i = 0; i < size; i++) {
                for(int j = 0; j < size; j++) {
                    if(siec[i][j] == 1) {
                        g.drawRect(i, j, 1, 1);
                    }
                }
            }
        }
        try {
            Thread.sleep(10);
        } catch(InterruptedException t) { }

        repaint();
    }
}
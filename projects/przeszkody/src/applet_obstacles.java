import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class applet_obstacles extends JApplet implements ActionListener,MouseListener, MouseMotionListener {
    int applet_width=600;
    int applet_height=600;
    Wykres2aa wykr = new Wykres2aa();
    Point start, end;
    public void init(){
        setSize(applet_width,applet_height);
        JButton przycisk = new JButton("START");
        przycisk.addActionListener(this);
        add(wykr,BorderLayout.CENTER);
        add(przycisk,BorderLayout.SOUTH);
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        wykr.rysowac=true;
        wykr.repaint();
    }
    public void mousePressed(MouseEvent e){
        start = new Point(e.getX(), e.getY());
        wykr.siec[e.getX()][e.getY()] = 5;
    }
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseDragged(MouseEvent e){
        Graphics g = wykr.getGraphics();
        int xx = 0; int yy = 0;
        end = new Point(e.getX(), e.getY());
        if(end.x-start.x!=0) {
            int l = (int)(Math.sqrt((end.y-start.y)*(end.y-start.y)+(end.x-start.x)*(end.x-start.x)));
            for (int i = 0; i < l; i++) {
                xx = start.x +(int)((end.x-start.x)*i/(1.0*l));
                yy = start.y +(int)((end.y-start.y)*i/(1.0*l));
                wykr.siec[xx][yy] = 5;
            }
        }
        else{
            for(int i = Math.min(start.y, end.y); i < Math.max(start.y, end.y); i++) {
                wykr.siec[start.x][i] = 5;
            }
        }
        g.drawLine(start.x, start.y, end.x, end.y);
        start = end;
    }
    public void mouseMoved(MouseEvent e) {}
}


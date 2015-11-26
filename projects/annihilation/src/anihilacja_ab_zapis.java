import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class anihilacja_ab_zapis extends JApplet implements ActionListener {
    int applet_width=550;
    int applet_height=550;
    Wykres2abz wykr = new Wykres2abz();
    public void init(){
        setSize(applet_width,applet_height);
        JButton przycisk = new JButton("START");
        przycisk.addActionListener(this);
        add(wykr,BorderLayout.CENTER);
        add(przycisk,BorderLayout.SOUTH);
        add(wykr.etykpanel,BorderLayout.NORTH);

    }
    public void actionPerformed(ActionEvent e){
        wykr.czystart=true;
        wykr.repaint();
    }
}
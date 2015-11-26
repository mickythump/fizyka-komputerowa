import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyApplet extends JApplet implements ActionListener {
    int app_width = 800;
    int app_hei = 600;
    Chart chart = new Chart();
    Chaos chaos = new Chaos();

    public void init() {
        setSize(app_width, app_hei);
        JButton start_button = new JButton("START");
        start_button.addActionListener(this);
        setLayout(new FlowLayout());
        add(chart);
        add(chaos);
        add(start_button);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("clicked");
        chart.draw = true;
        chart.repaint();
        chaos.draw = true;
        chaos.repaint();
    }
}



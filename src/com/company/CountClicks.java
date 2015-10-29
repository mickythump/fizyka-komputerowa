package com.company;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class CountClicks  extends Applet implements ActionListener {
    Button button1 = new Button("0");
    Button button2 = new Button("0");
    Button button3 = new Button("0");
    int button1_clicked = 0;
    int button2_clicked = 0;
    int button3_clicked = 0;
    int appletSize = 300;

    public void init() {
        setSize(appletSize, appletSize);
        add(button1);
        add(button2);
        add(button3);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1) {
            button1_clicked++;
            button1.setLabel("" + Integer.toString(button1_clicked));
        }
        else if(e.getSource() == button2) {
            button2_clicked++;
            button2.setLabel("" + Integer.toString(button2_clicked));
        }
        else {
            button3_clicked++;
            button3.setLabel("" + Integer.toString(button3_clicked));
        }
    }
}

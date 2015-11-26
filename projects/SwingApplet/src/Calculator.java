import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JApplet {
    JButton [] num_buttons = new JButton[10];
    JButton button_mult = new JButton("*");
    JButton button_equals = new JButton("=");
    JButton button_clear = new JButton("C");
    JTextField text_field = new JTextField(20);
    int num1;
    int num2;

    public void init() {
        setLayout(new FlowLayout());
        add(button_mult);
        add(button_equals);
        add(button_clear);
        add(text_field);
        for(int i = 0; i < num_buttons.length; i++) {
            num_buttons[i] = new JButton(Integer.toString(i));
            add(num_buttons[i]);
            num_buttons[i].addActionListener(new SpecNumberListener(Integer.toString(i)));
        }
        button_mult.addActionListener(new SpecMultListener());
        button_equals.addActionListener(new SpecEqualsListener());
        button_clear.addActionListener(new SpecClearListener());
    }

    class SpecNumberListener implements ActionListener {
        String number;

        SpecNumberListener(String num) {
            number = num;
        }
        public void actionPerformed(ActionEvent e) {
            text_field.setText(text_field.getText() + number);
        }
    }

    class SpecMultListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            num1 = Integer.parseInt(text_field.getText());
            text_field.setText("");
        }
    }

    class SpecEqualsListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            num2 = Integer.parseInt(text_field.getText());
            text_field.setText(Integer.toString(num1 * num2));
        }
    }

    class SpecClearListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            num1 = 0;
            num2 = 0;
            text_field.setText("");
        }
    }
}

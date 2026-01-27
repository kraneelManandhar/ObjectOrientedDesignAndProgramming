package workshop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Qn2 extends JFrame implements ActionListener {

    JTextField t1, t2, t3;
    JButton add, sub, mul, div;

    public Qn2() {
        // Frame settings
        setTitle("Simple Calculator");
        setSize(350, 250);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Labels
        JLabel l1 = new JLabel("First Number:");
        JLabel l2 = new JLabel("Second Number:");
        JLabel l3 = new JLabel("Result:");

        l1.setBounds(30, 20, 100, 30);
        l2.setBounds(30, 60, 100, 30);
        l3.setBounds(30, 100, 100, 30);

        // Text Fields
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t3.setEditable(false);

        t1.setBounds(140, 20, 150, 30);
        t2.setBounds(140, 60, 150, 30);
        t3.setBounds(140, 100, 150, 30);

        // Buttons
        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");

        add.setBounds(30, 150, 60, 30);
        sub.setBounds(100, 150, 60, 30);
        mul.setBounds(170, 150, 60, 30);
        div.setBounds(240, 150, 60, 30);

        // Add action listeners
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        // Add components to frame
        add(l1); add(l2); add(l3);
        add(t1); add(t2); add(t3);
        add(add); add(sub); add(mul); add(div);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(t1.getText());
            double num2 = Double.parseDouble(t2.getText());
            double result = 0;

            if (e.getSource() == add)
                result = num1 + num2;
            else if (e.getSource() == sub)
                result = num1 - num2;
            else if (e.getSource() == mul)
                result = num1 * num2;
            else if (e.getSource() == div) {
                if (num2 == 0) {
                    JOptionPane.showMessageDialog(this, "Cannot divide by zero!");
                    return;
                }
                result = num1 / num2;
            }

            t3.setText(String.valueOf(result));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers!");
        }
    }

    public static void main(String[] args) {
        new Qn2();
    }
}

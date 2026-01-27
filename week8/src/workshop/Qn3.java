package workshop;

import javax.swing.*;
import java.awt.*;

public class Qn3 extends JFrame {
	public Qn3() {
		setTitle("Temp Converter");
		setSize(300, 150);
		setLayout(new FlowLayout());

		JTextField celsiusField = new JTextField(10);
		JButton convertBtn = new JButton("Convert");
		JLabel resultLabel = new JLabel("Fahrenheit: ");

		convertBtn.addActionListener(e -> {
			double c = Double.parseDouble(celsiusField.getText());
			double f = (c * 9/5) + 32;
			resultLabel.setText("Fahrenheit: " + f);
		});

		add(new JLabel("Celsius:"));
		add(celsiusField);
		add(convertBtn);
		add(resultLabel);
		setVisible(true);
	}
	public static void main(String[] args) { new Qn3(); }
}
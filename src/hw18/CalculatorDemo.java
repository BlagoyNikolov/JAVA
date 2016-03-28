package hw18;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CalculatorDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Calculator");
		frame.setSize(300, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		JPanel calculator = new CalculatorPanel();
		frame.add(calculator);
		frame.setVisible(true);
	}
}

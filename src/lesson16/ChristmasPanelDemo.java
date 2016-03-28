package lesson16;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChristmasPanelDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Christmas panel demo");
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		JPanel christmasPanel = new ChristmasPanel();

		frame.add(christmasPanel);
	}
}

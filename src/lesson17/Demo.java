package lesson17;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Demo {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Layout Example");
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new NullLayoutPanel();
		frame.add(panel);
		// frame.setResizable(false);

		frame.setVisible(true);
	}
}

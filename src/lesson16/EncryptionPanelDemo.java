package lesson16;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class EncryptionPanelDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Encryption application");
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new EncryptionPanel();
		frame.add(panel);
		frame.setVisible(true);
	}
}

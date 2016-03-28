package hw17;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Demo {
	public static void main(String[] args) {
		double money = 0;
		String value  = JOptionPane.showInputDialog("Enter money value");
		try {
			money = Double.parseDouble(value);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Numbers only", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		
		JFrame frame = new JFrame("Money");
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new Panel(money);
		frame.add(panel);
		frame.setVisible(true);
	}
}

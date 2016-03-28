package lesson17;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DemoTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Layout");
		frame.setSize(1024, 768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel borderPanel = new BorderPanelTest();
		frame.add(borderPanel);
		frame.setVisible(true);
	}
}

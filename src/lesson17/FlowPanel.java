package lesson17;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FlowPanel extends JPanel {
	
	public FlowPanel() {
		FlowLayout l = new FlowLayout(FlowLayout.RIGHT, 20, 50);
		this.setLayout(l);
		
		JTextField text = new JTextField(15);
		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Test button");
		
		
		this.add(button1);
		this.add(button2);
		this.add(text);
	}
}

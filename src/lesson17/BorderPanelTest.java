package lesson17;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BorderPanelTest extends JPanel {
	public BorderPanelTest() {
		this.setLayout(new BorderLayout(50, 10));
		
		JPanel one = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		one.add(new JLabel ("Test border layout"));
		add(one, BorderLayout.NORTH);
		
		JLabel two = new JLabel();
		two.setPreferredSize(new Dimension(100, 100));
		add(two, BorderLayout.WEST);
		
		add(new JTextArea(), BorderLayout.CENTER);
		
		JPanel three = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 0));
		three.add(new JButton("Click"));
		add(three, BorderLayout.SOUTH);

	}
}

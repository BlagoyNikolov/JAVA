package lesson17;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class AdvancedPanel extends JPanel{
	public AdvancedPanel() {
		setLayout(new BorderLayout(200, 5));
		
		JTextArea area = new JTextArea();
		JButton button = new JButton("Click me");
		JLabel label = new JLabel("Some text");
		
		JPanel northPanel = new JPanel();
		northPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		northPanel.add(label);
		
		add(northPanel, BorderLayout.NORTH);
		add(new JLabel(), BorderLayout.WEST);
		// or add(new JPanel(), BorderLayout.WEST);
		add(area, BorderLayout.CENTER);
		
		JPanel southPanel = new JPanel();
		southPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 0));
		//or JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 50, 0));
		southPanel.add(button);
		
		add(southPanel, BorderLayout.SOUTH);
		
	}
}

package lesson17;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BoxPanel extends JPanel{
	public BoxPanel() {
		BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
		this.setLayout(layout);
		
		add(new JButton("Button 1"));
		
		JPanel horizontalPanel = new JPanel();
		horizontalPanel.setLayout(new BoxLayout(horizontalPanel, BoxLayout.X_AXIS));
		horizontalPanel.add(new JButton("Horizontal 1"));
		horizontalPanel.add(new JButton("Horizontal 2"));
		horizontalPanel.add(new JButton("Horizontal 3"));
		horizontalPanel.add(new JButton("Horizontal 4"));
		
		
		add(horizontalPanel);
		add(new JButton("Button 2"));
		add(new JButton("Button 3"));
		add(new JButton("Button 4"));
	}
}

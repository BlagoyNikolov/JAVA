package lesson17;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class GridPanel extends JPanel{
	public GridPanel() {
		setLayout(new GridLayout(3, 2, 20, 20));
		add(new JButton("button 1"));
		add(new JButton("button 2"));
		add(new JButton("button 3"));
		add(new JLabel(""));
		
		JPanel panel = new JPanel();
		panel.add(new JCheckBox("chech this"));
		panel.add(new JRadioButton("radio button"));
		panel.add(new JTextArea(20, 15));
		add(panel);
		//add(new JButton("button 5"));
		add(new JButton("button 6"));
	}
}

package lesson17;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NullLayoutPanel extends JPanel{
	public NullLayoutPanel() {
		setLayout(null);
		
		JLabel text = new JLabel("SoftAcad");
		JButton button = new JButton("Click here");
		JTextField textField = new JTextField(100);
		
		text.setBounds(10, 100, 200, 10);
		add(text);
		button.setBounds(200, 200, 300, 40);
		add(button);
		textField.setBounds(600, 300, 100, 20);
		add(textField);
	}
}

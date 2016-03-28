package lesson17;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BorderPanel extends JPanel {
	public BorderPanel() {
		BorderLayout l = new BorderLayout(20, 20);
		setLayout(l);

		JButton button1 = new JButton("Button1");
		JButton button2 = new JButton("Button2");
		JButton button3 = new JButton("Button3");
		JButton button4 = new JButton("Button4");
		JButton button5 = new JButton("Button5");
		JButton button6 = new JButton("Button6");

		JPanel p = new JPanel();
		p.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10));

		p.add(new JTextField(10));
		p.add(new JButton("Test"));
		p.add(new JButton("Test 2"));

		this.add(button1, BorderLayout.NORTH);
		this.add(button2, BorderLayout.SOUTH);
		this.add(button3, BorderLayout.EAST);
		this.add(button4, BorderLayout.WEST);
		this.add(button5, BorderLayout.CENTER);
		// this.add(p, BorderLayout.CENTER);
		// this.add(button6, BorderLayout.NORTH);
	}
}

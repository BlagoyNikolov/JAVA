package lesson16;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ChristmasPanel extends JPanel {
	private JLabel text;
	private JButton button;
	private JButton button2;

	public ChristmasPanel() {
		button = new JButton("click me");
		this.add(button);

		button2 = new JButton("click me 2");
		this.add(button2);

		text = new JLabel();
		text = new JLabel("MERRY CHRISTMAS!");
		text.setVisible(true);
		this.add(text);

		ButtonListener listener = new ButtonListener();
		button.addActionListener(listener);
		button.addActionListener(new ButtonListener2());
		button2.addActionListener(listener);

		// button.addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent e) {
		// text.setText("MERRY CHRISTMAS AND HAPPY NEW YEAR!");
		// //text.setVisible(true);
		// //text.setText(text.getText() +
		// " MERRY CHRISTMAS AND HAPPY NEW YEAR!");
		// }
		// });

	}

	private class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			text.setText("MERRY CHRISTMAS AND HAPPY NEW YEAR!");
			// text.setVisible(true);
			// text.setText(text.getText() +
			// " MERRY CHRISTMAS AND HAPPY NEW YEAR!");
		}
	}

	private class ButtonListener2 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			button2.setVisible(!button2.isVisible());
		}

	}
}

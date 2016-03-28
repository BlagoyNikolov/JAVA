package lesson17;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BoxPanel2 extends JPanel {
	public BoxPanel2() {
		BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
		this.setLayout(layout);

		add(new JButton("Button 1"));

		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.add(new JButton("Horizontal 1"));
		horizontalBox.add(Box.createRigidArea(new Dimension(40, 100)));
		horizontalBox.add(new JButton("Horizontal 2"));
		horizontalBox.add(Box.createHorizontalGlue());
		// horizontalBox.add(Box.createHorizontalGlue());
		horizontalBox.add(Box.createVerticalGlue());
		horizontalBox.add(new JButton("Horizontal 3"));
		horizontalBox.add(Box.createHorizontalGlue());
		horizontalBox.add(new JButton("Horizontal 4"));

		add(horizontalBox);
		add(new JButton("Button 2"));
		add(new JButton("Button 3"));
		add(new JButton("Button 4"));
	}
}

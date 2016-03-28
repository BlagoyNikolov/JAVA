package lesson15;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class ComponentsDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Components example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);

		JPanel panel = new JPanel();
		frame.add(panel);

		JLabel label = new JLabel("SoftAcad");
		panel.add(label);

		JButton button = new JButton("Click me");
		panel.add(button);

		// button.setVisible(false);
		// button.setEnabled(false);

		// JTextField text = new JTextField("Enter your name here...");
		JTextField text = new JTextField(15);
		panel.add(text);

		// text.getText();
		// text.setText("New text");
		// text.setEditable(false);

		JTextArea textArea = new JTextArea(4, 10);
		panel.add(textArea);

		JScrollPane scroll = new JScrollPane(textArea);
		panel.add(scroll);
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		// String[] cars = {"BMW", "Mercedes"};

		Car[] cars = new Car[3];
		Car ford = new Car("Ford Fiesta", 1999);
		Car bmw = new Car("BMW 530", 2005);
		Car benz = new Car("Mercedes Benz", 2010);
		cars[0] = ford;
		cars[1] = bmw;
		cars[2] = benz;

		JComboBox combo = new JComboBox(cars);
		panel.add(combo);

		Car c = (Car) combo.getSelectedItem();
		// c.startEngine();

		JCheckBox check = new JCheckBox("on/off");
		check.setSelected(true);
		panel.add(check);

		JRadioButton radio = new JRadioButton("on");
		JRadioButton radio2 = new JRadioButton("off");
		ButtonGroup radioMenu = new ButtonGroup();
		radioMenu.add(radio);
		radioMenu.add(radio2);
		panel.add(radio);
		panel.add(radio2);

		frame.setVisible(true);
	}
}

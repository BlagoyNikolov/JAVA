package hw17;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Panel extends JPanel {
	private double value;
	private static final int COLUMNS = 10;
	private static final int ROWS = 15;

	private JLabel moneyLabel;
	private JTextArea textArea;

	public Panel(double value) {
		this.setValue(value);

		moneyLabel = new JLabel("Money value: " + value + " lv.");
		this.add(moneyLabel);

		calculate(value);

		textArea = new JTextArea(ROWS, COLUMNS);
		textArea.setText("10 leva" + "");
		this.add(textArea);
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public void calculate (double number) {
		number = number * 100;
		int intNumber = (int) number;
		System.out.println(intNumber);
		
		int desetki = intNumber / 1000;
		System.out.println("10 lv = " + desetki);
		
		int desetkiO = intNumber % 1000;
		System.out.println("ostatuk = " + desetkiO);
		
		int edinici = desetkiO / 500;
		System.out.println("5 lv = " + edinici);
		
		int ediniciO = intNumber % 100;
		System.out.println("ostatuk = " + ediniciO);
	}
	
}

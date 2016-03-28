package lesson18;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel {
	private static final int NUMBERS = 10; 
	
	private JButton[] digits;
	private JButton plus;
	private JButton minus;
	private JButton multiply;
	private JButton divide;
	private JButton clear;
	private JButton equals;
	
	public ButtonPanel(){
		this.setLayout(new GridLayout(4, 4, 5, 5));
		digits = new JButton[NUMBERS]; 
		
		
		initializeButtons();
		addButtons();
		
		}
	
	public JButton[] getDigits() {
		return digits;
	}
	
	public JButton getPlus()
	{
		return plus;
	}
	public JButton getMinus()
	{
		return minus;
	}
	public JButton getMultiply()
	{
		return multiply;
	}
	public JButton getDivide()
	{
		return divide;
	}
	public JButton getClear() {
		return clear;
	}
	public JButton getEquals()
	{
		return equals;
	}
	
	private void addButtons() {
		this.add(digits[7]);
		this.add(digits[8]);
		this.add(digits[9]);
		this.add(plus);
		
		this.add(digits[4]);
		this.add(digits[5]);
		this.add(digits[6]);
		this.add(minus);
		
		this.add(digits[1]);
		this.add(digits[2]);
		this.add(digits[3]);
		this.add(multiply);
		
		this.add(digits[0]);
		this.add(clear);
		this.add(equals);
		this.add(divide);
	}
	
	private void initializeButtons() {
		for (int i = 0; i < digits.length; i++) {
			digits[i] = new JButton(Integer.toString(i));
		}
		
		plus = new JButton("+");
		minus = new JButton("-");
		multiply = new JButton("*");
		divide = new JButton("/");
		clear = new JButton("C");
		equals = new JButton("=");
		
	}
	
}

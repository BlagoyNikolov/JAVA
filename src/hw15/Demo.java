package hw15;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.util.InputMismatchException;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Demo {
	public static void main(String[] args) {
		try {
			String[] shapes = { "Square", "Circle" };
			String shapesChoice = (String) JOptionPane.showInputDialog(null, "CHOOSE SHAPE:", "Shapes", JOptionPane.QUESTION_MESSAGE, null, shapes, "Circle");
			System.out.println(shapesChoice);
			
			Integer number = Integer.valueOf(JOptionPane.showInputDialog("ENTER MULTIPLIER"));
			System.out.println(number);
			
			Integer spacing = Integer.valueOf(JOptionPane.showInputDialog("ENTER SPACING"));
			System.out.println(spacing);
			
			if (number < 0) {
				throw new InputMismatchException();
			}
			
			String[] colorsNames = { "BLACK", "RED", "GREEN", "BLUE"};
			String color = (String) JOptionPane.showInputDialog(null, "CHOOSE COLOR:", "Color", JOptionPane.QUESTION_MESSAGE, null, colorsNames, "BLUE");
			Color colorsChoice = null;
			switch (color) {
				case "BLACK" : colorsChoice = Color.BLACK;
				break;
				case "RED" : colorsChoice = Color.RED;
				break;
				case "GREEN" : colorsChoice = Color.GREEN;
				break;
				case "BLUE" : colorsChoice = Color.BLUE;
				break;
				default : colorsChoice = Color.BLACK;
				}
			
			JFrame frame = new JFrame("HW15");
			frame.setSize(1920, 1080);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			
			if(shapesChoice.equals("Circle")) {
				Circles circles = new Circles(0, 0, number, spacing, colorsChoice);
				frame.add(circles);
			} else {
				Squares squares = new Squares(0, 0, number, spacing, colorsChoice);
				frame.add(squares);
			}
			
		} catch (NumberFormatException e) {
			System.out.println("iteger numbers only pls");
		} catch (InputMismatchException e) {
			System.out.println("positive numbers only pls");
		}
	}
	
}

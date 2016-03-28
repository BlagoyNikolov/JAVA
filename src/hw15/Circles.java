package hw15;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Circles extends JPanel {
	private int x;
	private int y;
	private int number;
	private int spacing;
	private Color colorsChoice;

	public Circles(int x, int y, int number, int spacing, Color colorsChoice) {
		this.setX(x);
	    this.setX(y);
		this.setNumber(number);
		this.setSpacing(spacing);
		this.setColorsChoice(colorsChoice);
	}

	public Color getColorsChoice() {
		return colorsChoice;
	}

	public void setColorsChoice(Color colorsChoice) {
		this.colorsChoice = colorsChoice;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getSpacing() {
		return spacing;
	}

	public void setSpacing(int spacing) {
		this.spacing = spacing;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		int x = getX();
		int y = getY();
		int z = getSpacing();
		
		for(int i = 0; i <= getNumber(); i++) {
			g.setColor(getColorsChoice());
			g.drawOval(x, y, 500, 500);
			x = x + z;
			y = y + z;
			//System.out.println("test");
		}
	}
}

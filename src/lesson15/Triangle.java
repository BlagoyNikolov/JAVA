package lesson15;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Triangle extends JPanel {
	private int width;
	private int height;
	private int side;

	public Triangle(int width, int height, int side) {
		this.setWidth(width);
		this.setHeight(height);
		this.setSide(side);
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		int x = this.getWidth() / 2;
		int y = this.getHeight() / 2;
		
		int arrx[] = { x, x + getSide(), x };
		int arry[] = { y, y, y + getSide() };
		
		g.setColor(Color.BLUE);
		g.fillPolygon(arrx, arry, 3);
		}
}

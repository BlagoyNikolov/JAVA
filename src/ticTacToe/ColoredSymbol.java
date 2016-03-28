package ticTacToe;

import java.awt.Color;

import javax.swing.JButton;

public class ColoredSymbol {
	private Color color;
	private String shape;

	public ColoredSymbol(){
		
	}
	
	public ColoredSymbol(Color color, String shape) {
		this.color=color;
		this.shape=shape;
	}
	public void setColor(Color color){
		this.color=color;
	}
	public Color getColor(){
		return color;
	}
	public void setShape(String shape){
		this.shape=shape;
	}
	public String getShape(){
		return shape;
	}
 
}

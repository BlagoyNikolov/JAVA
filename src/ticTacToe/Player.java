package ticTacToe;

import java.awt.Color;

public class Player {
	
	private ColoredSymbol symbol;
	private String name;
	
	
	public Player(){
		this.name=SeaChessPopUps.getName();
		symbol=new ColoredSymbol(SeaChessPopUps.getColor(),
				SeaChessPopUps.getShape());	
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setColor(Color color){
		this.symbol.setColor(color);
	}
	public void setShape(String shape){
		this.symbol.setShape(shape);
	}
	public  ColoredSymbol getColoredSymbol(){
		return symbol;
	}
	public void setColoredSymbol(ColoredSymbol symbol){
		this.symbol=symbol;
	}
	public boolean areSymbolsTheSame(ColoredSymbol p2){
		if((p2.getColor().equals(this.symbol.getColor())&&
				(p2.getShape().equals(this.symbol.getShape())))){
			return true;
		}else{
			return false;
		}
	}
	

}

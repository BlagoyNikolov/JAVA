package ticTacToe;

import javax.swing.JFrame;
import javax.swing.JPanel;

import hw18.CalculatorPanel;

public class SeaChessDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Sea chess");
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);	
		JPanel seaChess = new SeaChessPanel();
		frame.add(seaChess);
		frame.setVisible(true);
	}
}
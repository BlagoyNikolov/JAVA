package sudoku;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SudokuDemo {
	public static void main(String[] args) {

		JFrame mainFrame = new JFrame("Sudoku Puzzle");
		mainFrame.setSize(400, 480);
		mainFrame.setResizable(false);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new SudokuUserPanel();
		mainFrame.add(p);
		mainFrame.setVisible(true);
	}
}

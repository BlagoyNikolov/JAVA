package sudoku;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SudokuUserPanel extends JPanel {

	private static final long serialVersionUID = -2150879957919885635L;

	private SudokuPanel sudokuPanel = new SudokuPanel();
	private JPanel menuPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	private JPanel checkPanel = new JPanel();
	private JButton check = new JButton("Check");

	private JMenuBar menuBar = new JMenuBar();
	private JMenu fileMenu = new JMenu("File");
	private JMenuItem newGame = new JMenuItem("New Game");
	private JMenuItem loadGame = new JMenuItem("Load Game");
	private JMenuItem saveGame = new JMenuItem("Save Game");
	private JMenuItem exit = new JMenuItem("Exit");
	private SudokuTimer timer = new SudokuTimer();

	public SudokuUserPanel() {
		setLayout(new BorderLayout());

		menuPanel.add(menuBar);
		menuBar.add(fileMenu);

		newGame.addActionListener(new menuListener());
		loadGame.addActionListener(new menuListener());
		saveGame.addActionListener(new menuListener());
		exit.addActionListener(new menuListener());

		fileMenu.add(newGame);
		fileMenu.add(loadGame);
		fileMenu.add(saveGame);
		fileMenu.add(exit);

		check.addActionListener(new checkButtonListener());
		checkPanel.add(timer);
		checkPanel.add(check);
		
		add(menuPanel, BorderLayout.NORTH);
		add(sudokuPanel, BorderLayout.CENTER);
		add(checkPanel, BorderLayout.SOUTH);
		
	}

	private class menuListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == newGame) {
				sudokuPanel.newGame();
				repaint();
			} else if (e.getSource() == loadGame) {
				sudokuPanel.loadPuzzle();
				repaint();
			} else if (e.getSource() == saveGame) {
				sudokuPanel.savePuzzle();
			} else if (e.getSource() == exit) {
				int dialogResult = JOptionPane.showConfirmDialog(sudokuPanel,
						"Are you sure you want to exit?", "Exit Game",
						JOptionPane.YES_NO_OPTION);
				if (dialogResult == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}

		}
	}

	private class checkButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (sudokuPanel.chechSudoku() == true) {
				JOptionPane.showMessageDialog(sudokuPanel,
						"The puzzle is solved!", "Check Puzzle",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(sudokuPanel,
						"The puzzle is not solved!", "Check Puzzle",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}

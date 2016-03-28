package sudoku;

import java.awt.Color;
import java.awt.GridLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class SudokuPanel extends JPanel {

	private static final long serialVersionUID = -9045375657738438651L;
	private static final String SUDOKU_FILE_EXTENSION = "sbf";

	private SudokuGenerator sudoku;

	public SudokuPanel() {
		setLayout(new GridLayout(3, 3));
		setBackground(Color.BLACK);
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		sudoku = new SudokuGenerator();
		for (int i = 0; i < sudoku.getPnl().length; i++) {
			add(sudoku.getPnl()[i]);
		}
	}

	public boolean chechSudoku() {
		return sudoku.chechPuzzle();
	}

	public void newGame() {
		int diff = 1;
		String[] difficulty = { "Easy", "Medium", "Hard" };
		Object choiceOfDifficulty = JOptionPane.showInputDialog(this,
				"Choose difficulty", "Difficulty",
				JOptionPane.INFORMATION_MESSAGE, null, difficulty, "Easy");
		if (choiceOfDifficulty == null) {
			return;
		}

		if (choiceOfDifficulty.equals("Easy")) {
			diff = 1;
		} else if (choiceOfDifficulty.equals("Medium")) {
			diff = 2;
		} else if (choiceOfDifficulty.equals("Hard")) {
			diff = 3;
		}
		sudoku.resetPuzzle(diff);
	}

	public void savePuzzle() {
			JFileChooser chooser = new JFileChooser();

			FileNameExtensionFilter filter = new FileNameExtensionFilter(
					"sudoko binary file", SUDOKU_FILE_EXTENSION);
			chooser.setFileFilter(filter);

			int returnType = chooser.showSaveDialog(this);

			File savedGame = null;

			if (returnType == JFileChooser.APPROVE_OPTION) {
				savedGame = chooser.getSelectedFile();
				if (savedGame == null) {
					System.out.println("xsaxa");
				}

				// first check if valid sudoku binary file is selected to be saved
				if (getFileExtension(savedGame) == null
						|| !getFileExtension(savedGame).equals(
								SUDOKU_FILE_EXTENSION)) {
					showWarningMessage("Please, select sbf file!");
					return;
				}
			} else {
				showWarningMessage("Please, select file to save the game !");
				return;
			}

		OutputStream os = null;
		ObjectOutputStream oos = null;

		try {
			os = new FileOutputStream(savedGame);
			oos = new ObjectOutputStream(os);

			oos.writeObject(sudoku);
			JOptionPane.showMessageDialog(this, "Game was saved successfully!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos != null) {
					oos.close();
				}
				if (os != null) {
					os.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void loadPuzzle() {
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
				"sudoko binary file", SUDOKU_FILE_EXTENSION);
		chooser.setFileFilter(filter);

		int returnValue = chooser.showOpenDialog(this);

		File savedGame = null;

		if (returnValue == JFileChooser.APPROVE_OPTION) {
			// saved game found proceed with the loading
			savedGame = chooser.getSelectedFile();

			// but first check if valid sudoku binary file is selected to be
			// loaded
			if (getFileExtension(savedGame) == null
					|| !getFileExtension(savedGame).equals(
							SUDOKU_FILE_EXTENSION)) {
				showWarningMessage("Please, select sbf file!");
				return;
			}
		} else {
			showWarningMessage("File is not selected! Please, select file");
			return;
		}

		if (!savedGame.exists()) {
			JOptionPane.showMessageDialog(this,
					"There were no saved games found.");
			return;
		}
		
		InputStream is = null;
		ObjectInputStream ois = null;

		try {
			is = new FileInputStream(savedGame);
			ois = new ObjectInputStream(is);

			SudokuGenerator loadedPuzzle = (SudokuGenerator) ois.readObject();
			sudoku.loadGame(loadedPuzzle.getTxt());
			JOptionPane.showMessageDialog(this, "Game loaded successfully.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ois != null) {
					ois.close();
				}

				if (is != null) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private String getFileExtension(File file) {
		String extension = null;
		String sub = file.getName();
		int i = sub.lastIndexOf(".");

		if (i > 0 && i < sub.length() - 1) {
			extension = sub.substring(i + 1).toLowerCase();
		}
		return extension;
	}

	private void showWarningMessage(String message) {
		JOptionPane.showMessageDialog(this, message, "Warning",
				JOptionPane.ERROR_MESSAGE);
	}
}

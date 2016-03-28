package sudoku;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.Serializable;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SudokuGenerator implements Serializable {

	private static final long serialVersionUID = -4217852229016539539L;
	
	// Creating static variables that are used in multiple places
	private static final int SUDOKU_SIZE = 9;
	private static final int SUDOKU_DIFF = 1;

	// Arrays that keep the puzzle and its solution
	private int[][] board = new int[SUDOKU_SIZE][SUDOKU_SIZE];
	private int[][] solvedBoard = new int[SUDOKU_SIZE][SUDOKU_SIZE];

	// Panels and TextFields we use for the GUI
	private JTextField[][] txt = new JTextField[SUDOKU_SIZE][SUDOKU_SIZE];
	private JPanel[] pnl = new JPanel[9];

	// Creating font for the TextFields
	private Font font = new Font("ROMAN_BASELINE", Font.ROMAN_BASELINE, 28);
	
	public JPanel[] getPnl() {
		return pnl;
	}

	public JTextField[][] getTxt() {
		return txt;
	}

	public SudokuGenerator() {
		initBoard(SUDOKU_DIFF);
		printBoard();
		fillBoard();
	}

	// Creating the panels
		private void createPanels() {
			for (int i = 0; i < pnl.length; i++) {
				pnl[i] = new JPanel(new GridLayout(3, 3));
				pnl[i].setBackground(Color.BLACK);
				pnl[i].setBorder(BorderFactory.createLineBorder(Color.black));
			}
		}

		// Creating the TextFields
		private void createTextFields() {
			for (int i = 0; i < txt.length; i++) {
				for (int j = 0; j < txt.length; j++) {
					txt[i][j] = new JTextField();
					txt[i][j].setFont(font);
					txt[i][j].setHorizontalAlignment(JTextField.CENTER);
					txt[i][j]
							.setBorder(BorderFactory.createLineBorder(Color.black));
				}
			}
		}

		// Different difficulties for the puzzle
		private void initBoard(int diff) {
			genBoard();
			Random random = new Random();
			if (diff == 1) {
				dig(30 + random.nextInt(10));
			} else if (diff == 2) {
				dig(40 + random.nextInt(10));
			} else {
				dig(50 + random.nextInt(10));
			}
		}

		// Places the TextFields in the correct panels
		private void printBoard() {
			createPanels();
			createTextFields();
			int currentPanel = 0;
			for (int i = 0; i < txt.length; i++) {
				for (int j = 0; j < txt.length; j++) {
					if (j < 3) {
						if (i < 3) {
							currentPanel = 0;
						} else if (i >= 3 && i < 6) {
							currentPanel = 3;
						} else if (i >= 6) {
							currentPanel = 6;
						}
					} else if (j >= 3 && j < 6) {
						if (i < 3) {
							currentPanel = 1;
						} else if (i >= 3 && i < 6) {
							currentPanel = 4;
						} else if (i >= 6) {
							currentPanel = 7;
						}
					} else if (j >= 6) {
						if (i < 3) {
							currentPanel = 2;
						} else if (i >= 3 && i < 6) {
							currentPanel = 5;
						} else if (i >= 6) {
							currentPanel = 8;
						}
					}

					pnl[currentPanel].add(txt[i][j]);

				}
			}
		}

		// Puts the generated puzzle from the array to the TextFields
		public void fillBoard() {
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board.length; j++) {
					if (board[i][j] == 0) {
						txt[i][j].setText("");
						txt[i][j].setEditable(true);
					} else {
						txt[i][j].setText("" + board[i][j]);
						txt[i][j].setEditable(false);
					}

				}
			}
		}

		// Generates new puzzle and prints it, used for the "New Game" option in the
		// menu
		public void resetPuzzle(int diff) {
			genBoard();
			initBoard(diff);
			fillBoard();
		}

		// Loads a previous saved game
		public void loadGame(JTextField[][] newTxt) {
			for (int i = 0; i < txt.length; i++) {
				for (int j = 0; j < txt.length; j++) {
					// sets new values to the board
					txt[i][j].setText(newTxt[i][j].getText());
					if (newTxt[i][j].isEditable() == true) {
						txt[i][j].setEditable(true);
					} else {
						txt[i][j].setEditable(false);
					}
				}
			}
		}

		// Checks if the puzzle is solved correctly
		public boolean chechPuzzle() {
			boolean isSolved = true;

			for (int i = 0; i < txt.length; i++) {
				for (int j = 0; j < txt.length; j++) {
					if (this.txt[i][j].getText().equals("" + solvedBoard[i][j])) {
						isSolved = true;
					} else {
						return false;
					}
				}
			}
			return isSolved;
		}

		public boolean solveBoard() {
			return solveBoard(0, 0, 1);
		}

		private boolean solveBoard(int i, int j, int n) {
			if (i == 9 && j == 0) {
				// if at end of board, puzzle solved
				return true;
			} else {
				if (board[i][j] == 0) {
					// if the cell is empty
					while (n <= 9) {
						if (contains(i, j, n)) {
							// find the first possible number for the cell
							n++;
						} else {
							// set the cell to this number
							board[i][j] = n;
							if (solveBoard(next(i, j)[0], next(i, j)[1], 1)) {
								// if the board is solvable with this number, return
								// true
								board[i][j] = n;
								return true;
							} else {
								// if not, try the next possible number for the cell
								board[i][j] = 0;
								return solveBoard(i, j, n + 1);
							}
						}
					}
					// if no possible numbers lead to a solution, return false
					return false;
				} else {
					// if not, go to the next cell
					return solveBoard(next(i, j)[0], next(i, j)[1], 1);
				}
			}
		}

		public boolean multSol() {
			// checks for multiple solutions by brute force. Definitely not the best
			// way to do this!
			int n = 0;
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					if (solvedBoard[i][j] == 0) {
						// if a cell in the original puzzle is empty
						for (int k = 1; k < 10; k++) {
							// loop through all possible numbers for this cell
							resetBoard();
							board[i][j] = k;
							if (!contains(i, j, k) && solveBoard()) {
								// count all possible solutions for numbers in this
								// cell
								n++;
							}
						}

						if (n > 1) {
							// if there is more than one possible solution, return
							// true
							return true;
						}
						board[i][j] = 0;
					}
				}
			}
			// if after testing all possible numbers for all empty cells there is
			// not more than one solution, return false
			return false;
		}

		public void resetBoard() {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					board[i][j] = solvedBoard[i][j];
				}
			}
		}

		public int[] next(int i, int j) {
			int[] next = new int[2];

			j += 1;
			if (j > 8) {
				i += 1;
				j = 0;
			}

			next[0] = i;
			next[1] = j;
			return next;
		}

		public int[] getCol(int j) {
			int[] col = new int[9];

			for (int i = 0; i < 9; i++) {
				col[i] = board[i][j];
			}
			return col;
		}

		public int[] getRow(int i) {
			return board[i];
		}

		public int[] getBlock(int i, int j) {
			// could use improvement
			int[] block = new int[9];

			i = i - (i % 3);
			j = j - (j % 3);
			int b = 0;

			for (int n = i; n < i + 3; n++) {
				for (int m = j; m < j + 3; m++) {
					block[b] = board[n][m];
					b++;
				}
			}
			return block;
		}

		public boolean contains(int i, int j, int n) {
			int[] col = getCol(j);
			int[] row = getRow(i);
			int[] block = getBlock(i, j);

			if (contains(col, n) || contains(row, n) || contains(block, n)) {
				return true;
			} else {
				return false;
			}
		}

		public boolean contains(int[] array, int n) {
			for (int i = 0; i < array.length; i++) {
				if (array[i] == n) {
					return true;
				}
			}
			return false;
		}

		private int random() {
			Random rand = new Random();
			return rand.nextInt(9);
		}

		public void genBoard() {
			// generates a valid filled sudoku puzzle
			int i, j, n;

			do {
				resetBoard();
				// fill the board up randomly with numbers, then attempt to solve it
				// 80 attempts at filling a cell (the actual number of filled cells
				// will be 35-45) seems to make for a good balance between solve
				// speed (faster if there are more filled cells) and randomness of
				// puzzles generated
				for (int k = 0; k < 80; k++) {
					i = random();
					j = random();
					n = random() + 1;

					if (!contains(i, j, n)) {
						board[i][j] = n;
					}
				}
			} while (!solveBoard());

			// once a solution is found, set srcBoard to the solved board
			for (i = 0; i < 9; i++) {
				for (j = 0; j < 9; j++) {
					solvedBoard[i][j] = board[i][j];
				}
			}
		}

		private void dig(int n) {
			// make n randomly placed cells empty
			int i, j, k, dug = 0;

			while (dug < n) {
				i = random();
				j = random();
				if (board[i][j] != 0) {
					k = board[i][j];
					board[i][j] = 0;
					if (!multSol()) {
						dug++;
					} else {
						board[i][j] = k;
					}
				}
			}
		}
	}

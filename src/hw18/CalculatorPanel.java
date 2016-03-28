package hw18;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class CalculatorPanel extends JPanel {
	private static final int FONT_SIZE = 25;
	
	private JTextArea textArea;
	private ButtonPanel buttons;
	private StringBuilder upperText;
	private StringBuilder lowerText;
	private int result;
	private String lastOperator;
	
	public CalculatorPanel() {
		this.setLayout(new BorderLayout());
		textArea = new JTextArea(2, 300);
		textArea.setEditable(false);
		textArea.setFont(new Font(textArea.getFont().getName(), Font.BOLD, FONT_SIZE));
		this.add(textArea, BorderLayout.NORTH);
		buttons = new ButtonPanel();
		this.add(buttons, BorderLayout.CENTER);
		
		upperText = new StringBuilder();
		lowerText = new StringBuilder();
		addListeners();
	}
	
	private void addUpperText(String text) {
		upperText.append(text);
		this.textArea.setText(upperText.toString() + "\n" + lowerText.toString());
	}
	
	private void addLowerText(String text) {
		lowerText.append(text);
		this.textArea.setText(upperText.toString() + "\n" + lowerText.toString());
	}
	
	private void addListeners() {
		Font font = new Font(textArea.getFont().getName(), Font.BOLD, FONT_SIZE);
		DigitsButtonsListener digitsButtonsListener = new DigitsButtonsListener();
		
		for (JButton button : buttons.getDigits()) {
			button.setFont(font);
			button.addActionListener(digitsButtonsListener);
		}
		
		ActionButtonsListener actionButtonsListener = new ActionButtonsListener();
		ClearButtonListener clearButtonListener = new ClearButtonListener();
		ResultButtonListener resultButtonListener = new ResultButtonListener();
		
		buttons.getPlus().setFont(font);
		buttons.getMinus().setFont(font);
		buttons.getMultiply().setFont(font);
		buttons.getDivide().setFont(font);
		buttons.getClear().setFont(font);
		buttons.getEquals().setFont(font);
		
		buttons.getPlus().addActionListener(actionButtonsListener);
		buttons.getMinus().addActionListener(actionButtonsListener);
		buttons.getMultiply().addActionListener(actionButtonsListener);
		buttons.getDivide().addActionListener(actionButtonsListener);
		buttons.getClear().addMouseListener(clearButtonListener);
		buttons.getEquals().addActionListener(resultButtonListener);
	}
	
	private class DigitsButtonsListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton) e.getSource();
			addLowerText(button.getText());
		}
	}
	
	private class ActionButtonsListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton) e.getSource();
			calculate(button.getText());
			addUpperText(lowerText.toString() + button.getText());
			lastOperator = button.getText();
			clearLowerText();
		}
	}
	
	private class ClearButtonListener implements MouseListener {
		@Override
		public void mouseClicked(MouseEvent e) {
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
		
		}

		@Override
		public void mouseExited(MouseEvent e) {
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			if(e.getButton() == MouseEvent.BUTTON1) {
				clearLowerText();
				textArea.setText(upperText.toString());
			} else if (e.getButton() == MouseEvent.BUTTON3) {
				clearUpperText();
				clearLowerText();
				textArea.setText("");
			}
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			
		}

	}
	
	private class ResultButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			calculate(lastOperator);
			clearUpperText();
			clearLowerText();
			addLowerText(Integer.toString(result));
		}
	
	}
	private void clearLowerText() {
		lowerText.setLength(0);
	}
	
	private void clearUpperText() {
		upperText.setLength(0);
	}
	
	private void calculate(String operator) {
		switch(operator) {
		case "+" : result = result + Integer.parseInt(lowerText.toString());
			break;
		case "-" : result = result - Integer.parseInt(lowerText.toString());
			break;
		case "*" : result = result * Integer.parseInt(lowerText.toString());
			break;
		case "/" : result = result / Integer.parseInt(lowerText.toString());
			break;
		}
	}
}

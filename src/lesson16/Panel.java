package lesson16;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Panel extends JPanel {
	private int codeNummber;
	
	private static final int COLS = 10;
	private static final int ROWS = 8;
	private static final String ENCRYPT = "Encrypt";
	private static final String DECRYPT = "Decrypt";
	private static String modes [] = { ENCRYPT, DECRYPT };
	
	private JComboBox combo;
	private JLabel label;
	private JTextField textField;
	private JButton encryptButton;
	private JButton clearButton;
	private JTextArea textArea;
	private JLabel infoLabel;
	
	
	public Panel(int codeNummber) {
		this.codeNummber = codeNummber;
		
		this.setBackground(Color.LIGHT_GRAY);
		
		
		combo = new JComboBox(modes);
		combo.addActionListener(new ComboBoxListener());
		this.add(combo);
		
		label = new JLabel("Text to encrypt");	
		this.add(label);
		
		textField = new JTextField(COLS);
		this.add(textField);
		
		encryptButton = new JButton("Encrypt");
		encryptButton.addActionListener(new EncryptButtonListener());
		this.add(encryptButton);
		
		clearButton = new JButton("Clear");
		clearButton.addActionListener(new ClearButtonListener());
		this.add(clearButton);
		
		textArea = new JTextArea(ROWS, COLS);
		this.add(textArea);
		
		infoLabel = new JLabel("Info: change edncryption/decryption mode");	
		this.add(infoLabel);
		
		InfoListener infolistener = new InfoListener();
		combo.addMouseListener(infolistener);
		textField.addMouseListener(infolistener);
		encryptButton.addMouseListener(infolistener);
		clearButton.addMouseListener(infolistener);
		textArea.addMouseListener(infolistener);
		
		}
	
	private class ComboBoxListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (isDecrypt()) {
				label.setText("Text to decrypt");
				encryptButton.setText("Decrypt");
			} else {
				label.setText("Text to encrypt");
				encryptButton.setText("Encrypt");
			}
		}
	}
	
	private class EncryptButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String text  = encrypt(textField.getText(), isDecrypt());
			textArea.setText(text);
		}
	}
	
	private class ClearButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			textArea.setText("");
		}
	}
	
	private class InfoListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			if(e.getSource() == combo) {
				infoLabel.setText("info: change encrypt/decrypt mode");
			} else if (e.getSource() == textField) {
				infoLabel.setText("info: enter text to encrypt or decrypt");
			} else if (e.getSource() == encryptButton) {
				infoLabel.setText("info: press to encrypt or decrypt");
			} else if (e.getSource() == clearButton) {
				infoLabel.setText("info: press to clear");
			} else if (e.getSource() == textArea) {
				infoLabel.setText("info: this is a result area");
			}
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private String encrypt (String text, boolean decrypt) {
		String textToReturn = "";
		char temp;
		for(int i = 0; i < text.length(); i++) {
			temp = text.charAt(i);
			if (decrypt) {
				temp -= codeNummber + i;
			} else {
				temp += codeNummber + i;
			}
			textToReturn += temp;
		}
		String resultText = textArea.getText().length() > 0 ? textArea.getText() + "\n" : "";
		resultText += decrypt ? modes[1] : modes[0]; 

		return resultText + "\n" + textField.getText() + " --> " + textToReturn;
		
	}
	
	private boolean isDecrypt() {
		return DECRYPT.equals(combo.getSelectedItem());
	}
}

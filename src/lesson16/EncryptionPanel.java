package lesson16;

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

public class EncryptionPanel extends JPanel {
	private static final String[] MODES = {"Encrypt", "Decrypt"};

	private static final int TEXT_AREA_ROWS = 8;

	private static final int TEXT_AREA_COLS = 10;
	
	private JComboBox mode;
	private JLabel label;
	private JTextField text;
	private JButton encrypt;
	private JButton clear;
	private JTextArea area;
	
	public EncryptionPanel() {
		
		mode = new JComboBox(MODES);
		this.add(mode);
		
		label = new JLabel("Text to encrypt");
		this.add(label);
		
		text = new JTextField(10);
		this.add(text);
		
		encrypt = new JButton("Encrypt");
		clear = new JButton("Clear");
		
		this.add(encrypt);
		this.add(clear);
		
		area = new JTextArea(TEXT_AREA_ROWS, TEXT_AREA_COLS);
		this.add(area);
		area.setEditable(false);
		
		clear.addActionListener(new ClearButtonListener());
	}
	
	private class ClearButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			area.setText("");
		}
		
	}
	
	private class InfoListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			e.getSource();
			
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
}

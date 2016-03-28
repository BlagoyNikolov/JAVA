package lesson15;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JOptionPaneExample {
	public static void main(String[] args) {
//		JOptionPane.showMessageDialog(null, "HEYOOOOO IMMA SWINGIINGG");
//		int result = JOptionPane.showConfirmDialog(null, "is today monday?");
//		System.out.println(result);
//		if (result ==0) {
//			System.out.println("yes");
//		} else {
//			System.out.println("no");
//		}
//		JOptionPane.showConfirmDialog(null, "HEYOOOOO IMMA SWINGIINGG", "ANSWER BIATCH", JOptionPane.YES_NO_CANCEL_OPTION);
//		JOptionPane.showConfirmDialog(null, "BOOOOMMM", "ANSWER BIATCH", JOptionPane.YES_NO_OPTION);
		try {
		Integer width = Integer.valueOf(JOptionPane.showInputDialog("ENTER WIDTH"));
		Integer height = Integer.valueOf(JOptionPane.showInputDialog("ENTER HEIGHT"));
		Integer side = Integer.valueOf(JOptionPane.showInputDialog("ENTER THE SIDE OF THE TRIANGLE"));
		System.out.println(width);
		System.out.println(height);
		System.out.println(side);
			
		JFrame frame = new JFrame();
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
//		JPanel panel = new JPanel();
//		JPanel panel = new DrawingPanel();
//		frame.add(panel);
//		frame.setVisible(true);
		
		Triangle triangle = new Triangle(width, height, side);
		frame.add(triangle);
		} catch (NumberFormatException e) {
			System.out.println("numbers only pls");
		}
	}
	
	protected void paint(Graphics g) {
		// TODO Auto-generated method stub
	}
}

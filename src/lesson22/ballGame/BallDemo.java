package lesson22.ballGame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class BallDemo {
	private static BallPanel ballPanel;
	private static JFrame frame;

	public static void main(String[] args) throws InterruptedException {
		frame = new JFrame();
		frame.setSize(800, 600);
		// frame.setLocation(1500, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ballPanel = new BallPanel();

		ballPanel.addKeyListener(new BallListener());
		ballPanel.setFocusable(true);
		frame.add(ballPanel);
		frame.setVisible(true);

		// frame.addKeyListener(new BallListener());

		while (true) {
			Thread.sleep(1);
			ballPanel.moveBall();
			ballPanel.repaint();
		}
	}

	private static class BallListener implements KeyListener {
		@Override
		public void keyTyped(KeyEvent e) {
		}

		@Override
		public void keyReleased(KeyEvent e) {
		}

		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				ballPanel.setStepX(-1);
				ballPanel.setStepY(0);
			} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				ballPanel.setStepX(1);
				ballPanel.setStepY(0);
			} else if (e.getKeyCode() == KeyEvent.VK_UP) {
				ballPanel.setStepX(0);
				ballPanel.setStepY(-1);
			} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
				ballPanel.setStepX(0);
				ballPanel.setStepY(1);
			} else if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				ballPanel.setStepX(0);
				ballPanel.setStepY(0);
			} else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
				frame.dispose();
			}
		}
	}
}

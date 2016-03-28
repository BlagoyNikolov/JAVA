package lesson22.ballGame;

import java.awt.Graphics;

import javax.swing.JPanel;

public class BallPanel extends JPanel {
	private static final long serialVersionUID = 4149814524351242031L;
	private static final int BALL_SIZE = 100;
	private int startX = 100;
	private int startY = 100;
	private int stepX = 1;
	private int stepY = 0;

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.fillOval(startX, startY, BALL_SIZE, BALL_SIZE);
	}

	public void moveBall() {
		startX += stepX;
		startY += stepY;
		if (startX + BALL_SIZE > getSize().getWidth()) {
			stepX = -1;
		}

		// if(startX > getSize().getWidth()) {
		// startX = -BALL_SIZE;
		// }

		if (startX < 0) {
			stepX = 1;
		}

		// if(startX + BALL_SIZE < 0) {
		// startX = (int)getSize().getWidth();
		// }

		if (startY + BALL_SIZE > getSize().getHeight()) {
			stepY = -1;
		}

		if (startY < 0) {
			stepY = 1;
		}
	}

	public void setStepX(int stepX) {
		this.stepX = stepX;
	}

	public void setStepY(int stepY) {
		this.stepY = stepY;
	}
}

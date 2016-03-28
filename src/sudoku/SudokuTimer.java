package sudoku;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;


import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class SudokuTimer extends JPanel {

	private static final long serialVersionUID = 4078178117615868064L;
	private static final byte N = 60;
	private JLabel time;
	private Timer timer;
	private int minutes;
	private int seconds;
	private int hours;

	public SudokuTimer() {
		super();
		setTimer();
	}

	public Timer getTimer() {
		return timer;
	}

	private class TimerListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			NumberFormat formatter = new DecimalFormat("00");
			if (seconds == N) {
				seconds = 00;
				minutes++;
			} else if (minutes == N) {
				minutes = 00;
				hours++;
			}
			String hoursStr = formatter.format(hours);
			String minutesStr = formatter.format(minutes);
			String secondsStr = formatter.format(seconds);
			time.setText("Time: " + hoursStr + ":" + minutesStr + ":" + secondsStr);
			seconds++;
		}
	}

	private void setTimer() {
		time = new JLabel("Time: 00:00:00");
		this.add(time);
		time.setFont(new Font("ROMAN_BASELINE", Font.ROMAN_BASELINE, 15));
		time.setOpaque(true);
		time.setForeground(Color.BLACK);
		timer = new Timer(1000, new TimerListener());
		timer.setRepeats(true);
		timer.setCoalesce(true);
		timer.start();
		time.setVisible(true);
	}

}

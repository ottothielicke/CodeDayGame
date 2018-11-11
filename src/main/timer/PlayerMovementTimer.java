package main.timer;
import javax.swing.Timer;

import main.listeners.TimerListener;
public class PlayerMovementTimer {
	public void startTimer() {
		Timer timer = new Timer(5, new TimerListener());
		timer.start();
	}
}

package main.timer;
import javax.swing.Timer;

import main.listeners.MovementTimerListener;
public class PlayerMovementTimer {
	public void startTimer() {
		Timer timer = new Timer(5, new MovementTimerListener());
		timer.start();
	}
}

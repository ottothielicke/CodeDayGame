package main.timer;

import javax.swing.Timer;
import main.listeners.*;
public class ProjectileMovementTimer {
	public void startTimer() {
		Timer timer = new Timer(2, new ProjectileMovementListener());
		timer.start();
	}
}

package main.interfaces;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import main.PlayerOne;
import main.PlayerTwo;

public interface KeyEventListener extends KeyListener {
	public default void keyPressed(KeyEvent e) {
		int c = e.getKeyCode();
		
		if (c == KeyEvent.VK_W) { //player one movement
			PlayerOne.VelY = -2; 
		} else if (c == KeyEvent.VK_S) {
			PlayerOne.VelY = 2;
		} else if (c == KeyEvent.VK_A) {
			PlayerOne.VelX = -2;
		} else if (c == KeyEvent.VK_D) {
			PlayerOne.VelX = 2;
		} 
		
		if (c == KeyEvent.VK_UP) { //player two movement
			PlayerTwo.VelJ = -2;
		} else if (c == KeyEvent.VK_DOWN) {
			PlayerTwo.VelJ = 2;
		} else if (c == KeyEvent.VK_LEFT) {
			PlayerTwo.VelI = -2;
		} else if (c == KeyEvent.VK_RIGHT) {
			PlayerTwo.VelI = 2;
		} 
		
	}
	public default void keyReleased(KeyEvent e) {
		int c = e.getKeyCode();
		
		if (c == KeyEvent.VK_W || c == KeyEvent.VK_S) { //stopping player one movement
			PlayerOne.VelY = 0; 
		} else if (c == KeyEvent.VK_A || c == KeyEvent.VK_D) {
			PlayerOne.VelX = 0;
		}
		
		if (c == KeyEvent.VK_UP || c == KeyEvent.VK_DOWN) { //stopping player two movement
			PlayerTwo.VelJ = 0;
		} else if (c == KeyEvent.VK_LEFT || c == KeyEvent.VK_RIGHT) {
			PlayerTwo.VelI = 0;
		}
	}
}

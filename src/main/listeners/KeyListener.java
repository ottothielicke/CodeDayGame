package main.listeners;
import java.awt.event.KeyEvent;

import main.characters.PlayerOne;
import main.characters.PlayerTwo;
import main.characters.projectiles.ProjectileOne;
import main.frames.containers.MainPanel;
import main.interfaces.*;
public class KeyListener implements KeyEventListener{

	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	public static int start = 1;
	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if (keyCode == KeyEvent.VK_W) { //player one movement
			PlayerOne.VelY = -2; 
		} else if (keyCode == KeyEvent.VK_S) {
			PlayerOne.VelY = 2;
		} else if (keyCode == KeyEvent.VK_A) {
			PlayerOne.VelX = -2;
		} else if (keyCode == KeyEvent.VK_D) {
			PlayerOne.VelX = 2;
		} 
		
		if (keyCode == KeyEvent.VK_LEFT) { //player two movement
			PlayerTwo.VelX = -2;
		} else if (keyCode == KeyEvent.VK_RIGHT) {
			PlayerTwo.VelX = 2;
		} else if (keyCode == KeyEvent.VK_UP) {
			PlayerTwo.VelY = -2;
		} else if (keyCode == KeyEvent.VK_DOWN) {
			PlayerTwo.VelY = 2;
		} 
		if(start == 1 && keyCode == KeyEvent.VK_NUMPAD2 || start == 1 && keyCode == KeyEvent.VK_NUMPAD4 || start == 1 && keyCode == KeyEvent.VK_NUMPAD6 || start == 1 && keyCode == KeyEvent.VK_NUMPAD8) {
			start = 0;
			ProjectileMovementListener.projectileFollow = false;
			MainPanel.drawProjectileOne = true;
			if(keyCode == KeyEvent.VK_NUMPAD6) {
				
				ProjectileOne.PROJECTILE_VELOCITY_X = 2;
				ProjectileOne.PROJECTILE_VELOCITY_Y = 0;
			}
			else if(keyCode == KeyEvent.VK_NUMPAD8) {
				ProjectileOne.PROJECTILE_VELOCITY_X = 0;
				ProjectileOne.PROJECTILE_VELOCITY_Y = -2;
			}
			else if(keyCode == KeyEvent.VK_NUMPAD4) {
				ProjectileOne.PROJECTILE_VELOCITY_X = -2;
				ProjectileOne.PROJECTILE_VELOCITY_Y = 0;
			}
			else if(keyCode == KeyEvent.VK_NUMPAD2) {
				ProjectileOne.PROJECTILE_VELOCITY_X = 0;
				ProjectileOne.PROJECTILE_VELOCITY_Y = 2;
			}
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int keyCode = e.getKeyCode();
		
		if (keyCode == KeyEvent.VK_W || keyCode == KeyEvent.VK_S) { //stopping player one movement
			PlayerOne.VelY = 0; 
		} else if (keyCode == KeyEvent.VK_A || keyCode == KeyEvent.VK_D) {
			PlayerOne.VelX = 0;
		}
		if (keyCode == KeyEvent.VK_UP || keyCode == KeyEvent.VK_DOWN) { //stopping player two movement
			PlayerTwo.VelY = 0;
		} else if (keyCode == KeyEvent.VK_LEFT || keyCode == KeyEvent.VK_RIGHT) {
			PlayerTwo.VelX = 0;
		}
		
	}

}

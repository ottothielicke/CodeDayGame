package main.listeners;
import java.awt.event.KeyEvent;

import main.characters.PlayerOne;
import main.characters.PlayerTwo;
import main.characters.projectiles.ProjectileOne;
import main.characters.projectiles.ProjectileTwo;
import main.frames.containers.MainPanel;
import main.interfaces.*;
public class KeyListener implements KeyEventListener{

	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	public static int start = 1;
	public static int startSecond = 1;
	public static boolean keyA = true;
	public static boolean keyW = true;
	public static boolean keyS = true;
	public static boolean keyD = true;
	public static boolean key8 = true;
	public static boolean key6 = true;
	public static boolean key4 = true;
	public static boolean key2 = true;
	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if (keyCode == KeyEvent.VK_W) { //player one movement
			if(keyW) {
				PlayerOne.VelY = -2; 
			}
		} else if (keyCode == KeyEvent.VK_S) {
			if(keyS) {
				PlayerOne.VelY = 2;
			}
		} else if (keyCode == KeyEvent.VK_A) {
			if(keyA) {
				PlayerOne.VelX = -2;
			}
		} else if (keyCode == KeyEvent.VK_D) {
			if(keyD) {
				PlayerOne.VelX = 2;
			}
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
		if(start == 1 && keyCode == KeyEvent.VK_J || start == 1 && keyCode == KeyEvent.VK_Y || start == 1 && keyCode == KeyEvent.VK_G || start == 1 && keyCode == KeyEvent.VK_H) {
			start = 0;
			ProjectileMovementListener.projectileFollow = false;
			MainPanel.drawProjectileOne = true;
			if(keyCode == KeyEvent.VK_J) {
				
				ProjectileOne.PROJECTILE_VELOCITY_X = 2;
				ProjectileOne.PROJECTILE_VELOCITY_Y = 0;
			}
			else if(keyCode == KeyEvent.VK_Y) {
				ProjectileOne.PROJECTILE_VELOCITY_X = 0;
				ProjectileOne.PROJECTILE_VELOCITY_Y = -2;
			}
			else if(keyCode == KeyEvent.VK_G) {
				ProjectileOne.PROJECTILE_VELOCITY_X = -2;
				ProjectileOne.PROJECTILE_VELOCITY_Y = 0;
			}
			else if(keyCode == KeyEvent.VK_H) {
				ProjectileOne.PROJECTILE_VELOCITY_X = 0;
				ProjectileOne.PROJECTILE_VELOCITY_Y = 2;
			}
		}
		if(startSecond == 1 && keyCode == KeyEvent.VK_NUMPAD2 || startSecond == 1 && keyCode == KeyEvent.VK_NUMPAD4 || startSecond == 1 && keyCode == KeyEvent.VK_NUMPAD6 || startSecond == 1 && keyCode == KeyEvent.VK_NUMPAD8) {
			startSecond = 0;
			ProjectileMovementListener.projectileTwoFollow = false;
			MainPanel.drawProjectileTwo = true;
			if(keyCode == KeyEvent.VK_NUMPAD6) {
				
				ProjectileTwo.PROJECTILE_VELOCITY_X = 2;
				ProjectileTwo.PROJECTILE_VELOCITY_Y = 0;
			}
			else if(keyCode == KeyEvent.VK_NUMPAD8) {
				ProjectileTwo.PROJECTILE_VELOCITY_X = 0;
				ProjectileOne.PROJECTILE_VELOCITY_Y = -2;
			}
			else if(keyCode == KeyEvent.VK_NUMPAD4) {
				ProjectileTwo.PROJECTILE_VELOCITY_X = -2;
				ProjectileTwo.PROJECTILE_VELOCITY_Y = 0;
			}
			else if(keyCode == KeyEvent.VK_NUMPAD2) {
				ProjectileTwo.PROJECTILE_VELOCITY_X = 0;
				ProjectileTwo.PROJECTILE_VELOCITY_Y = 2;
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

package main.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.characters.PlayerOne;
import main.characters.PlayerTwo;
import main.characters.projectiles.ProjectileOne;
import main.characters.projectiles.ProjectileTwo;
import main.frames.GameFrame;
import main.frames.containers.MainPanel;

public class ProjectileMovementListener implements ActionListener{
	public static boolean projectileFollow = true;
	public static boolean projectileTwoFollow = true;
	@Override
	public void actionPerformed(ActionEvent e) {
		if(projectileTwoFollow) {
			ProjectileTwo.PROJECTILE_X = PlayerTwo.X;
			ProjectileTwo.PROJECTILE_Y = PlayerTwo.Y;
		}
		if(projectileFollow) {
			ProjectileOne.PROJECTILE_X = PlayerOne.X;
			ProjectileOne.PROJECTILE_Y = PlayerOne.Y;
		}
		if(ProjectileOne.PROJECTILE_X > GameFrame.frame.getWidth() - 25) {
			ProjectileOne.PROJECTILE_VELOCITY_X = 0;
			MainPanel.drawProjectileOne = false;
			KeyListener.start = 1;
			ProjectileMovementListener.projectileFollow = true;
		}
		if(ProjectileOne.PROJECTILE_Y > GameFrame.frame.getHeight() - 43) {
			ProjectileOne.PROJECTILE_VELOCITY_Y = 0;
			MainPanel.drawProjectileOne = false;
			KeyListener.start = 1;
			ProjectileMovementListener.projectileFollow = true;
		}
		if(ProjectileOne.PROJECTILE_X < 1) {
			ProjectileOne.PROJECTILE_VELOCITY_X = 0;
			MainPanel.drawProjectileOne = false;
			KeyListener.start = 1;
			ProjectileMovementListener.projectileFollow = true;
		}
		if(ProjectileOne.PROJECTILE_Y < 1) {
			ProjectileOne.PROJECTILE_VELOCITY_Y = 0;
			MainPanel.drawProjectileOne = false;
			KeyListener.start = 1;
			ProjectileMovementListener.projectileFollow = true;
		}
		if(ProjectileTwo.PROJECTILE_X > GameFrame.frame.getWidth() - 25) {
			ProjectileTwo.PROJECTILE_VELOCITY_X = 0;
			MainPanel.drawProjectileTwo = false;
			KeyListener.startSecond = 1;
			ProjectileMovementListener.projectileTwoFollow = true;
		}
		if(ProjectileTwo.PROJECTILE_Y > GameFrame.frame.getHeight() - 43) {
			ProjectileTwo.PROJECTILE_VELOCITY_Y = 0;
			MainPanel.drawProjectileTwo = false;
			KeyListener.startSecond = 1;
			ProjectileMovementListener.projectileTwoFollow = true;
		}
		if(ProjectileTwo.PROJECTILE_X < 1) {
			ProjectileTwo.PROJECTILE_VELOCITY_X = 0;
			MainPanel.drawProjectileTwo = false;
			KeyListener.startSecond = 1;
			ProjectileMovementListener.projectileTwoFollow = true;
		}
		if(ProjectileTwo.PROJECTILE_Y < 1) {
			ProjectileTwo.PROJECTILE_VELOCITY_Y = 0;
			MainPanel.drawProjectileTwo = false;
			KeyListener.startSecond = 1;
			ProjectileMovementListener.projectileTwoFollow = true;
		}
		ProjectileOne.PROJECTILE_X += ProjectileOne.PROJECTILE_VELOCITY_X;
		ProjectileOne.PROJECTILE_Y += ProjectileOne.PROJECTILE_VELOCITY_Y;
		ProjectileTwo.PROJECTILE_X += ProjectileTwo.PROJECTILE_VELOCITY_X;
		ProjectileTwo.PROJECTILE_Y += ProjectileTwo.PROJECTILE_VELOCITY_Y;
		
	}

}

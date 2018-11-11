package main.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.characters.PlayerOne;
import main.characters.projectiles.ProjectileOne;
import main.frames.GameFrame;
import main.frames.containers.MainPanel;

public class ProjectileMovementListener implements ActionListener{
	public static boolean projectileFollow = true;
	@Override
	public void actionPerformed(ActionEvent e) {
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
		ProjectileOne.PROJECTILE_X += ProjectileOne.PROJECTILE_VELOCITY_X;
		ProjectileOne.PROJECTILE_Y += ProjectileOne.PROJECTILE_VELOCITY_Y;
		
	}

}

package main.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import main.characters.PlayerOne;
import main.characters.projectiles.ProjectileOne;

public class ProjectileMovementListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		ProjectileOne.PROJECTILE_X += ProjectileOne.PROJECTILE_VELOCITY_X;
		ProjectileOne.PROJECTILE_Y += ProjectileOne.PROJECTILE_VELOCITY_Y;
	}

}

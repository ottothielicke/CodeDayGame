package main.listeners;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import main.characters.PlayerOne;
import main.characters.projectiles.ProjectileOne;


public class MouseEventListeners implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getX() - PlayerOne.X < e.getY() - PlayerOne.Y) {
			if(e.getY() < PlayerOne.Y) {
				ProjectileOne.PROJECTILE_VELOCITY_X = 0;
				ProjectileOne.PROJECTILE_VELOCITY_Y = -1;
			}
			else {
				ProjectileOne.PROJECTILE_VELOCITY_X = 0;
				ProjectileOne.PROJECTILE_VELOCITY_Y = 1;
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getX() - PlayerOne.X < e.getY() - PlayerOne.Y) {
			if(e.getY() < PlayerOne.Y) {
				ProjectileOne.PROJECTILE_VELOCITY_X = 0;
				ProjectileOne.PROJECTILE_VELOCITY_Y = -1;
			}
			else {
				ProjectileOne.PROJECTILE_VELOCITY_X = 0;
				ProjectileOne.PROJECTILE_VELOCITY_Y = 1;
			}
		}
			
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		ProjectileOne.PROJECTILE_VELOCITY_X = 0;
		ProjectileOne.PROJECTILE_VELOCITY_Y = 0;
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}

package main.listeners;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import main.characters.PlayerOne;
import main.characters.projectiles.ProjectileOne;

public class MouseEventListeners implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		int start = 1;
		if(e.getButton() == MouseEvent.BUTTON1) {
			int startX = PlayerOne.X;
			int startY = PlayerOne.Y;
			if(start == 1) {
				ProjectileOne.PROJECTILE_X = PlayerOne.X;
				ProjectileOne.PROJECTILE_Y = PlayerOne.Y;
				
				
				start = 0;
			}
			double angle = Math.atan2(e.getY(), e.getX());
			System.out.println(angle);
			ProjectileOne.PROJECTILE_VELOCITY_X = (int) Math.ceil(( 2 * Math.cos(angle)));
			System.out.println(ProjectileOne.PROJECTILE_VELOCITY_X);
			System.out.println("real x velocity: " + 2 * Math.cos(angle));
			ProjectileOne.PROJECTILE_VELOCITY_Y = (int) Math.ceil(( 2 * Math.sin(angle)));
			System.out.println(" real y velocity: " + 2 * Math.sin(angle));
			System.out.println(ProjectileOne.PROJECTILE_VELOCITY_Y);
		}
		else if(e.getButton() == MouseEvent.BUTTON2) {
			ProjectileOne.PROJECTILE_VELOCITY_X = 0;
			ProjectileOne.PROJECTILE_VELOCITY_Y = 0;
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
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

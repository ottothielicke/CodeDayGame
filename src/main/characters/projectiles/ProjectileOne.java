package main.characters.projectiles;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

import main.frames.GameFrame;

public class ProjectileOne {
	public static int PROJECTILE_X;
	public static int PROJECTILE_Y;
	public static int PROJECTILE_VELOCITY_X = 0;
	public static int PROJECTILE_VELOCITY_Y = 0;
	public static void drawProjectile(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillOval(PROJECTILE_X, PROJECTILE_Y, 7, 3);
		JFrame frame = GameFrame.frame;
		frame.repaint();
	}
}

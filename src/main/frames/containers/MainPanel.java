package main.frames.containers;

import java.awt.Graphics;

import javax.swing.JPanel;

import main.characters.PlayerOne;
import main.characters.PlayerTwo;
import main.characters.projectiles.ProjectileOne;
@SuppressWarnings("serial")
public class MainPanel extends JPanel{
	public static boolean MouseEvent = false;
	public static JPanel panel = new JPanel();
	public static boolean drawProjectileOne = false;
	public void paintComponent(Graphics g) { //gets invoked when the constructor is called
		PlayerOne.paintComponent(g); 
		PlayerTwo.paintComponent(g);
		if(drawProjectileOne) {
			ProjectileOne.drawProjectile(g);
		}
	}
}

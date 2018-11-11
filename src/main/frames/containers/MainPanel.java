package main.frames.containers;

import java.awt.Graphics;

import javax.swing.JPanel;

import main.characters.Objects;
import main.characters.PlayerOne;
import main.characters.PlayerTwo;
import main.characters.healthbars.HealthBarOne;
import main.characters.healthbars.HealthBarTwo;
import main.characters.projectiles.ProjectileOne;
import main.characters.projectiles.ProjectileTwo;
@SuppressWarnings("serial")
public class MainPanel extends JPanel{
	public static boolean MouseEvent = false;
	public static JPanel panel = new JPanel();
	public static boolean drawProjectileOne = false;
	public static boolean drawProjectileTwo = false;
	public void paintComponent(Graphics g) { //gets invoked when the constructor is called
		PlayerOne.paintComponent(g); 
		PlayerTwo.paintComponent(g);
		Objects.paintComponents(g);
		if(drawProjectileOne) {
			ProjectileOne.drawProjectile(g);
		}
		if(drawProjectileTwo) {
			ProjectileTwo.drawProjectile(g);
		}
		HealthBarOne.paintComponent(g);
		HealthBarTwo.paintComponent(g);
	}
}

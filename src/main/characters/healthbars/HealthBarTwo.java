package main.characters.healthbars;

import java.awt.Color;
import java.awt.Graphics;

public class HealthBarTwo {
	public static int HEALTH = 200;
	public static void paintComponent(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(400, 10, HEALTH, 4);
		g.setColor(Color.BLACK);
		g.drawString("Player Two Health", 415, 15);
	}
}
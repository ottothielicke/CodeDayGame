package main.characters;

import java.awt.Color;
import java.awt.Graphics;

public class PlayerOne {
	public static int X = 100;
	public static int VelX = 0;
	public static int Y = 100;
	public static int VelY = 0;
	
	public static void paintComponent(Graphics g) {
		
		g.setColor(Color.RED);
		g.fillOval(X, Y, 25, 25);
		
		
	}
}

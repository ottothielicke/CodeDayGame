package main.characters;

import java.awt.Color;
import java.awt.Graphics;

public class PlayerTwo {
	public static int X = 50;
	public static int VelX = 0;
	public static int Y = 50;
	public static int VelY = 0;
	public static int CIRCLE_CENTER_X = X + 12;
	public static int CIRCLE_CENTER_Y = Y + 12;
	
	public static void paintComponent(Graphics g) { //invoked on class construction
		
		g.setColor(Color.BLUE);
		g.fillOval(X, Y, 25, 25);
		
	}
}

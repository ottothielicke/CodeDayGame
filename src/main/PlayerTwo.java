package main;

import java.awt.Color;
import java.awt.Graphics;

public class PlayerTwo {
	public static int I = 0;
	public static int J = 0;
	public static int VelI = 0;
	public static int VelJ = 0;
	
	public void paintComponents(Graphics g) {
		
		g.setColor(Color.BLUE);
		g.drawOval(I, J, 25, 25);
	}
}

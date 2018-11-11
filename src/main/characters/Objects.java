package main.characters;

import java.awt.Color;
import java.awt.Graphics;

public class Objects {
	public static int lengthFromSide = 50;
	public static int x = 1200 - 2 * lengthFromSide; //frame of calculations horz
	public static int y = 800 - 2 * lengthFromSide; //frame of calcs vert
	public static int[] objLocations = new int[48];
	public static int LineObj1X1 = 0;
	public static int LineObj1X2 = 0;
	public static int LineObj1Y1 = 0;
	public static int LineObj1Y2 = 0;
	
	public static int LineObj2X1 = 0;
	public static int LineObj2X2 = 0;
	public static int LineObj2Y1 = 0;
	public static int LineObj2Y2 = 0;
	
	public static int LineObj3X1 = 0;
	public static int LineObj3X2 = 0;
	public static int LineObj3Y1 = 0;
	public static int LineObj3Y2 = 0;

	public static int LineObj4X1 = 0;
	public static int LineObj4X2 = 0;
	public static int LineObj4Y1 = 0;
	public static int LineObj4Y2 = 0;
	
	public static int LineObj5X1 = 0;
	public static int LineObj5X2 = 0;
	public static int LineObj5Y1 = 0;
	public static int LineObj5Y2 = 0;
	
	public static int LineObj6X1 = 0;
	public static int LineObj6X2 = 0;
	public static int LineObj6Y1 = 0;
	public static int LineObj6Y2 = 0;
	
	public static int LineObj7X1 = 0;
	public static int LineObj7X2 = 0;
	public static int LineObj7Y1 = 0;
	public static int LineObj7Y2 = 0;
	
	public static int LineObj8X1 = 0;
	public static int LineObj8X2 = 0;
	public static int LineObj8Y1 = 0;
	public static int LineObj8Y2 = 0;
	
	public static int LineObj9X1 = 0;
	public static int LineObj9X2 = 0;
	public static int LineObj9Y1 = 0;
	public static int LineObj9Y2 = 0;

	public static int LineObj10X1 = 0;
	public static int LineObj10X2 = 0;
	public static int LineObj10Y1 = 0;
	public static int LineObj10Y2 = 0;
	
	public static int LineObj11X1 = 0;
	public static int LineObj11X2 = 0;
	public static int LineObj11Y1 = 0;
	public static int LineObj11Y2 = 0;
	
	public static int LineObj12X1 = 0;
	public static int LineObj12X2 = 0;
	public static int LineObj12Y1 = 0;
	public static int LineObj12Y2 = 0;
	
	public static double lScale = ((Math.random() * 8) + 3);
	public static double hScale = ((Math.random() * 8) + 3);
	public static int length = (int)(x / lScale);
	public static int height = (int)(y / hScale);
	public static int xPlacement = x / 2 - length - lengthFromSide;
	public static int positionL = ((int)((Math.random() * (xPlacement - length) + length + lengthFromSide)));
	public static int positionH = ((int)((Math.random() * (y - height) + lengthFromSide))); 
	
	public static double lScale2 = ((Math.random() * 8) + 3);
	public static double hScale2 = ((Math.random() * 8) + 3);
	public static int length2 = (int)(x / lScale2);
	public static int height2 = (int)(y / hScale2);
	public static int xPlacement2 = x / 2 - length2 - lengthFromSide;
	public static int positionL2 = ((int)((Math.random() * (xPlacement2 - length2) + length2 + lengthFromSide)));
	public static int positionH2 = ((int)((Math.random() * (y - height2) + lengthFromSide)));
	
	public static double lScale3 = ((Math.random() * 8) + 3);
	public static double hScale3 = ((Math.random() * 8) + 3);
	public static int length3 = (int)(x / lScale3);
	public static int height3 = (int)(y / hScale3);
	public static int xPlacement3 = x / 2 - length3 - lengthFromSide;
	public static int positionL3 = ((int)((Math.random() * (xPlacement3 - length3) + length3 + lengthFromSide)));
	public static int positionH3 = ((int)((Math.random() * (y - height3) + lengthFromSide)));
	
	public static double lScale4 = ((Math.random() * 8) + 3);
	public static double hScale4 = ((Math.random() * 8) + 3);
	public static int length4 = (int)(x / lScale4);
	public static int height4 = (int)(y / hScale4);
	public static int xPlacement4 = x / 2 - length4 - lengthFromSide;
	public static int positionL4 = ((int)((Math.random() * (xPlacement4 - length4) + length4 + lengthFromSide)));
	public static int positionH4 = ((int)((Math.random() * (y - height4) + lengthFromSide))); 
	
	public static double lScale5 = ((Math.random() * 8) + 3);
	public static double hScale5 = ((Math.random() * 8) + 3);
	public static int length5 = (int)(x / lScale5);
	public static int height5 = (int)(y / hScale5);
	public static int xPlacement5 = x / 2 - length5 - lengthFromSide;
	public static int positionL5 = ((int)((Math.random() * (xPlacement5 - length5) + length5 + lengthFromSide)));
	public static int positionH5 = ((int)((Math.random() * (y - height5) + lengthFromSide)));
	
	public static double lScale6 = ((Math.random() * 8) + 3);
	public static double hScale6 = ((Math.random() * 8) + 3);
	public static int length6 = (int)(x / lScale6);
	public static int height6 = (int)(y / hScale6);
	public static int xPlacement6 = x / 2 - length6 - lengthFromSide;
	public static int positionL6 = ((int)((Math.random() * (xPlacement6 - length6) + length6 + lengthFromSide)));
	public static int positionH6 = ((int)((Math.random() * (y - height6) + lengthFromSide)));
	
	public static void paintComponents(Graphics g) {
		g.setColor(Color.BLACK);
		//first obj and reflection obj
		g.fillRect(positionL, positionH, length, height);
		LineObj1X1 = positionL;
		LineObj1X2 = positionL + length;
		LineObj1Y1 = positionH;
		LineObj1Y2 = positionH - height;
		g.setColor(Color.BLUE);
		g.fillRect(x - positionL - length, positionH, length, height);
		LineObj2X1 = x - positionL - length;
		LineObj2X2 = x - positionL - length + length;
		LineObj2Y1 = positionH;
		LineObj2Y2 = positionH - height;
		
		//second obj and reflection obj
		g.fillRect(positionL2, positionH2, length2, height2);
		LineObj3X1 = positionL2;
		LineObj3X2 = positionL2 + length2;
		LineObj3Y1 = positionH2;
		LineObj3Y2 = positionH2 - height2;
		
		g.fillRect(x - positionL2 - length2, positionH2, length2, height2);
		LineObj4X1 = x - positionL2 - length2;
		LineObj4X2 = x - positionL2 - length2 + length2;
		LineObj4Y1 = positionH2;
		LineObj4Y2 = positionH2 - height2;
		
		//third obj and reflection obj
		g.fillRect(positionL3, positionH3, length3, height3);
		LineObj5X1 = positionL3;
		LineObj5X2 = positionL3 + length3;
		LineObj5Y1 = positionH3;
		LineObj5Y2 = positionH3 - height3;
				
		g.fillRect(x - positionL3 - length3, positionH3, length3, height3);
		LineObj6X1 = x - positionL3 - length3;
		LineObj6X2 = x - positionL3 - length3 + length3;
		LineObj6Y1 = positionH3;
		LineObj6Y2 = positionH3 - height3;
		
		//4th obj and reflection obj
		g.fillRect(positionL4, positionH4, length4, height4);
		LineObj7X1 = positionL4;
		LineObj7X2 = positionL4 + length4;
		LineObj7Y1 = positionH4;
		LineObj7Y2 = positionH4 - height4;
			
		g.fillRect(x - positionL4 - length4, positionH4, length4, height4);
		LineObj8X1 = x - positionL4 - length4;
		LineObj8X2 = x - positionL4 - length4 + length4;
		LineObj8Y1 = positionH4;
		LineObj8Y2 = positionH4 - height4;
		
		//5th obj and reflection obj
		g.fillRect(positionL5, positionH5, length5, height5);
		LineObj9X1 = positionL5;
		LineObj9X2 = positionL5 + length5;
		LineObj9Y1 = positionH5;
		LineObj9Y2 = positionH5 - height5;
				
		g.fillRect(x - positionL5 - length5, positionH5, length5, height5);
		LineObj10X1 = x - positionL5 - length5;
		LineObj10X2 = x - positionL5 - length5 + length5;
		LineObj10Y1 = positionH5;
		LineObj10Y2 = positionH5 - height5;
		
		//6th obj and reflection obj
		g.fillRect(positionL6, positionH6, length6, height6);
		LineObj11X1 = positionL6;
		LineObj11X2 = positionL6 + length6;
		LineObj11Y1 = positionH6;
		LineObj11Y2 = positionH6 - height6;
				
		g.fillRect(x - positionL6 - length6, positionH6, length6, height6);
		LineObj12X1 = x - positionL6 - length6;
		LineObj12X2 = x - positionL6 - length6 + length6;
		LineObj12Y1 = positionH6;
		LineObj12Y2 = positionH6 - height6;
	}
}

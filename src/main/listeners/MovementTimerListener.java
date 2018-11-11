package main.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import main.characters.Objects;
import main.characters.PlayerOne;
import main.characters.PlayerTwo;
import main.frames.GameFrame;

public class MovementTimerListener implements ActionListener{
	public static int firstIf = 1;
	@Override
	public void actionPerformed(ActionEvent e) {
		if(PlayerOne.X > Objects.LineObj1X1 - 25 && PlayerOne.Y > Objects.LineObj1Y1 - 30 && PlayerOne.X < Objects.LineObj1X2 && PlayerOne.Y < Objects.LineObj1Y2 ) {
			if(firstIf == 1) {
				PlayerOne.VelX = 0;
				PlayerOne.VelY = 0;
				firstIf = 0;
			}
			if(PlayerOne.X < Objects.LineObj1X2 + 3 && PlayerOne.X > Objects.LineObj1X2 - 30) {
				KeyListener.keyA = false;
			} 
			if(PlayerOne.X + 60 > Objects.LineObj1X1 && PlayerOne.X < Objects.LineObj1X2 - 20) {
				KeyListener.keyD = false;
			}
			if(PlayerOne.Y < Objects.LineObj1Y2 && PlayerOne.Y > Objects.LineObj1Y2 - 30) {
				KeyListener.keyW = false;
			}
			if(PlayerOne.Y + 60 > Objects.LineObj1Y1 && PlayerOne.Y < Objects.LineObj1Y2 - 20) {
				KeyListener.keyS = false;
			}
		}
		
		else if(PlayerOne.X > Objects.LineObj2X1 - 25 && PlayerOne.Y > Objects.LineObj2Y1 - 30  && PlayerOne.X < Objects.LineObj2X2 && PlayerOne.Y < Objects.LineObj2Y2 ) {
			if(firstIf == 1) {
				PlayerOne.VelX = 0;
				PlayerOne.VelY = 0;
				firstIf = 0;
			}
			
			if(PlayerOne.X < Objects.LineObj2X2 + 3 && PlayerOne.X > Objects.LineObj2X2 - 30) {
				KeyListener.keyA = false;
			} 
			if(PlayerOne.X + 60 > Objects.LineObj2X1 && PlayerOne.X < Objects.LineObj2X2 - 20) {
				KeyListener.keyD = false;
			}
			if(PlayerOne.Y < Objects.LineObj2Y2 && PlayerOne.Y > Objects.LineObj2Y2 - 30) {
				KeyListener.keyW = false;
			}
			if(PlayerOne.Y + 60 > Objects.LineObj2Y1 && PlayerOne.Y < Objects.LineObj2Y2 - 20) {
				KeyListener.keyS = false;
			}
		}
		
		else if(PlayerOne.X > Objects.LineObj3X1 - 25 && PlayerOne.Y > Objects.LineObj3Y1 - 30 && PlayerOne.X < Objects.LineObj3X2 && PlayerOne.Y < Objects.LineObj3Y2 ) {
			if(firstIf == 1) {
				PlayerOne.VelX = 0;
				PlayerOne.VelY = 0;
				firstIf = 0;
			}
			if(PlayerOne.X < Objects.LineObj3X2 + 3 && PlayerOne.X > Objects.LineObj3X2 - 30) {
				KeyListener.keyA = false;
			} 
			if(PlayerOne.X + 60 > Objects.LineObj3X1 && PlayerOne.X < Objects.LineObj3X2 - 20) {
				KeyListener.keyD = false;
			}
			if(PlayerOne.Y < Objects.LineObj3Y2 && PlayerOne.Y > Objects.LineObj3Y2 - 30) {
				KeyListener.keyW = false;
			}
			if(PlayerOne.Y + 60 > Objects.LineObj3Y1 && PlayerOne.Y < Objects.LineObj3Y2 - 20) {
				KeyListener.keyS = false;
			}
		}
		
		else if(PlayerOne.X > Objects.LineObj4X1 - 25 && PlayerOne.Y > Objects.LineObj4Y1 - 30 && PlayerOne.X < Objects.LineObj4X2 && PlayerOne.Y < Objects.LineObj4Y2 ) {
			if(firstIf == 1) {
				PlayerOne.VelX = 0;
				PlayerOne.VelY = 0;
				firstIf = 0;
			}
			if(PlayerOne.X < Objects.LineObj4X2 + 3 && PlayerOne.X > Objects.LineObj4X2 - 30) {
				KeyListener.keyA = false;
			} 
			if(PlayerOne.X + 60 > Objects.LineObj4X1 && PlayerOne.X < Objects.LineObj4X2 - 20) {
				KeyListener.keyD = false;
			}
			if(PlayerOne.Y < Objects.LineObj4Y2 && PlayerOne.Y > Objects.LineObj4Y2 - 30) {
				KeyListener.keyW = false;
			}
			if(PlayerOne.Y + 60 > Objects.LineObj4Y1 && PlayerOne.Y < Objects.LineObj4Y2 - 20) {
				KeyListener.keyS = false;
			}
		}
		
		else if(PlayerOne.X > Objects.LineObj5X1 - 25 && PlayerOne.Y > Objects.LineObj5Y1 - 30 && PlayerOne.X < Objects.LineObj5X2 && PlayerOne.Y < Objects.LineObj5Y2 ) {
			if(firstIf == 1) {
				PlayerOne.VelX = 0;
				PlayerOne.VelY = 0;
				firstIf = 0;
			}
			if(PlayerOne.X < Objects.LineObj5X2 + 3 && PlayerOne.X > Objects.LineObj5X2 - 30) {
				KeyListener.keyA = false;
			} 
			if(PlayerOne.X + 60 > Objects.LineObj5X1 && PlayerOne.X < Objects.LineObj5X2 - 20) {
				KeyListener.keyD = false;
			}
			if(PlayerOne.Y < Objects.LineObj5Y2 && PlayerOne.Y > Objects.LineObj5Y2 - 30) {
				KeyListener.keyW = false;
			}
			if(PlayerOne.Y + 60 > Objects.LineObj5Y1 && PlayerOne.Y < Objects.LineObj5Y2 - 20) {
				KeyListener.keyS = false;
			}
		}
		
		else if(PlayerOne.X > Objects.LineObj6X1 - 25 && PlayerOne.Y > Objects.LineObj6Y1 - 30 && PlayerOne.X < Objects.LineObj6X2 && PlayerOne.Y < Objects.LineObj6Y2 ) {
			if(firstIf == 1) {
				PlayerOne.VelX = 0;
				PlayerOne.VelY = 0;
				firstIf = 0;
			}
			if(PlayerOne.X < Objects.LineObj6X2 + 3 && PlayerOne.X > Objects.LineObj6X2 - 30) {
				KeyListener.keyA = false;
			} 
			if(PlayerOne.X + 60 > Objects.LineObj6X1 && PlayerOne.X < Objects.LineObj6X2 - 20) {
				KeyListener.keyD = false;
			}
			if(PlayerOne.Y < Objects.LineObj6Y2 && PlayerOne.Y > Objects.LineObj6Y2 - 30) {
				KeyListener.keyW = false;
			}
			if(PlayerOne.Y + 60 > Objects.LineObj6Y1 && PlayerOne.Y < Objects.LineObj6Y2 - 20) {
				KeyListener.keyS = false;
			}
		}
		
		else if(PlayerOne.X > Objects.LineObj7X1 - 25 && PlayerOne.Y > Objects.LineObj7Y1 - 30 && PlayerOne.X < Objects.LineObj7X2 && PlayerOne.Y < Objects.LineObj7Y2 ) {
			if(firstIf == 1) {
				PlayerOne.VelX = 0;
				PlayerOne.VelY = 0;
				firstIf = 0;
			}
			if(PlayerOne.X < Objects.LineObj7X2 + 3 && PlayerOne.X > Objects.LineObj7X2 - 30) {
				KeyListener.keyA = false;
			} 
			if(PlayerOne.X + 60 > Objects.LineObj7X1 && PlayerOne.X < Objects.LineObj7X2 - 20) {
				KeyListener.keyD = false;
			}
			if(PlayerOne.Y < Objects.LineObj7Y2 && PlayerOne.Y > Objects.LineObj7Y2 - 30) {
				KeyListener.keyW = false;
			}
			if(PlayerOne.Y + 60 > Objects.LineObj7Y1 && PlayerOne.Y < Objects.LineObj7Y2 - 20) {
				KeyListener.keyS = false;
			}
		}
		
		else if(PlayerOne.X > Objects.LineObj8X1 - 25 && PlayerOne.Y > Objects.LineObj8Y1 - 30 && PlayerOne.X < Objects.LineObj8X2 && PlayerOne.Y < Objects.LineObj8Y2 ) {
			if(firstIf == 1) {
				PlayerOne.VelX = 0;
				PlayerOne.VelY = 0;
				firstIf = 0;
			}
			if(PlayerOne.X < Objects.LineObj8X2 + 3 && PlayerOne.X > Objects.LineObj8X2 - 30) {
				KeyListener.keyA = false;
			} 
			if(PlayerOne.X + 60 > Objects.LineObj8X1 && PlayerOne.X < Objects.LineObj8X2 - 20) {
				KeyListener.keyD = false;
			}
			if(PlayerOne.Y < Objects.LineObj8Y2 && PlayerOne.Y > Objects.LineObj8Y2 - 30) {
				KeyListener.keyW = false;
			}
			if(PlayerOne.Y + 60 > Objects.LineObj8Y1 && PlayerOne.Y < Objects.LineObj8Y2 - 20) {
				KeyListener.keyS = false;
			}
		}
		
		else if(PlayerOne.X > Objects.LineObj9X1 - 25 && PlayerOne.Y > Objects.LineObj9Y1 - 30 && PlayerOne.X < Objects.LineObj9X2 && PlayerOne.Y < Objects.LineObj9Y2 ) {
			if(firstIf == 1) {
				PlayerOne.VelX = 0;
				PlayerOne.VelY = 0;
				firstIf = 0;
			}
			if(PlayerOne.X < Objects.LineObj9X2 + 3 && PlayerOne.X > Objects.LineObj9X2 - 30) {
				KeyListener.keyA = false;
			} 
			if(PlayerOne.X + 60 > Objects.LineObj9X1 && PlayerOne.X < Objects.LineObj9X2 - 20) {
				KeyListener.keyD = false;
			}
			if(PlayerOne.Y < Objects.LineObj9Y2 && PlayerOne.Y > Objects.LineObj9Y2 - 30) {
				KeyListener.keyW = false;
			}
			if(PlayerOne.Y + 60 > Objects.LineObj9Y1 && PlayerOne.Y < Objects.LineObj9Y2 - 20) {
				KeyListener.keyS = false;
			}
		}
		
		else if(PlayerOne.X > Objects.LineObj10X1 - 25 && PlayerOne.Y > Objects.LineObj10Y1 - 30 && PlayerOne.X < Objects.LineObj10X2 && PlayerOne.Y < Objects.LineObj10Y2 ) {
			if(firstIf == 1) {
				PlayerOne.VelX = 0;
				PlayerOne.VelY = 0;
				firstIf = 0;
			}
			if(PlayerOne.X < Objects.LineObj10X2 + 3 && PlayerOne.X > Objects.LineObj10X2 - 30) {
				KeyListener.keyA = false;
			} 
			if(PlayerOne.X + 60 > Objects.LineObj10X1 && PlayerOne.X < Objects.LineObj10X2 - 20) {
				KeyListener.keyD = false;
			}
			if(PlayerOne.Y < Objects.LineObj10Y2 && PlayerOne.Y > Objects.LineObj10Y2 - 30) {
				KeyListener.keyW = false;
			}
			if(PlayerOne.Y + 60 > Objects.LineObj10Y1 && PlayerOne.Y < Objects.LineObj10Y2 - 20) {
				KeyListener.keyS = false;
			}
		}
		
		else if(PlayerOne.X > Objects.LineObj11X1 - 25 && PlayerOne.Y > Objects.LineObj11Y1 - 30 && PlayerOne.X < Objects.LineObj11X2 && PlayerOne.Y < Objects.LineObj11Y2 ) {
			if(firstIf == 1) {
				PlayerOne.VelX = 0;
				PlayerOne.VelY = 0;
				firstIf = 0;
			}
			if(PlayerOne.X < Objects.LineObj11X2 + 3 && PlayerOne.X > Objects.LineObj11X2 - 30) {
				KeyListener.keyA = false;
			} 
			if(PlayerOne.X + 60 > Objects.LineObj11X1 && PlayerOne.X < Objects.LineObj11X2 - 20) {
				KeyListener.keyD = false;
			}
			if(PlayerOne.Y < Objects.LineObj11Y2 && PlayerOne.Y > Objects.LineObj11Y2 - 30) {
				KeyListener.keyW = false;
			}
			if(PlayerOne.Y + 60 > Objects.LineObj11Y1 && PlayerOne.Y < Objects.LineObj11Y2 - 20) {
				KeyListener.keyS = false;
			}
		}
		
		else if(PlayerOne.X > Objects.LineObj12X1 - 25 && PlayerOne.Y > Objects.LineObj12Y1 - 30 && PlayerOne.X < Objects.LineObj12X2 && PlayerOne.Y < Objects.LineObj12Y2 ) {
			if(firstIf == 1) {
				PlayerOne.VelX = 0;
				PlayerOne.VelY = 0;
				firstIf = 0;
			}
			if(PlayerOne.X < Objects.LineObj12X2 + 3 && PlayerOne.X > Objects.LineObj12X2 - 30) {
				KeyListener.keyA = false;
			} 
			if(PlayerOne.X + 60 > Objects.LineObj12X1 && PlayerOne.X < Objects.LineObj12X2 - 20) {
				KeyListener.keyD = false;
			}
			if(PlayerOne.Y < Objects.LineObj12Y2 && PlayerOne.Y > Objects.LineObj12Y2 - 30) {
				KeyListener.keyW = false;
			}
			if(PlayerOne.Y + 60 > Objects.LineObj12Y1 && PlayerOne.Y < Objects.LineObj12Y2 - 20) {
				KeyListener.keyS = false;
			}
		}
		else {
			KeyListener.keyA = true;
			KeyListener.keyD = true;
			KeyListener.keyS = true;
			KeyListener.keyW = true;
			firstIf = 1;
		}
		
		PlayerOne.X += PlayerOne.VelX;
		PlayerOne.Y += PlayerOne.VelY;
		PlayerTwo.X += PlayerTwo.VelX;
		PlayerTwo.Y += PlayerTwo.VelY;
		JFrame frame = GameFrame.frame;
		frame.repaint();
	}

}

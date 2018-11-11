package main.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import main.characters.Objects;
import main.characters.PlayerOne;
import main.characters.PlayerTwo;
import main.frames.GameFrame;

public class MovementTimerListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		if (PlayerOne.X < Objects.LineObj1X1 - 13) {
			if ((PlayerOne.Y < Objects.LineObj1Y1) && (PlayerOne.Y < Objects.LineObj1Y2)) {
				PlayerOne.VelX = 0;
				PlayerOne.X = Objects.LineObj1X1 - 13;
			}
		}
		
		if (PlayerOne.X > Objects.LineObj1X2 + 13) {
			if ((PlayerOne.Y < Objects.LineObj1Y1) && (PlayerOne.Y < Objects.LineObj1Y2)) {
				PlayerOne.VelX = 0;
				PlayerOne.X = Objects.LineObj1X2 + 13;
			}
		}
		
		if (PlayerOne.Y < Objects.LineObj1Y1 + 13) {
			if ((PlayerOne.X < Objects.LineObj1X1) && (PlayerOne.X < Objects.LineObj1X2)) {
				PlayerOne.VelY = 0;
				PlayerOne.Y = Objects.LineObj1Y1 + 13;
			}
		}
		
		if (PlayerOne.Y > Objects.LineObj1Y2 - 13) {
			if ((PlayerOne.X < Objects.LineObj1X1) && (PlayerOne.X < Objects.LineObj1X2)) {
				PlayerOne.VelY = 0;
				PlayerOne.Y = Objects.LineObj1Y2 - 13;
			}
		}
		PlayerOne.X += PlayerOne.VelX;
		PlayerOne.Y += PlayerOne.VelY;
		PlayerTwo.X += PlayerTwo.VelX;
		PlayerTwo.Y += PlayerTwo.VelY;
		JFrame frame = GameFrame.frame;
		frame.repaint();
	}

}

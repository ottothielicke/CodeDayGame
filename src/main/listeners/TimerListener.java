package main.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import main.characters.PlayerOne;
import main.characters.PlayerTwo;
import main.frames.GameFrame;

public class TimerListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		PlayerOne.X += PlayerOne.VelX;
		PlayerOne.Y += PlayerOne.VelY;
		PlayerTwo.X += PlayerTwo.VelX;
		PlayerTwo.Y += PlayerTwo.VelY;
		JFrame yoink = GameFrame.frame;
		yoink.repaint();
	}

}

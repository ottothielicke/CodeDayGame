package main.frames.containers;

import java.awt.Graphics;

import javax.swing.JPanel;

import main.characters.PlayerOne;
import main.characters.PlayerTwo;
@SuppressWarnings("serial")
public class MainPanel extends JPanel{
	public static JPanel panel = new JPanel();
	public void paintComponent(Graphics g) { //gets invoked when the constructor is called
		PlayerOne.paintComponent(g); 
		PlayerTwo.paintComponent(g);
		
	}
}

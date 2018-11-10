package main;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class GameFrame extends JFrame {
	private static JFrame frame = new JFrame("Game Window");
	public void init() {
		frame.setSize(1280, 720);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

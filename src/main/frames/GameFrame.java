package main.frames;

import javax.swing.JFrame;
import javax.swing.JPanel;

import main.frames.containers.MainPanel;
import main.listeners.*;
import main.timer.PlayerMovementTimer;
import main.timer.ProjectileMovementTimer;
@SuppressWarnings("serial")
public class GameFrame extends JFrame {
	public static JFrame frame = new JFrame("Game Window");
	public static JPanel panel = new MainPanel();
	public static void init() {
		frame.setSize(1280, 720);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.addKeyListener(new KeyListener());
		frame.setResizable(false);
		
		frame.add(panel);
		frame.addMouseListener(new MouseEventListeners());
		PlayerMovementTimer movementtimer = new PlayerMovementTimer();
		movementtimer.startTimer();
		ProjectileMovementTimer projectilemovementtimer = new ProjectileMovementTimer();
		projectilemovementtimer.startTimer();
	}
}

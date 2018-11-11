package main.launcher;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import main.launcher.listeners.ButtonListeners;

public class Launcher {
	public static JButton start = new JButton("Start");
	public static JFrame frame = new JFrame("Launcher");
	public static void init() {
		frame.setSize(512, 256);
		frame.setLayout(new GridLayout(2,2));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		start.addActionListener(new ButtonListeners());
		frame.add(start);
		frame.setVisible(true);
	}
	public static void close() {
		frame.setVisible(false);
		frame.dispose();
		start.setEnabled(false);
	}
}

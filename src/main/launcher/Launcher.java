package main.launcher;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import main.launcher.listeners.ButtonListeners;

public class Launcher {
	public static JButton start = new JButton("Start");
	public static JFrame frame = new JFrame("Launcher");
	public static JTextField input = new JTextField();
	public static JButton set = new JButton("Set Resolution");
	public static void init() {
		frame.setSize(512, 256);
		frame.setLayout(new GridLayout(2,2));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		start.addActionListener(new ButtonListeners());
		frame.add(start);
		frame.add(input);
		frame.add(set);
		set.addActionListener(new ButtonListeners());
		frame.setVisible(true);
		
		
	}
	public static void close() {
		frame.setVisible(false);
		frame.dispose();
		start.setEnabled(false);
	}
	public static void setVariables() {
		String inputString = input.getText();
		String[] input = inputString.split("x");
		try {
		// GameFrame.XFrame = Integer.parseInt(input[0]);
		// GameFrame.YFrame = Integer.parseInt(input[1]);
			int x = 3 / 0;
		}
		catch(Throwable t) {
			Launcher.input.setText("Input Valid Resolution(XResxYRes)");
		}
	}
}

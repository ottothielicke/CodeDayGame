package main;

import javax.swing.SwingUtilities;

import main.frames.GameFrame;

public class Main {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GameFrame.init(); //Initializes GameFrame by invoking init() method from event dispatching thread
			}
		});
	}
}

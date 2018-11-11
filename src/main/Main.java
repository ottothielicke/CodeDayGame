package main;

import javax.swing.SwingUtilities;

import main.launcher.Launcher;

public class Main {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Launcher.init(); //Initializes GameFrame by invoking init() method from event dispatching thread
			}
		});
	}
}

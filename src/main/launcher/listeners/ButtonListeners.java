package main.launcher.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingUtilities;

import main.frames.GameFrame;
import main.launcher.Launcher;

public class ButtonListeners implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == Launcher.start) {
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					GameFrame.init();
				}
			});
			Launcher.close();
		}
		if(e.getSource() == Launcher.set) {
			Launcher.setVariables();
		}
		
	}
	
}

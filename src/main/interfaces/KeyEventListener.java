package main.interfaces;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public interface KeyEventListener extends KeyListener {
	public void keyPressed(KeyEvent e);
	public void keyReleased(KeyEvent e);
}

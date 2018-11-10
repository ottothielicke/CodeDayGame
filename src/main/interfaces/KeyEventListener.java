package main.interfaces;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public interface KeyEventListener extends KeyListener {
	public default void keyPressed(KeyEvent e) {
	}
	public default void keyReleased(KeyEvent e) {
	}
}

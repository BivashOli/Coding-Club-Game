package core;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyInput implements KeyListener{

	private static boolean[] bool = new boolean[65535];
	
	public static boolean get(int keycode) {
		if(bool[keycode]) {
			return true;
		}else {
			return false;
		}
	}
	
	public void keyPressed(KeyEvent e) {
		bool[e.getKeyCode()] = true;	
	}

	public void keyReleased(KeyEvent e) {
		bool[e.getKeyCode()] = false;
	}

	public void keyTyped(KeyEvent e) {
		
	}

}

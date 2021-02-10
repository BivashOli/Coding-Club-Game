package test;

import java.awt.event.KeyEvent;
import core.entities.Entity;


import core.KeyInput;
import core.Scene;
import core.components.Physics;

public class Player extends Entity{

	private Physics p;
	
	public Player(int x, int y, Scene scene) {
		super(x, y, scene);
	}
	
	public void init() {
		addComponent(new Physics()); 
		texture = "chicken.png";
		p = (Physics) components.get(0);
	}
	
	public void action() {
		if(KeyInput.get(KeyEvent.VK_D)) {
			//x+=6;
			p.velX = 6;
		}else if(KeyInput.get(KeyEvent.VK_A)) {
			//x-=6;
			p.velX = -6;
		}else if(KeyInput.get(KeyEvent.VK_W)) {
			//y-=6;
			p.velY = -6;
		}else if(KeyInput.get(KeyEvent.VK_S)) {
			//y+=6;
			p.velY = 6;
		}
	}

}

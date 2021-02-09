package test;

import core.entities.Entity;
import core.Scene;
import core.components.Physics;

public class Enemy extends Entity{

	public Enemy(int x, int y, Scene scene) {
		super(x, y, scene);
	}
	
	public void init() {
		addComponent(new Physics()); 
	}
	
	public void action() {
		y+=0;
		if(y >= 300) {
			scene = null;
		}
	}

}

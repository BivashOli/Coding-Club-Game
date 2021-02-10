package game.entities.enemies;

import core.Scene;
import core.entities.Entity;

public abstract class Enemy extends Entity{
	
	//initializing enemy
	public Enemy(int x, int y, Scene scene) {
		super(x, y, scene);
	}
	
	//there is already an init() built in entity  - bivash
	//public abstract void init();

}

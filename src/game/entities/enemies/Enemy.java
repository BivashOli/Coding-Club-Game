package game.entities.enemies;

import core.Scene;

public abstract class Enemy extends Entity{
	
	//initializing enemy
	public Enemy(int x, int y, Scene scene) {
		super(x, y, scene);
		public abstract void init();
	}
}

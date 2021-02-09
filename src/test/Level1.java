package test;

import core.Scene;

public class Level1 extends Scene {

	private Enemy enemy;
	private Player player;

	public void init() {
		enemy = new Enemy(400, 33, this);
		player = new Player(22, 200, this);
	}
	
	public void action() {
//		if(enemy.collides(player)) {
//			//System.out.println("OMG");
//		}
	}

	

}

package game.scenes;

import core.Scene;
import core.entities.Camera;
import game.entities.enemies.TestEnemy;
import game.entities.player.Player;

public class TestScene extends Scene {

	public void init() {	
	
		Player player = new Player(30, 30, this);
		camera = new Camera(0, 0, player);
		TestEnemy t = new TestEnemy(100, 200, this);
	}
	

}
package game.scenes;

import core.Scene;
import core.entities.Camera;
import game.entities.enemies.TestEnemy;
import game.entities.player.Player;

public class TestScene extends Scene {

	public void init() {	
	
		Player player = new Player(30, 30, this);
<<<<<<< HEAD
//<<<<<<< HEAD
		
	}
//=======
//	
// 	}
//>>>>>>> 594b1e968d2a71613751e344bac3cc38a2ed38f4
	public void action() {
		
		
		
	}
=======
		camera = new Camera(0, 0, player);
		TestEnemy t = new TestEnemy(100, 200, this);
	}
	

>>>>>>> 137401b922ea461537679de7bb0f585adfbf1cd6
}
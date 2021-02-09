package core;

public class Level1 extends Scene{

	public void init() {
		Enemy enemy = new Enemy(400, 33, this);
		Player player = new Player(22, 200, this);
	}

}

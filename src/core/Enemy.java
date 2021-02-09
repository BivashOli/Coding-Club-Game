package core;

public class Enemy extends Entity{

	public Enemy(int x, int y, Scene scene) {
		super(x, y, scene);
	}
	
	public void update() {
		y+=5;
		if(y >= 300) {
			scene = null;
		}
	}

}

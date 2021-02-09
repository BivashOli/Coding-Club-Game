package core;
import java.awt.event.KeyEvent;

public class Player extends Entity{

	public Player(int x, int y, Scene scene) {
		super(x, y, scene);
	}
	
	public void update() {
		if(KeyInput.get(KeyEvent.VK_D)) {
			x+=6;
		}else if(KeyInput.get(KeyEvent.VK_A)) {
			x-=6;
		}else if(KeyInput.get(KeyEvent.VK_W)) {
			y-=6;
		}else if(KeyInput.get(KeyEvent.VK_S)) {
			y+=6;
		}
	}

}

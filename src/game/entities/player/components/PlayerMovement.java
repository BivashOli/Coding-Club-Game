package game.entities.player.components;

import core.components.Component;

import java.awt.event.KeyEvent;

import core.KeyInput;

public class PlayerMovement extends Component {
	
	public void update() {
		
		double y = entity.getY();
		double x = entity.getX();
		
		    
		    if (KeyInput.get(KeyEvent.VK_A)) {
		    	x-=5;
		    	entity.setX(x);
		 
		    }

		    if (KeyInput.get(KeyEvent.VK_D)) {
		        x+=5;
		    	entity.setX(x);
		    }

		    if (KeyInput.get(KeyEvent.VK_W)) {
		    	y-=5;
		    	entity.setY(y);
		    }

		    if (KeyInput.get(KeyEvent.VK_S)) {
		    	y+=5;
		    	entity.setY(y);
		    }
		
	}
	

}

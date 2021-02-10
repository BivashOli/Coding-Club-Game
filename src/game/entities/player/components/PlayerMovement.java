package game.entities.player.components;

import core.components.Component;

import java.awt.event.KeyEvent;

import core.KeyInput;

public class PlayerMovement extends Component {
	
	//added a variable for the speed
	public double speed = 5;
	
	public void update() {
		
		double y = entity.getY();
		double x = entity.getX();
		
		    
		    if (KeyInput.get(KeyEvent.VK_A)) {
		    	x-=speed;
		    	entity.setX(x);
		 
		    }

		    if (KeyInput.get(KeyEvent.VK_D)) {
		        x+=speed;
		    	entity.setX(x);
		    }

		    if (KeyInput.get(KeyEvent.VK_W)) {
		    	y-=speed;
		    	entity.setY(y);
		    }

		    if (KeyInput.get(KeyEvent.VK_S)) {
		    	y+=speed;
		    	entity.setY(y);
		    }
		    
		
		
	}
	

}

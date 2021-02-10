package game.entities.player.components;

import core.components.Component;

import java.awt.event.KeyEvent;

import core.KeyInput;

public class PlayerMovement extends Component {
	
	private int stamina = 100;
	double defaultvelocity = 5;
	double currentvelocity = defaultvelocity;
	
	public void update() {
		
		double y = entity.getY();
		double x = entity.getX();
		
		
		
		
		//shift to sprint, uses stamina up
		if (KeyInput.get(KeyEvent.VK_SHIFT)) {
			if(stamina != 0) {
				stamina-= 1;
			}
			System.out.println(stamina);
			if (stamina > 0) {
				currentvelocity = defaultvelocity+3;
				System.out.println("velocity is at 8");
			}
			else
				currentvelocity = defaultvelocity;
	    }
		//if not pressing shift, stamina regens and resets current velocity
		else {
			currentvelocity = defaultvelocity;
			if (stamina != 100) {
				stamina += 1;
			}
		}
		
		//move left
	    if (KeyInput.get(KeyEvent.VK_A)) {
		   x-=currentvelocity;
		   entity.setX(x);
		 }
	    
	    //move right
		 if (KeyInput.get(KeyEvent.VK_D)) {
		    x+=currentvelocity;
		    entity.setX(x);
		 }
		 
		 //move up
		 if (KeyInput.get(KeyEvent.VK_W)) {
		    y-=currentvelocity;
		    entity.setY(y);
		 }
		 
		 //move down
		 if (KeyInput.get(KeyEvent.VK_S)) {
		    y+=currentvelocity;
		    entity.setY(y);
		 }
		    
		    
		
		
	}
	

}

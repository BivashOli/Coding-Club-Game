package game.entities.player.components;

import core.components.Component;

import java.awt.event.KeyEvent;

import core.KeyInput;

public class PlayerMovement extends Component {
	private int stamina = 100;
	public void update() {
		
		double y = entity.getY();
		double x = entity.getX();
		
		double defaultvelocity = 5;
		double currentvelocity = defaultvelocity;
		
		if (KeyInput.get(KeyEvent.VK_SHIFT)) {
			if(stamina != 0) {
				stamina-= 1;
				System.out.println(stamina);
			}
			if (stamina > 0)
				currentvelocity = defaultvelocity+3;
	    }
		else {
			if (stamina != 100)
				stamina += 1;
			System.out.println("else works!");
		}
	    if (KeyInput.get(KeyEvent.VK_A)) {
		   x-=currentvelocity;
		   entity.setX(x);
		 }

		 if (KeyInput.get(KeyEvent.VK_D)) {
		    x+=currentvelocity;
		    entity.setX(x);
		 }

		 if (KeyInput.get(KeyEvent.VK_W)) {
		    y-=currentvelocity;
		    entity.setY(y);
		 }

		 if (KeyInput.get(KeyEvent.VK_S)) {
		    y+=currentvelocity;
		    entity.setY(y);
		 }
		    
		    
		
		
	}
	

}

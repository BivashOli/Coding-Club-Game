package game.entities.player.components;

import core.components.Component;

import java.awt.event.KeyEvent;

import core.KeyInput;

public class PlayerMovement extends Component {
	
	private int stamina;
	private int maxstamina;
	private double defaultvelocity;
	private double currentvelocity;
	
	public PlayerMovement() {
		stamina=100;
		maxstamina = 100;
		defaultvelocity = 5;
		currentvelocity = defaultvelocity;
	}
	
	public double getDefaultVelocity() {
		
		return defaultvelocity;
	}
	
	public void setDefaultVelocity(double x) {
		
		defaultvelocity = x;
	}
	
	
	public double getCurrentVelocity() {
		
		return currentvelocity;
	}
	
	public int getStamina() {
		return stamina;
		
	}
	
	public int getMaxStamina() {
		return maxstamina;
	}
	
	public void setMaxStamina(int x) {
		maxstamina = x;
	}
	
	public void changeMaxStamina(int x) {
		maxstamina += x;
	}
	
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

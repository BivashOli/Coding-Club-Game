package game.entities.player;

import core.Scene;
import core.entities.Entity;
import game.entities.player.components.PlayerHealth;
import game.entities.player.components.PlayerMovement;

public class Player extends Entity{

	public Player(int x, int y, Scene scene) {
		super(x, y, scene);
		// TODO Auto-generated constructor stub
	}
	
	public void init() {
		addComponent(new PlayerMovement());
		addComponent(new PlayerHealth());

	}
	
	public void action() {
		
//		PlayerHealth playerhealth = (PlayerHealth) components.get(1); 
//		System.out.println(playerhealth.getPlayerHealth());
//		playerhealth.removePlayerHealth(10);
		
	}

	
	
	
}

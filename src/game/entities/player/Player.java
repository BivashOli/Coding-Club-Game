package game.entities.player;

import core.Scene;
import core.entities.Entity;


import game.scenes.TestScene;

import core.gfx.Texture;


import game.scenes.TestScene;
import core.gfx.Texture;

import game.components.Health;
import game.entities.player.components.PlayerMovement;

public class Player extends Entity{

	public Player(int x, int y, Scene scene) {
		super(x, y, scene);
	}
	
	public void init() {
		texture = new Texture("/res/t.png");
		addComponent(new PlayerMovement());
	 	addComponent(new Health(100));
	}
	
	public void action() {
		
		//game.entities.player.components.PlayerMovement.changeMaxStamina(5);
		
//		PlayerHealth playerhealth = (PlayerHealth) components.get(1); 
//		System.out.println(playerhealth.getPlayerHealth());
//		playerhealth.removePlayerHealth(10);
		
	}

	
	
	
}

package game.entities.player;

import core.Scene;
import core.entities.Entity;
import core.entities.items.weapons.Sword;
import game.scenes.TestScene;

import core.gfx.Texture;


import game.scenes.TestScene;
import core.gfx.Texture;

import game.components.Health;
import game.entities.player.components.PlayerMovement;

public class Player extends Entity{
	
	private Sword excalibur;

	public Player(int x, int y, Scene scene) {
		super(x, y, scene);
	}
	
	public void init() {
		texture = new Texture("/res/t.png");
		addComponent(new PlayerMovement());
	 	addComponent(new Health(100));
	 	excalibur = new Sword(x, y, scene, 1000.0, 1000.0, 1000.0);
	}
	
	public void action() {
		
		//game.entities.player.components.PlayerMovement.changeMaxStamina(5);
		
//		PlayerHealth playerhealth = (PlayerHealth) components.get(1); 
//		System.out.println(playerhealth.getPlayerHealth());
//		playerhealth.removePlayerHealth(10);
		excalibur.action();
		excalibur.setX(x+10);
		excalibur.setY(y-10);
		
	}

	
	
	
}

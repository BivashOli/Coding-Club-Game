package core.entities.items.weapons;

import core.Scene;
import core.gfx.Texture;

public class Sword extends Weapon {

	public Sword(double x, double y, Scene scene, double dam, double ran, double as) {
		super(x, y, scene, dam, ran, as);
	
	}
	
	public void init() {
		
		width = 50;
		height = 10;
		texture = new Texture("/res/t.png");
		
	}
	public void action() {
		
		System.out.println("is this working");
		
		
	}
	

}

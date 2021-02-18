package core.entities.items.weapons;

import core.Scene;
import core.entities.items.Item;

public class Weapon extends Item {

	private double damage;
	private double range;
	private double attackspeed;
	
	public Weapon(double x, double y, Scene scene, double dam, double ran, double as) {
		super(x, y, scene);
		damage = dam;
		range = ran;
		attackspeed = as;
		
	}
	
	
	
	
	
	
}

//I think I might change this to a core component

package game.components;

import core.components.Component;

public class Health extends Component {

	
	//im going to change this class from PlayerHealth
	//to Health because I realized it can be used for 
	//enemies as well
	//i also moved it to the game.components package cuz it can 
	//be used anywhere, which i jusrt made
	//Yay brian we just saved time! - bivash
	
	
	//changed playerhealth to health,
	private int health;

	//added parameter in constructor cuz diff entities
	//probably have diff health
	public Health(int health) {
		this.health = health;
		name = "Health";
	}

	//i made the method names simpler because since theyre inside of Health
	//they could only be changing the health
	public int get() {

		return health;
	}

	public void add(int x) {
		if (x + health > 100)
			health = 100;
		else
			health = +x;
	}

	public void remove(int x) {
		if (health - x > 0) {
			health = 0;
			System.out.println("You are dead haha loser!");
			// death function here eventually?
		} else
			health -= x;
	}

	public void update() {

//		PlayerHealth ph = (PlayerHealth)
//		
//		entity.components.get(1);
//
//		ph.removePlayerHealth(11);
//		System.out.println(playerhealth);
		
		//so i added some changes to the game library and u can just do this instead of the above
		Health h = entity.findComponent("Health");
		h.remove(2); 
	}
}

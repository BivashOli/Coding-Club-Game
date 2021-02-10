//I think I might change this to a core component

package game.entities.player.components;

import core.components.Component;

public class PlayerHealth extends Component {
	
	private int playerhealth;
	public PlayerHealth() {
		playerhealth = 100;
	}
	public int getPlayerHealth() {
		
		return playerhealth;
	}
	

	public void addPlayerHealth(int x) {
		if (x + playerhealth > 100)
			playerhealth = 100;
		else
			playerhealth =+ x;
	}
	

	
	public void removePlayerHealth(int x) {
		if (playerhealth - x> 0) {
			playerhealth = 0;
			System.out.println("You are dead haha loser!");
			//death function here eventually?
		}
		else
			playerhealth -= x;
	}

	public void update() {
		
		
//		PlayerHealth ph = (PlayerHealth)
//		
//		entity.components.get(1);
//
//		ph.removePlayerHealth(11);
//		System.out.println(playerhealth);
		
		
		
		
		
		
	}

}

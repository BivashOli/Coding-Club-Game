//I think I might change this to a core component

package game.entities.player.components;

import core.components.Component;

public class PlayerHealth extends Component {
	
	private int playerhealth;
	private int maxplayerhealth;
	public PlayerHealth() {
		playerhealth = 100;
		maxplayerhealth = 100;
	}
	public int getPlayerHealth() {
		
		return playerhealth;
	}
	
	public void setMaxPlayerHealth(int x) {
		maxplayerhealth = x;
	}

	public int getMaxPlayerHealth() {
		return maxplayerhealth;
	}
	
	public void increaseMaxPlayerHealth(int x) {
		maxplayerhealth +=x;
		
	}
	
	public void decreaseMaxPlayerHealth(int x ) {
		maxplayerhealth -= x;
	}
	public void setPlayerHealth(int x) {
		playerhealth = x;
		
	}
	public void healPlayerHealth(int x) {
		if (x + playerhealth >= maxplayerhealth)
			playerhealth = 100;
		else
			playerhealth =+ x;
	}
	

	
	public void damagePlayerHealth(int x) {
		if (playerhealth - x <= 0) {
			playerhealth = 0;
			System.out.println("You are dead haha loser!");
			//death function here eventually?
		}
		else
			playerhealth -= x;
	}

	public void update() {
		
		
//		PlayerHealth ph = (PlayerHealth) entity.components.get(1);
//		
//		
//
//		ph.removePlayerHealth(11);
//		System.out.println(playerhealth);
		
		
		
		
		
		
	}

}

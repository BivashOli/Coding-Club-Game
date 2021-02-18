package game.entities.enemies.testenemy.components;

import core.components.Component;

public class EnemyAI extends Component {
	
	private int x, y;
	
	public EnemyAI(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void update() {
		x = (int)-entity.getX();
		y = (int)-entity.getY();
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void detect() {
		Player player = (Player) entity.getScene().getEntity("Player");
		Enemy enemy = (Enemy) entity.getScene().getEntity("Enemy");
		
		//move left
		if(player.getX() < enemy.getX()) {
			x -= 1;
		}
		
		//move right
		if(player.getX() > enemy.getX()) {
			x += 1;
		}
		
		//move down
		if(player.getY() < enemy.getY()) {
			y -= 1;
		}
		
		//move left
		if(player.getX() > enemy.getX()) {
			y += 1;
		}
				
	}
}

package game;

import core.Game;
import core.Level1;

public class Main {

	public static void main(String[] args) {
		Game game = new Game();
		
		Level1 l = new Level1();
		game.scene = l;
		
		
		game.start();
	}
}

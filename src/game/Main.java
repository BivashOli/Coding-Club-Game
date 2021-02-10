package game;

import core.Game;
import game.scenes.TestScene;


public class Main {

	public static void main(String[] args) {
		Game game = new Game();
		
		TestScene test = new TestScene();
		game.scene = test;
		
		game.start();
	}
}

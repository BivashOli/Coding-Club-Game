package game;

import core.Game;
import game.scenes.TestScene;


public class Main {

	public static void main(String[] args) {
		Game game = new Game();
		
		TestScene test = new TestScene();
		//i changed line 14 to a function
		//to make it more intuitive 
		game.setScene(test); 
		
		game.start();
	}
}

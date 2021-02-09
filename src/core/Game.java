package core;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class Game implements Runnable{

	public static double delta = 0;
	private boolean running = false;
	private Display display;
	
	private Thread thread;
	private BufferStrategy bs;
	private Graphics g;
	
	private KeyInput keyInput;
	public static Scene scene;
	

	
	public Game() {
		init();
	}
	
	public Game(int width, int height) {
		Display.WIDTH = width;
		Display.HEIGHT = height;
		
		init();
	}
	
	public void init() {
		display = new Display();
		keyInput = new KeyInput();
		
		display.getCanvas().addKeyListener(keyInput);
	}
	
	public void render() {
		//set up for every render cycle
		bs = display.getCanvas().getBufferStrategy();
		if (bs == null) {
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		
		//START RENDERING 
		
		//background set to black, so every frame the screen is painted black
		g.setColor(Color.YELLOW);
		g.fillRect(0, 0, Display.WIDTH+50, Display.HEIGHT+50);
		
		scene.render(g); 

		//STOP RENDERING
		
		//clean up on every render cycle
		bs.show();
		g.dispose();
	}
	
	public void update() {
		scene.update();
	}
	
	public void start() {
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public void stop() {
		
	}

	
	public void run() {
		int fps = 60;
		double timePerTick = 1000000000 / fps;
		//double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		long timer = 0;
		int ticks = 0;

		while (running) {
			now = System.nanoTime();
			delta += (now - lastTime) / timePerTick;
			timer += now - lastTime;
			lastTime = now;

			if (delta >= 1) {
				update();
				render();
				ticks++;
				delta--;
			}

			if (timer >= 1000000000) {
				System.out.println("Ticks and Frames: " + ticks);
			//	System.out.println(delta);
				ticks = 0;
				timer = 0;
			}
		}

		stop();
	}
	
	
}

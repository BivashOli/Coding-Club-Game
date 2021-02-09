package core;
import java.awt.Color;
import java.awt.Graphics;

public class Entity {
		
	protected int id;
	protected int x, y, width, height;
	protected Scene scene;
	protected String texture;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Scene getScene() {
		return scene;
	}

	public void setScene(Scene scene) {
		this.scene = scene;
	}

	public Entity(int x, int y, Scene scene) {
		this.x = x;
		this.y = y;
		this.scene = scene;
		
		scene.addEntity(this); 
		init();
	}
	
	public void init() {
		width = 32;
		height = 32;
	}
	
	public void render (Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height); 
	}
	
	public void update() {}

}

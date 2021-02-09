package core.entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.util.LinkedList;

import core.Scene;
import core.components.Component;

public class Entity {
		
	protected int id;
	protected double x, y, width, height;
	protected Scene scene;
	protected String texture;
	protected LinkedList<Component> components = new LinkedList<Component>();
	
	protected void addComponent(Component component) {
		components.add(component);
		component.entity = this;
	}
	
	public boolean collides(Entity entity) {
		return getBounds().intersects(entity.getBounds()); 
	}
	
	public Rectangle2D getBounds() {
		return new Rectangle2D.Double(x, y, width, height);	
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
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
		width = 32;
		height = 32;
		init();
	}
	
	public void init() {
	
	}
	
	public void render (Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect((int)x, (int)y, (int)width, (int)height); 
	}
	
	public void action() {}
	
	public void update() {
		for(Component c : components) {
			c.update();
		}
		action();
	}

}

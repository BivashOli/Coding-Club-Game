package core.entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.geom.Rectangle2D;
import java.util.LinkedList;


import core.Scene;
import core.components.Component;
import core.gfx.Texture;

public class Entity {
		
	protected int id;
	protected double x, y, width, height;
	protected Scene scene;
	protected String texture;
	protected String name;
	public String getTexture() {
		return texture;
	}

	public void setTexture(String texture) {
		this.texture = texture;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LinkedList<Component> getComponents() {
		return components;
	}

	public void setComponents(LinkedList<Component> components) {
		this.components = components;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public LinkedList<Component> components = new LinkedList<Component>();

	
	public <T extends Component> T findComponent(String name) {
		for(Component component : components) {
			if(component.getName().equals(name)) {
				//return type.cast(component; 
				return (T) component;
			}
		}
		return null;
	}
	
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
	
	//private Toolkit t = Toolkit.getDefaultToolkit();
	public void render (Graphics g) {
	g.setColor(Color.BLUE);
		g.fillRect((int)x, (int)y, (int)width, (int)height); 
	//	g.drawImage(t.getImage("Picture.PNG"), (int)x, (int)y, (int)width, (int)height, null);

		//g.drawImage(Texture.loadImage("/res/t.PNG"), (int)x, (int)y, (int)width, (int)height, null);
	}
	
	public void action() {}
	
	public void update() {
		for(Component c : components) {
			c.update();
		}
		action();
	}

}

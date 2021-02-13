package core.entities;

import core.Display;

public class Camera {

	private int x, y;
	public Entity entity;
	
	public Camera(int x, int y, Entity entity) {
		this.x = x;
		this.y = y;
		this.entity = entity;
	}

	public void update() {
		x = (int)-entity.getX() + Display.WIDTH/2;
		y = (int)-entity.getY() + Display.HEIGHT/2;
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
}

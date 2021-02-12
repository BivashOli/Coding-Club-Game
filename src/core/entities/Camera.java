package core.entities;

import core.Display;

public class Camera {

	private double x, y;
	private Entity entity;
	
	public Camera(int x, int y, Entity entity) {
		this.x = x;
		this.y = y;
		this.entity = entity;
	}

	public void update() {
		x = -entity.getX() + Display.WIDTH/2;
		y = -entity.getY() + Display.HEIGHT/2;
	}

	public double getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}

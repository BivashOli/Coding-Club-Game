package core.components;

import core.entities.Entity;
import core.components.systems.PhysicsEngine;

public class Physics extends Component{

	public double x = 0, y = 0, velX = 0, velY = 0, accX = 0, accY = 0;
	
	public double mass= 1;

	public double forceX= 0, forceY= 0;
	
	public boolean stop = false;
	
	public void update() {
		x = entity.getX();
		y = entity.getY();
		PhysicsEngine.kinematics(this); 
		PhysicsEngine.dynamics(this);
		entity.setX(x);
		entity.setY(y);
//		System.out.println("asd");
	}
	
	public void addForce(double forceX, double forceY) {
		this.forceX+=forceX;
		this.forceY+=forceY;
	}
	
	

}

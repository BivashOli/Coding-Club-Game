package core.components.systems;

import java.util.LinkedList;

import core.Entity;
import core.Game;
import core.components.Physics;

public class PhysicsEngine {

	public static void kinematics(Physics physics) {
		physics.x += (physics.velX * Game.delta);
		physics.y += (physics.velY * Game.delta);
		
		physics.velX += (physics.accX * Game.delta);
		physics.velY += (physics.accY * Game.delta);

	}

	public static void dynamics(Physics physics) {
		physics.accX = physics.forceX / physics.mass;
		physics.accY = physics.forceY / physics.mass;

		for (int i = 0; i < Game.scene.entities.size(); i++) {
			Entity e = Game.scene.entities.get(i);
			if (physics.entity.collides(e) && e != physics.entity) {
			
			}
		}
	}

	// public static void getValue(x)

}

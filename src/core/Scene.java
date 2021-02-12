package core;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.LinkedList;

import core.entities.Camera;
import core.entities.Entity;

public class Scene {

	public static LinkedList<Scene> scenes = new LinkedList<Scene>();
	protected Camera camera;

	public static Scene findScene(String name) {
		System.out.println(scenes.size());
		for (Scene scene : scenes) {
			System.out.println(scene.name);
			if (scene.name.equals(name)) {
				return scene;
			}
		}
		return null;
	}

	protected String name;
	protected Graphics2D g2d;
	public LinkedList<Entity> entities = new LinkedList<Entity>();

	public Entity getEntity(String name) {
		for (Entity entity : entities) {
			if (entity.getName().equals(name)) {
				return entity;
			}
		}
		return null;
	}

	public Scene() {

		// PhysicsEngine.entities = new LinkedList<Entity>();

		init();
//		System.out.println(this.name);
		scenes.add(this);
//		System.out.println(scenes.size());

	}

	public void init() {

	}

	public void draw() {

	}

	public void action() {

	}

	public void render(Graphics g) {
		if (camera != null) {
			g2d = (Graphics2D) g;
			g2d.translate(camera.getX(), camera.getY());
		}
		draw();
		for (Entity entity : entities) {
			entity.render(g);
		}
		if (camera != null) {
			g2d = (Graphics2D) g;
			g2d.translate(-camera.getX(), -camera.getY());
		}
	}

	public void update() {
		action();
		if (camera != null) {
			camera.update();
		}
		for (Entity entity : entities) {
			entity.update();
		}
	}

	public void addEntity(Entity entity) {
		entities.add(entity);
	}

}

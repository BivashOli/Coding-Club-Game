package core;

import java.awt.Color;
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
		g2d = (Graphics2D) g;

//		if (camera != null) {
	//	System.out.println(camera.getX() + " " + camera.getY());
			g2d.translate(camera.getX(), camera.getY());
	//		g.setColor(Color.green);
	//		g.drawRect(camera.getX(), camera.getY(), Display.WIDTH, Display.HEIGHT);
		//	g.drawRect((int)camera.entity.getX(), (int)camera.entity.getY(), Display.WIDTH, Display.HEIGHT);
//		} 
		draw();
		for (Entity entity : entities) {
			//double entityX = entity.getX();
			//double entityY = entity.getY();
			
		//	double width = 2 * camera.entity.getX();
		//	double height = 2 * camera.entity.getY(); 
			
		//	if(  !( entityX > (width + 100) || entityX < (width - Display.WIDTH - 100) || entityY < (height - Display.HEIGHT - 100) || entityY > (height + 100)) ){
				entity.render(g);
		//	}
		}
	//	if (camera != null) {
			g2d.translate(-camera.getX(), -camera.getY());
	//	}
	}

	public void update() {
		action();
	//	if (camera != null) {
			camera.update();
		//}
		for (Entity entity : entities) {
			entity.update();
		}
	}

	public void addEntity(Entity entity) {
		entities.add(entity);
	}

}

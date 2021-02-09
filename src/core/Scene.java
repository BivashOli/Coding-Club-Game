package core;

import java.awt.Graphics;
import java.util.LinkedList;

import core.entities.Entity;

public class Scene {

	public static LinkedList<Scene> scenes = new LinkedList<Scene>();
	
	public static Scene findScene(String name) {
		System.out.println(scenes.size());
		for(Scene scene : scenes) {
			System.out.println(scene.name);
			if(scene.name.equals(name)) {
				return scene;
			}
		} 
		return null;
	}
	
	protected String name;
	public LinkedList<Entity> entities = new LinkedList<Entity>();
	
	public Scene() {

		//PhysicsEngine.entities = new LinkedList<Entity>();

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
		draw();
		for(Entity entity : entities) {
			entity.render(g);
		}
	} 
	
	public void update() {
		action();
		for(Entity entity : entities) {
			entity.update();
		}
	}
	
	public void addEntity(Entity entity) {
		entities.add(entity);
	}
	
	

}

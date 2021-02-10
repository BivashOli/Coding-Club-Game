package core.components;

import core.entities.Entity;

public class Component {

	public Entity entity;
	public String name = "";
	
	public Entity getEntity() {
		return entity;
	}

	public void setEntity(Entity entity) {
		this.entity = entity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	public void update() {
		
	}

}

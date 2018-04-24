package com.curs.java.model;

public abstract class Entity {
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

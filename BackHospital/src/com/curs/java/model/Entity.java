package com.curs.java.model;

import java.io.Serializable;

public abstract class Entity implements Serializable, Cloneable {
	
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long iD2) {
		this.id = iD2;
	}
	

}

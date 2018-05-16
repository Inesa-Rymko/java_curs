package com.curs.java.model;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends Entity implements Comparable<Doctor> {

	private static final long serialVersionUID = 1L;
	private static long ID;
	private String name;
	private String surName;
	private String worker;

	public Doctor(String name, String surName, String worker) {
		setId(ID++);
		this.name = name;
		this.surName = surName;
		this.worker = worker;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getWorker() {
		return worker;
	}

	public void setWorker(String worker) {
		this.worker = worker;
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(
				" Doctor [id=" + getId() + ", name=" + name + ", surName=" + surName + ", worker=" + worker + "]");
		return stringBuilder.toString();
	}

	public List<Pacient> pacientList = new ArrayList<>();

	public List<Pacient> getPacientList() {
		return pacientList;
	}

	public Doctor clone() throws CloneNotSupportedException {
		return (Doctor) super.clone();
	}

	@Override
	public int compareTo(Doctor entry) {
		if (entry != null) {
			int result = surName.compareTo(entry.surName);
			if (result != 0) {
				return result;
			}
		}
		return 0;
	}
	
	/*public void update(final Entity entity) {
        final Doctor castedEntity = (Doctor) entity;
        rewriteFields(castedEntity);
    }

	private void rewriteFields(Doctor castedEntity) {
	        name = castedEntity.getName();
	        surName = castedEntity.getSurName();
	        worker = castedEntity.getWorker();
	    }*/
		
	}



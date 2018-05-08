package com.curs.java.model;

public class Pacient extends Entity implements Cloneable, Comparable<Pacient> {
	
	private static final long serialVersionUID = 1L;
	private static long ID;
	private String name;
	private String surName;
	private String diagnos;
	private Doctor doctor;

	public Pacient(String name, String surName, String diagnos) {
		setId(ID++);
		this.name = name;
		this.surName = surName;
		this.diagnos = diagnos;
	}

	public Pacient(Pacient pacient) {
		this(pacient.name, pacient.surName, pacient.diagnos);
	}

	public String getDiagnos() {
		return diagnos;
	}

	public void setDiagnos(String diagnos) {
		this.diagnos = diagnos;
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

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(
				" Pacient [id=" + getId() + ", name=" + name + ", surName=" + surName + ", diagnos=" + diagnos + "]");
		return stringBuilder.toString();
	}

	public Pacient clone() throws CloneNotSupportedException {
		Pacient clone = (Pacient) super.clone();
		return clone;
	}

	@Override
	public int compareTo(Pacient entry) {
		// Pacient entry = (Pacient) obj;
		if (entry != null) {
			int result = surName.compareTo(entry.surName);
			if (result != 0) {
				return result;
			}
		}
		return 0;
	}

}

package curs.java.person;

public class Pacient extends People {

	protected String name;
	protected String surName;
	protected int age;
	public Doctor doctor;

	public Pacient(String name, String surName, int age) {
		this.name = name;
		this.surName = surName;
		this.age = age;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
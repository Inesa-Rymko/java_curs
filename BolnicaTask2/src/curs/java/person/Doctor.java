package curs.java.person;

public class Doctor extends People {

	public String name;
	public String surName;
	public String worker;

	public Doctor(String name, String surName, String worker) {
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

	public Pacient[] pacientToDoctor = new Pacient[1];

	public Pacient[] getPacientList() {
		return pacientToDoctor;
	}

	public void setPacientList(Pacient[] pacientToDoctor) {
		this.pacientToDoctor = pacientToDoctor;
	}

}

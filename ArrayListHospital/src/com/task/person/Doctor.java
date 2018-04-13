package com.task.person;

import java.util.ArrayList;
import java.util.List;


public class Doctor {
	
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
	
	public String printDoctor() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(" Pacient [name=" + name + ", surName=" + surName + ", worker=" + worker + "]");
		return stringBuilder.toString();
	}

	public List<Pacient> pacientList = new ArrayList<>();

	public List<Pacient> getPacientList() {
		return pacientList;
	}

	public void setPacientList(List<Pacient> pacientList) {
		this.pacientList = pacientList;
	}

}

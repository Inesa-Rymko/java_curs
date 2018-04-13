package com.task.person;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	
	public List<Pacient> pacients = new ArrayList<Pacient>();
	public List<Doctor> doctors = new ArrayList<Doctor>();
	
	public List<Pacient> getPacients() {
		return pacients;
	}
	public void setPacients(List<Pacient> pacients) {
		this.pacients = pacients;
	}
	public List<Doctor> getDoctors() {
		return doctors;
	}
	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}

}

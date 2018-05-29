package com.curs.java.main;


import com.curs.java.model.Doctor;
import com.curs.java.model.Pacient;

public class Main {
	public static void main(String[] args) {

	}

	public static Doctor createDoctor(String name, String surName, String worker) {
		Doctor doctor = new Doctor(name, surName, worker);
		return doctor;
	}

	public static Pacient createPacient(String name, String surName, String diagnos) {
		Pacient pacient = new Pacient(name, surName, diagnos);
		return pacient;
	}
}


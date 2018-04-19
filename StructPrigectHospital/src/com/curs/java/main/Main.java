package com.curs.java.main;

import com.curs.java.facade.Facade;
import com.curs.java.model.Doctor;
import com.curs.java.model.Pacient;

public class Main {
	public static void main(String[] args) {		
        Facade f = new Facade();
		Doctor doctor = createDoctor("Olga", "Gagarinova", "diagnost");
		Doctor doctor1 = createDoctor("Olga", "Kamasheva", "medsestra");
		
		Pacient pacient = createPacient("Inesa", "Rymko", 21);
		Pacient pacient1 = createPacient("Victor", "Rymko", 21);
		Pacient pacient2 = createPacient("Pavel", "Rymko", 21);
	
		f.addDoctor(doctor);
		f.addDoctor(doctor1);
		
		f.showListDoctor();
		
		f.countDoctor();
		
		f.addPacient(pacient);
		f.addPacient(pacient1);
		f.addPacient(pacient2);	
		
		f.showListPacient();
		
		f.printerCountPacient();
		
		f.addPacienToDoctor(pacient, doctor);
		f.addPacienToDoctor(pacient1, doctor);
		f.addPacienToDoctor(pacient2, doctor);
		f.addPacienToDoctor(pacient, doctor1);
		f.addPacienToDoctor(pacient2, doctor1);
		
		f.showPacientToDoctor(doctor);
		
		f.countPacientToDoctor(doctor);
	
	}
	
	public static Doctor createDoctor(String name, String surName, String worker) {
		Doctor doctor = new Doctor(name, surName, worker);
		return doctor;
	}
	
	public static Pacient createPacient(String name, String surName, int age) {
		Pacient pacient = new Pacient(name, surName, age);
		return pacient;
	}
}

package com.curs.java.main;

import com.curs.java.facade.Facade;
import com.curs.java.model.Doctor;
import com.curs.java.model.Pacient;

public class Main {
	public static void main(String[] args) {
		Facade f = new Facade();

		Doctor doctor = createDoctor( "Olga", "Zagarinova", "diagnost");
		Doctor doctor1 = createDoctor( "Olga", "Kamasheva", "medsestra");

		Pacient pacient = createPacient( "Inesa", "Rymko", "grip");
		Pacient pacient1 = createPacient( "Victor", "Andrianov", "orv");
		Pacient pacient2 = createPacient( "Pavel", "Solodotenko", "d");

		Doctor clone = null;

		try {
			clone = doctor.clone();
			clone.setSurName("Ivanova");
			clone.setName("Kate");
			clone.setId(3);

		} catch (CloneNotSupportedException e) {
			System.out.println("Don't clone");
		}

		f.addDoctor(doctor);
		f.addDoctor(doctor1);
		f.addDoctor(clone);

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

	public static Doctor createDoctor( String name, String surName, String worker) {
		Doctor doctor = new Doctor( name, surName, worker);
		return doctor;
	}

	public static Pacient createPacient( String name, String surName, String diagnos) {
		Pacient pacient = new Pacient (name, surName, diagnos);
		return pacient;
	}
}
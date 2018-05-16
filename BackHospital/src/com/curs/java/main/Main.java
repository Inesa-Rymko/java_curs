package com.curs.java.main;

import com.curs.java.api.facade.IFacade;
import com.curs.java.facade.Facade;
import com.curs.java.model.Doctor;
import com.curs.java.model.Pacient;

public class Main {
	public static void main(String[] args) {

		IFacade f = Facade.getInstance();

		Doctor doctor = createDoctor("Olga", "Gagarinova", "diagnost");
		Doctor doctor2 = createDoctor("Lena", "Senko", "lor");
		Doctor doctor1 = createDoctor("Olga", "Kamasheva", "medsestra");

		Pacient pacient = createPacient("Inesa", "Rymko", "grip");
		Pacient pacient1 = createPacient("Victor", "Andrianov", "orv");
		Pacient pacient2 = createPacient("Pavel", "Pavlov", "d");
		Pacient pacient3 = createPacient("Pavel", "Ivanov", "r");

		Doctor clone = null;
		try {
			clone = doctor.clone();
			clone.setSurName("Ivanova");
			clone.setName("Kate");
			clone.setId(3);
		} catch (CloneNotSupportedException e) {
			System.out.println("Don't clone");
		}

		Pacient cloneP = null;
		try {
			cloneP = pacient.clone();
			cloneP.setSurName("AAA");
			cloneP.setName("AAA");
		} catch (CloneNotSupportedException e) {
			System.out.println("Don't clone");
		}
/*
		f.addDoctor(doctor);
		f.addDoctor(doctor2);
		f.addDoctor(doctor1);
		//f.addDoctor(clone);
*/
		System.out.println(" ");
		
f.getDoctorByName("senko");
f.getPacientByName("Rymko");

System.out.println("");

		f.showListDoctor();

		f.countDoctor();
		/*
		f.addPacient(pacient);
		f.addPacient(pacient1);
		f.addPacient(pacient2);
		f.addPacient(pacient3);
*/
     	f.showListPacient();

		f.printerCountPacient();

		f.addPacienToDoctor(pacient, doctor);
		f.addPacienToDoctor(pacient1, doctor);
		f.addPacienToDoctor(pacient2, doctor);
		f.addPacienToDoctor(pacient, doctor1);
		f.addPacienToDoctor(pacient2, doctor1);

		f.showPacientToDoctor(doctor);

		//f.countPacientToDoctor(doctor);
		//f.showListDoctorSort();

	    f.writeToFilePacient("pacient.csv");
		f.readFile("doctor.csv");
		f.writeToFileDoctor("doctor.csv");
		f.serializDoctor("doc.dat");
		f.serializPacient("pac.dat");
		System.out.println("____doctc gj sdcfsc_____");
		
		f.getDoctorByID(1);
		f.getPacientByID(2);
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


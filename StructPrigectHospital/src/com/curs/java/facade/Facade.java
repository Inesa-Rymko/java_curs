package com.curs.java.facade;

import com.curs.java.model.Doctor;
import com.curs.java.model.Entity;
import com.curs.java.model.Pacient;
import com.curs.java.service.DoctorService;
import com.curs.java.service.PacientService;
import com.curs.java.utils.Printer;

public class Facade {

	private static Facade instance;

	private DoctorService doctors;
	private PacientService pacients;

	public static Facade getInstance() {
		if (instance == null) {
			instance = new Facade();
		}
		return instance;
	}

	public Facade() {
		doctors = new DoctorService();
		pacients = new PacientService();
	}

	public void addDoctor(Doctor doctor) {
		doctors.addDoctor(doctor);
	}

	public void countDoctor() {
		Printer.printObject(doctors.countDoctor());
	}

	public void addPacient(Pacient pacient) {
		pacients.addPacient(pacient);
	}

	public void delPacient(Pacient pacient) {
		pacients.delPacient(pacient);
	}

	public void addPacienToDoctor(Pacient pact, Doctor doc) {
		pacients.addPacienToDoctor(pact, doc);
	}

	public void delPacienToDoctor(Pacient pact, Doctor doc) {
		pacients.delPacienToDoctor(pact, doc);
	}

	public void showListDoctor() {
		Printer.printArray(doctors.getDoctors(null));
	}

	public void showListDoctorSort() {
		Printer.printArray(doctors.getDoctorsSort());
	}

	public void printerCountPacient() {
		Printer.printObject(pacients.countPacient());
	}

	public void showListPacient() {
		Printer.printArray(pacients.getPacient());
	}

	public void showPacientToDoctor(Doctor doc) {

		System.out.println("--pacient to doctor--" + doc.getSurName());
		Printer.printArray(doc.getPacientList());
		;
	}

	public void countPacientToDoctor(Doctor doc) {
		Printer.printObject(pacients.countPacientToDoctor(doc));
	}

	public Entity clone() throws CloneNotSupportedException {
		Entity clone = (Entity) super.clone();
		return clone;
	}

}

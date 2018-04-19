package com.curs.java.facade;

import com.curs.java.model.Doctor;
import com.curs.java.model.Pacient;
import com.curs.java.service.DoctorService;
import com.curs.java.service.PacientService;
import com.curs.java.utils.Printer;

public class Facade {
	private DoctorService doctors;
	private PacientService pacients;
	private Printer printer;

	public Facade() {
		doctors = new DoctorService();
		pacients = new PacientService();
		printer = new Printer();
	}

	public void addDoctor(Doctor doctor) {
		doctors.addDoctor(doctor);
	}
	
	public void countDoctor(){
		printer.printerCountDoctor();
	}

	public void addPacient(Pacient pacient) {
		pacients.addPacient(pacient);
	}
	
	public void delPacient(Pacient pacient){
		pacients.delPacient(pacient);
	}

	public void addPacienToDoctor(Pacient pact, Doctor doc) {
		pacients.addPacienToDoctor(pact, doc);
	}
	
	public void delPacienToDoctor(Pacient pact, Doctor doc) {
		pacients.delPacienToDoctor(pact, doc);
	}
	
	public void showListDoctor() {
		printer.showListDoctor();
	}
	
	public void printerCountPacient(){
		printer.printerCountPacient();
	}
	
	public void showListPacient() {
		printer.showListPacient();
	}
	
	public void showPacientToDoctor(Doctor doc) {
		System.out.println("--pacient to doctor--" + doc );
		printer.showPacientToDoctor(doc);
	}
	
	public void countPacientToDoctor(Doctor doc){
		printer.countPacientToDoctor(doc);
	}

}

package com.curs.java.utils;

import java.util.List;
import com.curs.java.model.Doctor;
import com.curs.java.model.Pacient;
import com.curs.java.repository.DoctorRepository;
import com.curs.java.repository.PacientRepository;
import com.curs.java.service.DoctorService;
import com.curs.java.service.PacientService;

public class Printer {
	
	private final PacientRepository repositoryP;
	private final DoctorRepository repositoryD;
	private DoctorService doctors;
	private PacientService pacients;

	public Printer(){
           doctors  = new DoctorService();
           pacients = new PacientService();
           repositoryP = PacientRepository.getInstance();
           repositoryD = DoctorRepository.getInstance();
	}
		
	public void printerCountDoctor(){
		System.out.println("--count doctors--");
		System.out.println(doctors.countDoctor());
	}
	
	public void showListDoctor() {
		System.out.println("List of all doctor");
		for (Doctor doc : repositoryD.getDoctors()) {
			System.out.println(doc.toString());
		}
	}
	
	public void printerCountPacient(){
		System.out.println("--count pacients--");
		System.out.println(pacients.countPacient());
	}

	public void showListPacient() {
		System.out.println("List of all pacients");
		for (Pacient pac : repositoryP.getPacients()) {
			System.out.println(pac.toString());
		}
	}
	
	public void showPacientToDoctor(Doctor doc) {
		List<Pacient> pac = doc.getPacientList();
		for (Pacient pacient : pac) {
			System.out.println(pacient.toString());
		}
	}
	
	public void countPacientToDoctor(Doctor doc){
		System.out.println("-- count pac to doctor--" + doc);
		System.out.println(pacients.countPacientToDoctor(doc));
	}
	
}

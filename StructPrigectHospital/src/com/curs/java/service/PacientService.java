package com.curs.java.service;

import java.util.List;

import com.curs.java.model.Doctor;
import com.curs.java.model.Pacient;
import com.curs.java.repository.PacientRepository;

public class PacientService {

	private final PacientRepository repository;

	public PacientService() {
		repository = PacientRepository.getInstance();
	}

	public List<Pacient> getPacient() {
		return repository.getPacients();
	}

	public void addPacient(Pacient pacient) {
		repository.addPacient(pacient);
	}

	public void delPacient(Pacient pacient) {
		repository.delPacient(pacient);
	}

	public int countPacient() {
		int size = repository.getPacients().size();
		return size;
	}

	public void addPacienToDoctor(Pacient pact, Doctor doc) {
		List<Pacient> pac = doc.getPacientList();
		pac.add(pact);
	}

	public void delPacienToDoctor(Pacient pact, Doctor doc) {
		List<Pacient> pac = doc.getPacientList();
		pac.remove(pact);
	}

	public int countPacientToDoctor(Doctor doc) {
		List<Pacient> pac = doc.getPacientList();
		int size = pac.size();
		return size;
	}

}

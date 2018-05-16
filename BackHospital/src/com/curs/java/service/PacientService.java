package com.curs.java.service;

import java.util.List;

import com.curs.java.api.repository.IPacientRepository;
import com.curs.java.api.service.IPacientService;
import com.curs.java.model.Doctor;
import com.curs.java.model.Pacient;
import com.curs.java.repository.PacientRepository;

public class PacientService implements IPacientService{

	private IPacientRepository repository;

	public PacientService() {
		repository = PacientRepository.getInstance();
	}

	public List<Pacient> getPacients() {
		return repository.getPacients();
	}

	public void addPacient(Pacient pacient) {
		repository.addPacient(pacient);
	}

	public void deletePacient(Pacient pacient) {
		repository.deletePacient(pacient);
	}

	public int countPacient() {
		int size = repository.getPacients().size();
		return size;
	}

	public void addPacienToDoctor(Pacient pact, Doctor doc) {
		List<Pacient> pac = doc.getPacientList();
		pac.add(pact);
	}

	public void deletePacienToDoctor(Pacient pact, Doctor doc) {
		List<Pacient> pac = doc.getPacientList();
		pac.remove(pact);
	}

	public int countPacientToDoctor(Doctor doc) {
		List<Pacient> pac = doc.getPacientList();
		int size = pac.size();
		return size;
	}

	public Pacient clone() throws CloneNotSupportedException {
		Pacient clone = (Pacient) super.clone();
		return clone;
	}

	public String getPacientById(long id){
		return repository.getPacienBytId(id);
	}
	
	public String getPacientByName( String Surname){
		return repository.getPacientByName(Surname);
	}

}
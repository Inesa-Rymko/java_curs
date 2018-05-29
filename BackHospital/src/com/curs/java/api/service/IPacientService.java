package com.curs.java.api.service;

import java.util.List;

import com.curs.java.model.Doctor;
import com.curs.java.model.Pacient;

public interface IPacientService {

	public List<Pacient> getPacients();

	public void addPacient(Pacient pacient);

	public void deletePacient(Pacient pacient);

	public int countPacient();

	public void addPacienToDoctor(Pacient pact, Doctor doc);

	public void deletePacienToDoctor(Pacient pact, Doctor doc);

	public int countPacientToDoctor(Doctor doc);

	public Pacient clone() throws CloneNotSupportedException;
	
	public String getPacientById(long id);
	public String getPacientByName(String Surname);
}

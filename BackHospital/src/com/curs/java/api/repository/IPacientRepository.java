package com.curs.java.api.repository;

import java.util.List;

import com.curs.java.model.Pacient;

public interface IPacientRepository {

	public List<Pacient> getPacients();

	public void addPacient(Pacient pacient);

	public void deletePacient(Pacient pacient);

	public Pacient clone(Pacient pacient) throws CloneNotSupportedException;
	
	public void updatePacient(Pacient Old, Pacient New);
	
	public String getPacienBytId(long id);
	public String getPacientByName(String Surname);
}

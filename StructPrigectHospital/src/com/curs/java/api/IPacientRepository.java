package com.curs.java.api;

import java.util.List;

import com.curs.java.model.Pacient;

public interface IPacientRepository {

	public List<Pacient> getPacients();

	public void addPacient(Pacient pacient);

	public void delPacient(Pacient pacient);

}

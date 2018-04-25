package com.curs.java.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.curs.java.api.IPacientRepository;
import com.curs.java.model.Pacient;

public class PacientRepository implements IPacientRepository {

	private static PacientRepository instance;
	private List<Pacient> pacients;

	private PacientRepository() {
		pacients = new ArrayList<Pacient>();
	}

	public static PacientRepository getInstance() {
		if (instance == null) {
			instance = new PacientRepository();
		}
		return instance;
	}

	public List<Pacient> getPacients() {
		return pacients;
	}

	public void addPacient(Pacient pacient) {
		pacients.add(pacient);
	}

	public void delPacient(Pacient pacient) {
		pacients.remove(pacient);
	}

	public List<Pacient> getSort() {
		Collections.sort(pacients);
		return pacients;
	}

	public Pacient clone() throws CloneNotSupportedException {
		Pacient clone = (Pacient) super.clone();
		return clone;
	}

	public void updatePacient(Pacient Old, Pacient New) {
		delPacient(Old);
		addPacient(New);
	}

	public long getPacientId(Pacient pacient) {
		return pacient.getId();
	}
}

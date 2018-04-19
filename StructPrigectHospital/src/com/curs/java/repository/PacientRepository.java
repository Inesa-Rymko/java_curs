package com.curs.java.repository;

import java.util.List;
import com.curs.java.api.APacientRepository;
import com.curs.java.model.Pacient;

public class PacientRepository extends APacientRepository {

	private static PacientRepository instance;

	private PacientRepository() {
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

}

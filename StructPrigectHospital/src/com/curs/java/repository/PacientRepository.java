package com.curs.java.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.curs.java.api.IPacientRepository;
import com.curs.java.model.Pacient;
import com.curs.java.utils.Serializ;

public class PacientRepository extends ARepository implements IPacientRepository {

	private static final long serialVersionUID = 286580463L;
	private static PacientRepository instance;
	private List<Pacient> pacients;

	private PacientRepository() {
		pacients = new ArrayList<Pacient>();
	}

	public static PacientRepository getInstance() {
		if (instance == null){
			instance = (PacientRepository) Serializ.deserialize("pac.dat");
			
		if (instance == null) {
			instance = new PacientRepository();
		}
		}
		return instance;
	}

	public List<Pacient> getPacients() {
		Collections.sort(pacients);
		return pacients;
	}

	public void addPacient(Pacient pacient) {
		pacients.add(pacient);
	}

	public void deletePacient(Pacient pacient) {
		pacients.remove(pacient);
	}

	public Pacient clone(Pacient pacient) throws CloneNotSupportedException {
		return pacient.clone();
	}

	public void updatePacient(Pacient Old, Pacient New) {
		deletePacient(Old);
		addPacient(New);
	}

	public long getPacientId(Pacient pacient) {
		return pacient.getId();
	}
	
	
}

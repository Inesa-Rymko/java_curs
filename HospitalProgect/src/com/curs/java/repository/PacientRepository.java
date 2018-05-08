package com.curs.java.repository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.curs.java.api.repository.IPacientRepository;
import com.curs.java.model.Doctor;
import com.curs.java.model.Pacient;
import com.curs.java.utils.CsvWorker;
import com.curs.java.utils.Printer;
import com.curs.java.utils.Serializ;

public class PacientRepository extends ARepository implements IPacientRepository {

	private static final long serialVersionUID = 286580463L;
	private static final String FILE_DOEST_EXISTS = "File doesn't exists";
	private static final String CLASS_IS_NOT_SERIALIZABLE = "Class is not serializable";
	private static PacientRepository instance;
	private List<Pacient> pacients;

	private PacientRepository() {
		pacients = new ArrayList<Pacient>();
	}

	public static PacientRepository getInstance() {
		if (instance == null) {
			try {
				instance = (PacientRepository) CsvWorker.readOdj("pacient.csv");
				instance = (PacientRepository) Serializ.deserialize("pac.dat");
			} catch (ClassNotFoundException e) {
				Printer.print(CLASS_IS_NOT_SERIALIZABLE);
			} catch (IOException e) {
				Printer.print(FILE_DOEST_EXISTS);
			}
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

	public String getPacienBytId(long id) {
		for (Pacient p : pacients) {
			long id_p = p.getId();
			if (id_p == id) {
				return p.toString();
			}
		}
		return null;
	}

	

}

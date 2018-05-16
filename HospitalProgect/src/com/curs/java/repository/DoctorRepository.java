package com.curs.java.repository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.naming.directory.SchemaViolationException;

import com.curs.java.api.repository.IDoctorRepository;
import com.curs.java.model.Doctor;
import com.curs.java.model.Entity;
import com.curs.java.utils.CsvWorker;
import com.curs.java.utils.Printer;
import com.curs.java.utils.Serializ;

public class DoctorRepository extends ARepository implements IDoctorRepository {

	private static final long serialVersionUID = 1L;
	private static final String FILE_DOEST_EXISTS = "File doesn't exists";
	private static final String CLASS_IS_NOT_SERIALIZABLE = "Class is not serializable";

	private static DoctorRepository instance;

	private List<Doctor> doctors;

	private DoctorRepository() {
		doctors = new ArrayList<Doctor>();
	}

	public static DoctorRepository getInstance() {
		if (instance == null) {
			try {
				instance = (DoctorRepository) Serializ.deserialize("doc.dat");
			} catch (ClassNotFoundException e) {
				Printer.print(CLASS_IS_NOT_SERIALIZABLE);
			} catch (IOException e) {
				Printer.print(FILE_DOEST_EXISTS);
			}
			if (instance == null) {
				instance = new DoctorRepository();
			}
		}
		return instance;
	}

	public List<Doctor> getDoctors(Comparator<Doctor> comporator) {
		if (comporator == null) {
			Collections.sort(doctors);
		} else {
			Collections.sort(doctors, comporator);
		}
		return doctors;
	}

	public void addDoctor(Doctor doctor) {
		doctors.add(doctor);
	}

	public void deleteDoctor(Doctor doctor) {
		doctors.remove(doctor);
	}

	public void updateDoctor(Doctor Old, Doctor New) {
		deleteDoctor(Old);
		addDoctor(New);
	}

	public String getDoctorById(long id) {
		for (Doctor d : doctors) {
			long id_d = d.getId();
			if (id_d == id) {
				return d.toString();
			}
		}
		return null;
	}
	
	public Doctor updateRepository(String file){

			CsvWorker.readOdj(file);

		return null;
		
	}

	public Doctor clone(Doctor doctor) throws CloneNotSupportedException {
		return doctor.clone();
	}

}
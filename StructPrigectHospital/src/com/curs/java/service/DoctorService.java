package com.curs.java.service;

import java.util.List;
import com.curs.java.model.Doctor;
import com.curs.java.repository.DoctorRepository;

public class DoctorService {

	private final DoctorRepository repository;

	public DoctorService() {
		repository = DoctorRepository.getInstance();
	}

	public List<Doctor> getDoctors() {
		return repository.getDoctors();
	}

	public void addDoctor(Doctor doctor) {
		repository.addDoctor(doctor);
	}
	
	public int countDoctor() {
		int size = repository.getDoctors().size();
		return size;
	}
}

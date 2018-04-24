package com.curs.java.service;

import java.util.Comparator;
import java.util.List;
import com.curs.java.model.Doctor;
import com.curs.java.repository.DoctorRepository;

public class DoctorService {

	private DoctorRepository repository;

	public DoctorService() {
		repository = DoctorRepository.getInstance();
	}

	public List<Doctor> getDoctors(Comparator<Doctor> comporator) {
		return repository.getDoctor(comporator);
	}

	public List<Doctor> getDoctorsSort() {
		return repository.getSort();
	}

	public void addDoctor(Doctor doctor) {
		repository.addDoctor(doctor);
	}

	public int countDoctor() {
		int size = repository.getDoctor(null).size();
		return size;
	}

	public Doctor clone() throws CloneNotSupportedException {
		return (Doctor) super.clone();
	}

}

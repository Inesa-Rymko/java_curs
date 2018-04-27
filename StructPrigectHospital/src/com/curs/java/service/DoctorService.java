package com.curs.java.service;

import java.util.Comparator;
import java.util.List;

import com.curs.java.api.service.IDoctorService;
import com.curs.java.model.Doctor;
import com.curs.java.model.Pacient;
import com.curs.java.repository.DoctorRepository;

public class DoctorService implements IDoctorService {

	private DoctorRepository repository;

	public DoctorService() {
		repository = DoctorRepository.getInstance();
	}

	public List<Doctor> getDoctors(Comparator<Doctor> comporator) {
		return repository.getDoctors(comporator);
	}

	/*public List<Doctor> getDoctorsSort() {
		return repository.getSort();
	}*/

	public void deleteDoctor(Doctor doctor) {
		repository.deleteDoctor(doctor);
	}
	
	public void addDoctor(Doctor doctor) {
		repository.addDoctor(doctor);
	}

	public int countDoctor() {
		int size = repository.getDoctors(null).size();
		return size;
	}

	public Doctor clone() throws CloneNotSupportedException {
		return (Doctor) super.clone();
	}


}


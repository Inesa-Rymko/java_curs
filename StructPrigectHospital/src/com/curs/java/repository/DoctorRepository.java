package com.curs.java.repository;

import java.util.List;

import com.curs.java.api.ADoctorRepository;
import com.curs.java.model.Doctor;

public class DoctorRepository extends ADoctorRepository{

	private static DoctorRepository instance;

	private DoctorRepository(){}

	public static DoctorRepository getInstance() {
		if (instance == null){
			instance = new DoctorRepository();
		}
		return instance;
	}
	
	public List<Doctor> getDoctors() {
		return doctors;
	}

}
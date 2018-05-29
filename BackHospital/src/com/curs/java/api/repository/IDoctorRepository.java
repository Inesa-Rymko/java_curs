package com.curs.java.api.repository;

import java.util.Comparator;
import java.util.List;

import com.curs.java.model.Doctor;

public interface IDoctorRepository {

	public List<Doctor> getDoctors(Comparator<Doctor> comporator);

	public void addDoctor(Doctor doctor);

	public void deleteDoctor(Doctor doctor);

	public void updateDoctor(Doctor Old, Doctor New);

	public Doctor clone(Doctor doctor) throws CloneNotSupportedException ;
	
	public String getDoctorById(long id);
	
	public String getDoctorByName(String Surname);
}

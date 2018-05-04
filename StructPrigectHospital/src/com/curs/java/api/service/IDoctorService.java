package com.curs.java.api.service;

import java.util.Comparator;
import java.util.List;

import com.curs.java.model.Doctor;

public interface IDoctorService {

	public List<Doctor> getDoctors(Comparator<Doctor> comporator);

	public void addDoctor(Doctor doctor);

	public void deleteDoctor(Doctor doctor);

	public Doctor clone() throws CloneNotSupportedException;

	public int countDoctor();

}

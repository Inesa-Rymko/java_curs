package com.curs.java.api;

import java.util.Comparator;
import java.util.List;

import com.curs.java.model.Doctor;

public interface IDoctorRepository {

	public List<Doctor> getDoctor(Comparator<Doctor> comporator);

	public void addDoctor(Doctor doctor);

	public void delDoctor(Doctor doctor);

}

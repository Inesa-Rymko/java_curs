package com.curs.java.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.curs.java.api.IDoctorRepository;
import com.curs.java.model.Doctor;

public class DoctorRepository implements IDoctorRepository {

	private static DoctorRepository instance;

	private List<Doctor> doctors;

	private DoctorRepository() {
		doctors = new ArrayList<Doctor>();
	}

	public static DoctorRepository getInstance() {
		if (instance == null) {
			instance = new DoctorRepository();
		}
		return instance;
	}

	public List<Doctor> getDoctor(Comparator<Doctor> comporator) {
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

	public void delDoctor(Doctor doctor) {
		doctors.remove(doctor);
	}

	public void updateDoctor(Doctor Old, Doctor New) {
		delDoctor(Old);
		addDoctor(New);
	}

	public long getDoctorId(Doctor doctor) {
		return doctor.getId();
	}

	public Doctor clone() throws CloneNotSupportedException {
		return (Doctor) super.clone();
	}

	public List<Doctor> getSort() {
		Collections.sort(doctors);
		return doctors;
	}

}
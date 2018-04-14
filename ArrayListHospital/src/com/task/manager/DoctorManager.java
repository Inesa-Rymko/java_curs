package com.task.manager;

import java.util.List;

import com.task.person.Doctor;
import com.task.person.Pacient;

public class DoctorManager extends AbstractManager {

	static List<Doctor> doctors = hos.getDoctors();

	public void addDoctor(Doctor doctor) {
		doctors.add(doctor);
		hos.setDoctors(doctors);
	}

	public void printList() {
		System.out.println("List of all doctors");
		for (Doctor doc : doctors) {
			System.out.println(doc.toString());
		}
	}

	public int countDoctor() {
		int size = doctors.size();
		System.out.println("--count doctor--");
		return size;
	}

}

package com.task.manager;

import java.util.List;

import com.task.person.Doctor;
import com.task.person.Pacient;

public class DoctorManager extends Manager{
	
	static List<Doctor> doctors = hos.getDoctors();
	
	public void addDoctor(Doctor doctor){		
		doctors.add(doctor);
		hos.setDoctors(doctors);		
	}
	
	public void printList() {
		System.out.println("List of all doctors");
		for (Doctor doc : doctors) {
			System.out.println(doc.printDoctor());
		}
	}
	
	public int countDoctor() {
		int size = doctors.size();
		System.out.println("--count doctor--");
		return size;
	}
	
	public void addPacienToDoctor(Pacient pact, Doctor doc) {
		List<Pacient> pac = doc.getPacientList();
		pac.add(pact);
	}

	public void delPacienToDoctor(Pacient pact, Doctor doc) {
		List<Pacient> pac = doc.getPacientList();
		pac.remove(pact);
	}

	public void listPacientToDoctor(Doctor doc) {
		List<Pacient> pac = doc.getPacientList();
		for (Pacient pacient : pac) {
			System.out.println(pacient.printAll());
		}
	}

	public int countPacientToDoctor(Doctor doc) {
		List<Pacient> pac = doc.getPacientList();
		int size = pac.size();
		System.out.println("--count pacient--");
		System.out.println(size);
		return size;
	}
}

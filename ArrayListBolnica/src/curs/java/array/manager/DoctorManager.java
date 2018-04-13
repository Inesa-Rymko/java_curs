package curs.java.array.manager;

import java.util.ArrayList;
import java.util.List;

import curs.java.array.interfaces.IDoctor;
import curs.java.array.person.Doctor;
import curs.java.array.person.Pacient;

public class DoctorManager implements IDoctor {

	@Override
	public Doctor getDoctor(String name, String surName, String worker) {
		// Doctor doctor = new Doctor(name, surName, worker);
		return null;
	}

	static List<Doctor> doctors = new ArrayList<Doctor>();

	public void addToList(String name, String surName, String worker) {
		Doctor d = new Doctor();
		d.Doctor(name, surName, worker);
		this.doctors.add(d);
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

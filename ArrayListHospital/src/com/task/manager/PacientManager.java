package com.task.manager;

import java.util.List;

import com.task.person.Doctor;
import com.task.person.Pacient;

public class PacientManager extends AbstractManager {
	
	static List<Pacient> pacients = hos.getPacients();
	
	public void addPacient(Pacient pacient){		
		pacients.add(pacient);
		hos.setPacients(pacients);		
	}

	public void printList() {
		System.out.println("List of all pacients");
		for (Pacient pac : pacients) {
			System.out.println(pac.toString());
		}
	}

	public int countPacient() {
		int size = pacients.size();
		System.out.println("--count pacient--");
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

	public void printPacientToDoctor(Doctor doc) {
		List<Pacient> pac = doc.getPacientList();
		for (Pacient pacient : pac) {
			System.out.println(pacient.toString());
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

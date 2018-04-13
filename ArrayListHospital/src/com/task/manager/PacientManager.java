package com.task.manager;

import java.util.List;
import com.task.person.Pacient;

public class PacientManager extends Manager {
	
	static List<Pacient> pacients = hos.getPacients();
	
	public void addPacient(Pacient pacient){		
		pacients.add(pacient);
		hos.setPacients(pacients);		
	}

	public void printList() {
		System.out.println("List of all pacients");
		for (Pacient pac : pacients) {
			System.out.println(pac.printAll());
		}
	}

	public int countPacient() {
		int size = pacients.size();
		System.out.println("--count pacient--");
		return size;
	}


}

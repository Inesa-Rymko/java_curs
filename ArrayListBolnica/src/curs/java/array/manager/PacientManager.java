package curs.java.array.manager;

import java.util.ArrayList;
import java.util.List;
import curs.java.array.interfaces.IPacient;
import curs.java.array.person.Pacient;

public class PacientManager implements IPacient {

	@Override
	public Pacient getPacient(String name, String surName, int age) {
		// TODO Auto-generated method stub
		return null;
	}

	static List<Pacient> pacients = new ArrayList<Pacient>();

	public void addToList(String name, String surName, int age) {
		Pacient p = new Pacient();
		p.Pacient(name, surName, age);
		this.pacients.add(p);
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

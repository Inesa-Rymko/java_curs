package com.task.main;

import com.task.manager.DoctorManager;
import com.task.manager.PacientManager;
import com.task.person.Doctor;
import com.task.person.Pacient;

public class Main {

	public static void main(String[] args) {
		DoctorManager dm = new DoctorManager();
		PacientManager pm = new PacientManager();
		
		Doctor doctor = new Doctor("f", "y", "f");
		Doctor doctor1 = new Doctor("Slava", "Petrov", "lor");
		Doctor doctor2 = new Doctor("Pasha", "Ivanov", "terapevt");
		dm.addDoctor(doctor);
		dm.addDoctor(doctor1);
		dm.addDoctor(doctor2);
		dm.printList();
		System.out.println(dm.countDoctor());
		
		Pacient pacient = new Pacient("Inessa", "Rymko", 21);
		Pacient pacient1 = new Pacient("Olga", "Rymko", 26);
		Pacient pacient2 = new Pacient("Victor", "Rymko", 24);
		
		pm.addPacient(pacient);
		pm.addPacient(pacient2);
		pm.addPacient(pacient1);
		pm.printList();
		System.out.println(pm.countPacient());
		
		pm.addPacienToDoctor(pacient, doctor);
		pm.addPacienToDoctor(pacient1, doctor);
		pm.addPacienToDoctor(pacient2, doctor);
		pm.delPacienToDoctor(pacient1, doctor);
		System.out.println("--pacient to doctor---");		
		pm.printPacientToDoctor(doctor);
		pm.countPacientToDoctor(doctor);		
	}
}

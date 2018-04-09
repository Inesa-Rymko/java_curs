package curs.java.manager;

import curs.java.person.Doctor;
import curs.java.person.Pacient;

public class DoctorManager extends Manager {

	public void addDoctor(Doctor doctor) {
		Doctor[] doctors = hos.getDoctorList();
		if (!ArrayHelper.checkArray(doctors)) {
			hos.setDoctorList(doctors);
			ArrayHelper.copySize(doctors);
		} else {
			Integer newIndex = ArrayHelper.getIndex(doctors);
			doctors[newIndex] = doctor;
			}	
		hos.setDoctorList(doctors);
		}
	
	public void showListDoctor() {
		Doctor[] d = hos.getDoctorList();
		for (int i = 0; i < d.length; i++) {
			if (d[i] != null) {
				System.out.println(d[i]);
			}
		}
	}

	public void addPacientToDoctor(Pacient pacient, Doctor doc) {
		Pacient[] pac = doc.getPacientList();	
		if (!ArrayHelper.checkArray(pac)) {
			ArrayHelper.copySize(pac);
		} else {
			Integer newIndex = ArrayHelper.getIndex(pac);
				pac[newIndex] = pacient;
			}
		pacient.doctor = doc;
			doc.setPacientList(pac);
		}
	

	public void listPacientToDoctor(Doctor doc) {
		Pacient[] pac = doc.getPacientList();
		for (int i = 0; i < pac.length; i++) {
			if (pac[i] != null) {
				System.out.println(pac[i]);
			}
		}
	}

	public void countPacientToDoctor(Doctor doc) {
		Pacient[] pac = doc.getPacientList();
		int count = 0;
		for (int i = 0; i < pac.length; i++) {
			if (pac[i] != null) {
				count++;
			}
			System.out.println(count);
		}
	}	

	public void deletePacientToDoctor(Pacient pacient, Doctor doc) {
		Pacient[] pac = doc.getPacientList();
		Integer index = ArrayHelper.getIndexObject(pac, pacient);
		ArrayHelper.deleteElementToIndex(pac, index);
		doc.setPacientList(pac);
	}

	public int countDoctor() {
		int countDoctor = 0;
		Doctor[] doctor = hos.getDoctorList();
		for (int i = 0; i < doctor.length; i++) {
			if (doctor[i] != null) {
				countDoctor++;
			}
		}
		return countDoctor;
	}
}

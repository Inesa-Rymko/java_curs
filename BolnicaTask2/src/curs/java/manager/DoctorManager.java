package curs.java.manager;

import curs.java.person.Doctor;
import curs.java.person.Hospital;
import curs.java.person.Pacient;

public class DoctorManager extends Manager {

	public Integer getIndex(Doctor[] doctor) {
		Integer index = null;
		for (int i = 0; i < doctor.length; i++) {
			if (doctor[i] == null) {
				index = i;
				// System.out.println(index);
				return index;
			}
		}
		return null;
	}

	public Integer getIndexP(Pacient[] pacient) {
		// Doctor[] d = hos.getDoctorList();
		Integer index = null;
		for (int i = 0; i < pacient.length; i++) {
			if (pacient[i] == null) {
				index = i;
				// System.out.println(index);
				return index;
				// break;
			}
		}
		return null;
	}

	public Doctor[] copyArray(Doctor[] doctor) {
		int size = doctor.length;
		int newLenght = size * 2;
		Doctor[] newDoctor = new Doctor[newLenght];
		System.arraycopy(doctor, 0, newDoctor, 0, size);
		// hos.setDoctorList(newDoctor);
		// for(int i=0; i<newDoctor.length; i++){
		// System.out.println(newDoctor[i]);}
		return newDoctor;
	}

	public void addDoctor(Doctor doctor) {
		Doctor[] d = hos.getDoctorList();
		Integer index = getIndex(d);
		if (index != null) {
			d[index] = doctor;
			// System.out.println(d);
		} else {

			Doctor[] newdoc = copyArray(d);
			Integer newIndex = getIndex(newdoc);
			if (newIndex != null) {
				newdoc[newIndex] = doctor;
			}
			hos.setDoctorList(newdoc);
		}
	}

	public void showListDoctor() {
		Doctor[] d = hos.getDoctorList();
		for (int i = 0; i < d.length; i++) {
			if (d[i] != null) {
				System.out.println(d[i]);
			}
		}
	}

	public Pacient[] copyArrayPacientToDoctor(Pacient[] pacient) {
		int size = pacient.length;
		int newLen = size * 2;
		Pacient[] newPacient = new Pacient[newLen];
		System.arraycopy(pacient, 0, newPacient, 0, size);
		return newPacient;
	}

	public void addPacientToDoctor(Pacient pacient, Doctor doc) {
		Pacient[] pac = doc.getPacientList();
		Integer index = getIndexP(pac);
		// for (int i = 0; i < pac.length; i++) {
		if (index != null) {
			pac[index] = pacient;
		}
		// System.out.println(pac);
		else {
			Pacient[] newArr = copyArrayPacientToDoctor(pac);
			Integer newIndex = getIndexP(newArr);
			if (newIndex != null) {
				newArr[newIndex] = pacient;
			}
			pacient.doctor = doc;
			doc.setPacientList(newArr);
			// System.out.println(pac);
		}
	}
	// System.out.println(pac);

	public void listPacientToDoctor(Doctor doc) {
		Pacient[] pac = doc.getPacientList();
		for (int i = 0; i < pac.length; i++) {
			if (pac[i] != null) {
				System.out.println(pac[i]);
			}
		}
	}
	
	public void countPacientToDoctor(Doctor doc){
		Pacient[] pac = doc.getPacientList();
		int count=0;
		for (int i = 0; i < pac.length; i++) {
			if(pac[i]!=null){
				count++;
			}
			System.out.println(count);
		}
	}
	public Integer getIndexPacient(Pacient[] arr, Pacient pac) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == pac) {
				return i;
			}
		}
		return null;
	}

	public Pacient[] deleteElementToIndex(Pacient[] pac, Integer index) {
		for (int j = index; j < pac.length - 1; j++) {
			pac[j] = pac[j + 1];
		}
		Pacient[] newPac = pac;
		for (int i = 0; i < newPac.length; i++) {
			System.out.println(newPac[i]);
		}
		return newPac;
	}
	public void deletePacientToDoctor(Pacient pacient, Doctor doc) {
		Pacient[] pac = doc.getPacientList();
		Integer index = getIndexPacient(pac, pacient);
		deleteElementToIndex(pac, index);
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
		// System.out.println(countDoctor);
		return countDoctor;
	}
}

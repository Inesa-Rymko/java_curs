package com.curs.java.api.facade;

import java.util.List;

import com.curs.java.model.Doctor;
import com.curs.java.model.Entity;
import com.curs.java.model.Pacient;

public interface IFacade {

		public void addDoctor(Doctor doctor);

		public void countDoctor();

		public void addPacient(Pacient pacient);

		public void deletePacient(Pacient pacient);

		public void addPacienToDoctor(Pacient pact, Doctor doc);

		public List<Doctor> showListDoctor();

		public void showListDoctorSort();

		public void printerCountPacient();

		public void showListPacient();

		public void showPacientToDoctor(Doctor doc);

		public void countPacientToDoctor(Doctor doc);

		public Entity clone(Entity entity) throws CloneNotSupportedException;

		public void deletePacienToDoctor(Pacient pact, Doctor doc);

		public void writeToFilePacient(String file);

		public void writeToFileDoctor(String file);

		public void readFile(String file);

		public void serializDoctor(String file);

		public void serializPacient(String file);

		public void getDoctorByID(long id);
		
		public void getPacientByID(long id);
		
		public void getDoctorByName(String Surname);
		
		public void getPacientByName(String Surname);
	}

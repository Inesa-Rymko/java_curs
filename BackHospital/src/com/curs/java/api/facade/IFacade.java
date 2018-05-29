package com.curs.java.api.facade;

import java.io.File;
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

		public List<Doctor> showListDoctorSort();

		public int printerCountPacient();

		public List<Pacient> showListPacient();

		public List<Pacient> showPacientToDoctor(Doctor doc);

		public int countPacientToDoctor(Doctor doc);

		public Entity clone(Entity entity) throws CloneNotSupportedException;

		public void deletePacienToDoctor(Pacient pact, Doctor doc);

		public void writeToFilePacient(String file);

		public void writeToFileDoctor(String file);

		public void readFile(String file);

		public void serializDoctor(String file);

		public void serializPacient(String file);

		public String getDoctorByID(long id);
		
		public String getPacientByID(long id);
		
		public String getDoctorByName(String Surname);
		
		public String getPacientByName(String Surname);

	}

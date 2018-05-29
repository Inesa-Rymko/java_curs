package com.curs.java.facade;

import java.io.IOException;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

import com.curs.java.api.facade.IFacade;
import com.curs.java.api.service.IDoctorService;
import com.curs.java.api.service.IPacientService;
import com.curs.java.comparable.DoctorComparator;
import com.curs.java.model.Doctor;
import com.curs.java.model.Entity;
import com.curs.java.model.Pacient;
import com.curs.java.repository.DoctorRepository;
import com.curs.java.repository.PacientRepository;
import com.curs.java.service.DoctorService;
import com.curs.java.service.PacientService;
import com.curs.java.utils.CsvWorker;
import com.curs.java.utils.Printer;
import com.curs.java.utils.Serializ;


public class Facade implements IFacade {
	
	private static final Logger logger = Logger.getLogger(Facade.class.getName());
	private static final String FILE_DOEST_EXISTS = "File doesn't exists";
	private static Facade instance;
	private IDoctorService doctors;
	private IPacientService pacients;

	public static Facade getInstance() {
		try {
			final Handler fileHandler = new FileHandler("logs.txt");
			logger.setUseParentHandlers(false);
			logger.addHandler(fileHandler);
		} catch (final IOException e) {
			logger.info("NO_LOGGER_FILE");
		}
		if (instance == null) {
			instance = new Facade();
		}
		return instance;
	}

	private Facade() {
		doctors = new DoctorService();
		pacients = new PacientService();
	}

	public void addDoctor(Doctor doctor) {
		doctors.addDoctor(doctor);
	}

	public void countDoctor() {
		doctors.countDoctor();
		
	}

	public void addPacient(Pacient pacient) {
		pacients.addPacient(pacient);
	}

	public void deletePacient(Pacient pacient) {
		pacients.deletePacient(pacient);
	}

	public void addPacienToDoctor(Pacient pact, Doctor doc) {
		pacients.addPacienToDoctor(pact, doc);
	}

	public void deletePacienToDoctor(Pacient pact, Doctor doc) {
		pacients.deletePacienToDoctor(pact, doc);
	}

	public List<Doctor> showListDoctorSort() {
		return doctors.getDoctors(new DoctorComparator());
	}

	public List<Doctor> showListDoctor() {
		return doctors.getDoctors(null);
	}

	public int printerCountPacient() {
		return pacients.countPacient();
	}

	public List<Pacient> showListPacient() {
		return pacients.getPacients();
	}

	public  List<Pacient> showPacientToDoctor(Doctor doc) {
		System.out.println("--pacient to doctor--" + doc.getSurName());
		return doc.getPacientList();
	}

	public int countPacientToDoctor(Doctor doc) {
		return pacients.countPacientToDoctor(doc);
	}

	public void writeToFilePacient(String file) {
		List<Pacient> pacient = pacients.getPacients();
		try {
			CsvWorker.writePacient(pacient, file);
		} catch (IOException e) {
			Printer.print(FILE_DOEST_EXISTS);
			logger.info(FILE_DOEST_EXISTS);
		}
	}

	public void writeToFileDoctor(String file) {
		List<Doctor> doctor = doctors.getDoctors(null);
	
			try {
				CsvWorker.writeDoctor(doctor, file);
			} catch (IOException e) {
				Printer.print(FILE_DOEST_EXISTS);
				logger.info(FILE_DOEST_EXISTS);
			}
		
	}

	public void readFile(String file) {		
			try {
				System.out.println(CsvWorker.readOdj(file));
					CsvWorker.readOdj(file);
				} catch (IOException e) {
					Printer.print(FILE_DOEST_EXISTS);
					logger.info(FILE_DOEST_EXISTS);
				}
			
	}

	public Entity clone(Entity entity) throws CloneNotSupportedException {
		Entity clone = (Entity) super.clone();
		return clone;
	}

	public void serializDoctor(String file) {
		try {
			Serializ.serialize(DoctorRepository.getInstance(), file);
		} catch (IOException e) {
			Printer.print(FILE_DOEST_EXISTS);
			logger.info(FILE_DOEST_EXISTS);
		}
	}

	public void serializPacient(String file) {
		try {
			Serializ.serialize(PacientRepository.getInstance(), file);
		} catch (IOException e) {
			Printer.print(FILE_DOEST_EXISTS);
			logger.info(FILE_DOEST_EXISTS);
		}
	}

	public String getDoctorByID(long id){
		return doctors.getDoctorById(id);
	}
	
	public String getPacientByID(long id){
		return pacients.getPacientById(id);
	}
	
	public String getDoctorByName(String name){
		String doc = doctors.getDoctorByName(name);
		return doc;
	}
	
	public String getPacientByName(String Surname){
		return pacients.getPacientByName(Surname);
	}


}

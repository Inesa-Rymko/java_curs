package com.curs.java.facade;
import java.awt.Component;
import java.awt.List;
import java.io.IOException;
import java.util.Properties;
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
import com.curs.java.utils.CSVObject;
import com.curs.java.utils.CsvWorker;
import com.curs.java.utils.Printer;
import com.curs.java.utils.Serializ;


public class Facade implements IFacade {
	
	private static final Logger logger = Logger.getLogger(Serializ.class.getName());
	//private static final Logger logger = Logger.getLogger("Logger");
	private static Facade instance;
	private IDoctorService doctors;
	private IPacientService pacients;

	public static Facade getInstance() {
		try {
			final Handler fileHandler = new FileHandler("loggin.txt");
			logger.setUseParentHandlers(false);
			logger.addHandler(fileHandler);
			//Properties.loadConfiguration();
		} catch (final IOException e) {
			Printer.print("NO_LOGGER_FILE");
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
		Printer.printObject(doctors.countDoctor());
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

	public void showListDoctorSort() {
		Printer.printArray(doctors.getDoctors(new DoctorComparator()));
	}

	public void showListDoctor() {
		Printer.printArray(doctors.getDoctors(null));
	}

	public void printerCountPacient() {
		Printer.printObject(pacients.countPacient());
	}

	public void showListPacient() {
		Printer.printArray(pacients.getPacients());
	}

	public void showPacientToDoctor(Doctor doc) {
		System.out.println("--pacient to doctor--" + doc.getSurName());
		Printer.printArray(doc.getPacientList());
	}

	public void countPacientToDoctor(Doctor doc) {
		Printer.printObject(pacients.countPacientToDoctor(doc));
	}

	public void writeToFilePacient(String file) {				
		String pac = CSVObject.valuePacient(pacients.getPacients());	
			CsvWorker.writeObj(pac, file);	
	}
	

	public void writeToFileDoctor(String file) {
		String doc = CSVObject.valueDoctor(doctors.getDoctors(null));
			CsvWorker.writeObj(doc, file);	
	}

	public void readFile(String file) {
			CsvWorker.readOdj(file);	
	}
	
	public Entity clone(Entity entity) throws CloneNotSupportedException {
		Entity clone = (Entity) super.clone();
		return clone;
	}

	public void serializDoctor(String file){
		Serializ.serialize(DoctorRepository.getInstance(), file);
	}
	
	public void serializPacient(String file){
		Serializ.serialize(PacientRepository.getInstance(), file);
	}
}

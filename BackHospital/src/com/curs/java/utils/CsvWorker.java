
package com.curs.java.utils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import com.curs.java.facade.Facade;
import com.curs.java.main.Main;
import com.curs.java.model.Doctor;
import com.curs.java.model.Entity;
import com.curs.java.model.Pacient;
import com.curs.java.repository.DoctorRepository;

public class CsvWorker {

	private static final Logger logger = Logger.getLogger(CsvWorker.class.getName());
	private static final String FILE_DOEST_EXISTS = "File doesn't exists";
	private static final String EXEPTION = "Enother exeption";

	public static void writeDoctor(List<Doctor> doctor, String file) throws IOException {
		StringBuilder stringBuilder = new StringBuilder();
		for (Doctor doct : doctor) {
			stringBuilder.append(doct.getId()).append("; ").append(doct.getName()).append("; ")
					.append(doct.getSurName()).append("; ").append(doct.getWorker()).append("; ").append("\n");
		}

		CSVWriter.writer(stringBuilder, file);

	}

	public static void writePacient(List<Pacient> pacient, String file) throws IOException {
		StringBuilder stringBuilder = new StringBuilder();
		for (Pacient pac : pacient) {
			stringBuilder.append(pac.getId()).append("; ").append(pac.getName()).append("; ").append(pac.getSurName())
					.append("; ").append(pac.getDiagnos()).append("; ").append("\n");
		}
		CSVWriter.writer(stringBuilder, file);
	}

	public static List<Doctor> readOdj(String file) {
		
		try {
			 FileInputStream fstream = new FileInputStream(file);
			   BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			List<Doctor> doc = new ArrayList<Doctor>();
			String line;
			while ((line = br.readLine()) != null) {
				String[] mas = line.split("; ");
				doc.add(Main.createDoctor(mas[0], mas[1], mas[3]));
				}
			br.close();
			return doc;
		} catch (FileNotFoundException e) {
			Printer.print(FILE_DOEST_EXISTS);
			logger.info(FILE_DOEST_EXISTS);

		} catch (IOException e) {
			Printer.print(EXEPTION);
			logger.info(EXEPTION);

		}
		return null;
	}
}

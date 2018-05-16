
package com.curs.java.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.curs.java.model.Doctor;
import com.curs.java.model.Entity;
import com.curs.java.model.Pacient;

public class CsvWorker {

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

	public static List<Entity> readOdj(String file) {
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
			String line;
			while ((line = br.readLine()) != null) {
				StringBuilder sb = new StringBuilder(line);
				ArrayList<Doctor> aList = new ArrayList(Arrays.asList(line.split("; ")));
				Printer.printObject(aList);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return null;
	}
}



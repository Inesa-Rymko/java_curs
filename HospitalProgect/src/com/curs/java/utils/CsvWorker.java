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

/*
 * public static ARepository readObj(ARepository repository, String file) throws
 * IOException{ try { BufferedReader buffer = new BufferedReader(new
 * FileReader(file)); String line; Boolean flag = true; while ((line =
 * buffer.readLine()) != null){ if (flag){ flag = false; continue; }
 * 
 * String[] fields = line.split(";"); if (
 * repository.isFreeId(Integer.valueOf(fields[0]))){ repository.add(fields); }
 * else{ repository.update(fields); }
 * 
 * } } catch (FileNotFoundException e) { Printer.print("ERROR_WRONG_INPUT"); }
 * return repository; }
 */

/*
 * ArrayList<Doctor> customers = new ArrayList<>(); BufferedReader
 * bufferedReader = new BufferedReader(new FileReader(file)); String
 * currentLine; while((currentLine=bufferedReader.readLine())!=null) {
 * customers.add(currentLine); }bufferedReader.close(); for(int i =
 * 0;i<customers.size();i++) { Doctor customer = customers.get(i);
 * System.out.println(customer.getName() + " | " + customer.getSurName() + " | "
 * + customer.getWorker()); } return null;}}
 */

/*
 * List<String> list = new ArrayList<String>(); Scanner in = new Scanner(new
 * File(file)); while (in.hasNextLine()) list.add(in.nextLine()); String[] array
 * = list.toArray(new String[0]); for (int i=0; i<list.size(); i++) { Pacient
 * customer = list.get(i); System.out.println(customer.getName() + " | " +
 * customer.getSurName() + " | " + customer.getDiagnos()); }
 * System.out.println(list);
 */
/*
 * BufferedReader reader = new BufferedReader(new FileReader(file));
 * List<String> lines = new ArrayList<String>(); String line; while ((line =
 * reader.readLine()) != null) { lines.add(line); // System.out.println(lines);
 * } ; String [] linesAsArray = lines.toArray(new String[lines.size()]);
 * reader.close(); System.out.println(linesAsArray); return null;
 */

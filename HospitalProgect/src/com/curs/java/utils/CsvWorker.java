package com.curs.java.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.curs.java.model.Doctor;
import com.curs.java.model.Entity;
import com.curs.java.model.Pacient;

public class CsvWorker {
	
	public static void writeObj(List<Doctor> doctor, String file) throws IOException {
		StringBuilder stringBuilder = new StringBuilder();
		for (Doctor doct : doctor){
		stringBuilder.append(doct.getId()).append(";").append(doct.getName())
				.append(";").append(doct.getSurName())
				.append(";").append(doct.getWorker())
				.append(";").append("\n");}
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
				bw.write(stringBuilder.toString());
				bw.close();
		}
	
	public static void writePacient(List<Pacient> pacient, String file) throws IOException {
		StringBuilder stringBuilder = new StringBuilder();
		for (Pacient pac : pacient){
		stringBuilder.append(pac.getId()).append(";").append(pac.getName())
				.append(";").append(pac.getSurName())
				.append(";").append(pac.getDiagnos())
				.append(";").append("\n");}
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
				bw.write(stringBuilder.toString());
				bw.close();
		}

	public static List<Entity> readOdj(String file) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader(file));		
		String line;
			while ((line = br.readLine()) != null) {
				StringBuilder sb = new StringBuilder(line);
				ArrayList<String> aList = new ArrayList<String>(Arrays.asList(line));
				for (int i = 0; i < aList.size(); i++) {
					Printer.print(aList.get(i));
				}
			}
			return null;

	}
}

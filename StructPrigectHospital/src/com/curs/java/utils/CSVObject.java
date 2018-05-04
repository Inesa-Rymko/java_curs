package com.curs.java.utils;

import java.util.List;

import com.curs.java.model.Doctor;
import com.curs.java.model.Pacient;

public class CSVObject {
	

	public static String valueDoctor(List<Doctor> doctor) {
		StringBuilder stringBuilder = new StringBuilder();
		for (Doctor doct : doctor){
		stringBuilder.append(doct.getId()).append(";").append(doct.getName())
				.append(";").append(doct.getSurName())
				.append(";").append(doct.getWorker())
				.append(";").append("\n");}

		return stringBuilder.toString();
	}

	public static String valuePacient(List<Pacient> pacient) {
		StringBuilder stringBuilder = new StringBuilder();
		for (Pacient pac : pacient){
		stringBuilder.append(pac.getId()).append(";").append(pac.getName())
				.append(";").append(pac.getSurName())
				.append(";").append(pac.getDiagnos())
				.append(";").append("\n");}

		return stringBuilder.toString();
	}
	
}

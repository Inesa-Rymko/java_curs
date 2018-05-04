package com.curs.java.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class CsvWorker {
	
	private static final String ERROR_WRONG_INPUT = "Text doesn't exists";
	private static final String FILE_DOEST_EXISTS = "File doesn't exists";
	
	public static void writeObj(String str, String file) {
			BufferedWriter bw;
			try {
				bw = new BufferedWriter(new FileWriter(file));
				bw.write(str.toString());
				bw.close();
			} catch (IOException e1) {
				  Printer.print(FILE_DOEST_EXISTS);
			}		
		}

	public static void readOdj(String file) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e1) {
			 
			  Printer.print(FILE_DOEST_EXISTS);
		}
		String line;
		try {
			while ((line = br.readLine()) != null) {
				StringBuilder sb = new StringBuilder(line);
				ArrayList<String> aList = new ArrayList<String>(Arrays.asList(line.split("],")));
				for (int i = 0; i < aList.size(); i++) {
					Printer.print(aList.get(i));
				}
			}
		} catch (IOException e) {
			 Printer.print(ERROR_WRONG_INPUT);
		}

	}
}

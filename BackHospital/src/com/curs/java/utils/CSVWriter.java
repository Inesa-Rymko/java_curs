package com.curs.java.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CSVWriter {
	
	public static void writer(StringBuilder str, String file) throws IOException {
		BufferedWriter bw = null;
			bw = new BufferedWriter(new FileWriter(file));
			bw.write(str.toString()); 
				bw.close();
		
	}

}

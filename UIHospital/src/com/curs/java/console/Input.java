package com.curs.java.console;

import java.io.InputStream;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.curs.java.utils.Printer;

public class Input {
	
	private static final Logger logger = Logger.getLogger(Input.class.getName());
	private static final String INCORRECT_INPUT = "Incorrect input";
	
	private static Input input;

	public static Input getInstance() {
		if (input == null) {
			input = new Input(System.in);
		}
		return input;
	}

	private Scanner scanner;

	private Input(InputStream inputStream) {
		super();
		this.scanner = new Scanner(inputStream);
	}

	public String getString() {
		return scanner.nextLine();
	}

	public int getInt() {
		int number = 0;
		boolean pl = false;
		do {
			try {
				number = Integer.valueOf(scanner.nextLine());
				pl = true;
			} catch (NumberFormatException e) {
				Printer.print(INCORRECT_INPUT);
				logger.error(e.getMessage());
			}
		} while (!pl);
		return number;	
	}
	
	@Override
	protected void finalize() throws Throwable {
		scanner.close();
		super.finalize();
	}
}

package com.curs.java.actiondoctor;

import com.curs.java.api.IAction;
import com.curs.java.reflection.Reflections;
import com.curs.java.utils.Input;
import com.curs.java.utils.Printer;

public class ReadDoctorFromCsv implements IAction {

	private Reflections ref = Reflections.getInstance();
	
	@Override
	public void execute() {
		Printer.print("Input file name :");		
	    String file = Input.getInstance().getString();
		ref.workToFile("readFile", file);
	}

}

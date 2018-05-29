package com.curs.java.actionpacient;

import com.curs.java.api.IAction;
import com.curs.java.model.Pacient;
import com.curs.java.reflection.Reflections;
import com.curs.java.utils.Input;
import com.curs.java.utils.Printer;

public class AddPacient implements IAction {

	private Reflections ref = Reflections.getInstance();
	
	@Override
	public void execute() {
		Input input = Input.getInstance();
		
	    Printer.print("Input pacient's name :");
	    String name = Input.getInstance().getString();
	    
	    Printer.print("Input pacient's surname :");
	    String surName = Input.getInstance().getString();
	    
	    Printer.print("Input pacient's diagnos :");
	    String diagnos = Input.getInstance().getString();
	    
	    Pacient pac = new Pacient(name, surName, diagnos);
	    ref.metodWithPacient("addPacient", pac);
		
	}
	
}

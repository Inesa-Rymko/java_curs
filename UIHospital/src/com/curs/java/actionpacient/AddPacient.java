package com.curs.java.actionpacient;

import com.curs.java.actions.IAction;
import com.curs.java.api.facade.IFacade;
import com.curs.java.console.Input;
import com.curs.java.facade.Facade;

import com.curs.java.model.Pacient;
import com.curs.java.utils.Printer;

public class AddPacient implements IAction {

	@Override
	public void execute() {
		Input input = Input.getInstance();
		IFacade facade = Facade.getInstance();
		
	    Printer.print("Input pacient's name :");
	    String name = Input.getInstance().getString();
	    
	    Printer.print("Input pacient's surname :");
	    String surName = Input.getInstance().getString();
	    
	    Printer.print("Input pacient's diagnos :");
	    String diagnos = Input.getInstance().getString();
	    
	    Pacient pac = new Pacient(name, surName, diagnos);
	    facade.addPacient(pac);
		
	}
	

}

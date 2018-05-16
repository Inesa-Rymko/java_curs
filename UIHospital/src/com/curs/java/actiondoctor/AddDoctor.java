package com.curs.java.actiondoctor;


import com.curs.java.actions.IAction;
import com.curs.java.api.facade.IFacade;
import com.curs.java.console.Input;
import com.curs.java.facade.Facade;
import com.curs.java.model.Doctor;
import com.curs.java.utils.Printer;


public class AddDoctor implements IAction {

	@Override
	public void execute() {
		Input input = Input.getInstance();
		IFacade facade = Facade.getInstance();
		
	    Printer.print("Input doctors's name :");
	    String name = Input.getInstance().getString();
	    
	    Printer.print("Input doctors's surname :");
	    String surName = Input.getInstance().getString();
	    
	    Printer.print("Input doctors's worker :");
	    String worker = Input.getInstance().getString();
	    
	    Doctor doc = new Doctor(name, surName, worker);
	    facade.addDoctor(doc);
		 
	    
	}

}

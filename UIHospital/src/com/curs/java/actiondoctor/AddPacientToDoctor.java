package com.curs.java.actiondoctor;

import java.util.List;

import com.curs.java.actions.IAction;
import com.curs.java.api.facade.IFacade;
import com.curs.java.console.Input;
import com.curs.java.console.PrinterPrint;
import com.curs.java.facade.Facade;
import com.curs.java.model.Doctor;
import com.curs.java.model.Pacient;
import com.curs.java.utils.Printer;

public class AddPacientToDoctor implements IAction{

	@Override
	public void execute() {
		IFacade facade = Facade.getInstance();
		Input input = Input.getInstance();
		
	    Printer.print("Input pacient's name :");
	    String name = Input.getInstance().getString();
	    
	    Printer.print("Input pacient's surname :");
	    String surName = Input.getInstance().getString();
	    
	    Printer.print("Input pacient's diagnos :");
	    String diagnos = Input.getInstance().getString();
	    
	    Pacient pac = new Pacient(name, surName, diagnos);
	    
        List<Doctor> doc = facade.showListDoctor();    
	    PrinterPrint.showList(doc);
	    PrinterPrint.show("Input surName doctor");
	     String namedoctor = Input.getInstance().getString();
	   
		
	}

}

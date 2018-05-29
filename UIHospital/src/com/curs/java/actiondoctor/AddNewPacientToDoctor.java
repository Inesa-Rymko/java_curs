package com.curs.java.actiondoctor;

import java.util.List;
import com.curs.java.api.IAction;
import com.curs.java.model.Doctor;
import com.curs.java.model.Pacient;
import com.curs.java.reflection.Reflections;
import com.curs.java.utils.Input;
import com.curs.java.utils.Printer;
import com.curs.java.utils.PrinterPrint;

public class AddNewPacientToDoctor implements IAction {

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
	    
		Printer.print("Input id number doctor:");
		int numdoc = Input.getInstance().getInt();
		
	    List<Doctor> doc = ref.listDoctor("showListDoctor"); 
		PrinterPrint.showList(doc);
		Doctor doc1 = doc.get(numdoc);

	    ref.RefAddPacToDoctor("addPacienToDoctor", pac, doc1);
	 	
	}
}

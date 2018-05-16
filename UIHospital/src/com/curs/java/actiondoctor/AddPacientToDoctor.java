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
		
		List<Doctor> doc = facade.showListDoctor();  
		PrinterPrint.showList(doc);
		
		List<Pacient> pac = facade.showListPacient();
		PrinterPrint.showList(pac);
		
		Printer.print("Input id number doctor:");
		int numdoc = Input.getInstance().getInt();
		
		Printer.print("Input id number pacient:");
		int numpac = Input.getInstance().getInt();
		
		facade.addPacienToDoctor(pac.get(numpac), doc.get(numdoc));
	
	}

}

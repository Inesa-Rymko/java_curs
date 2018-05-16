package com.curs.java.actiondoctor;

import java.util.List;

import com.curs.java.actions.IAction;
import com.curs.java.api.facade.IFacade;
import com.curs.java.console.Input;
import com.curs.java.console.PrinterPrint;
import com.curs.java.facade.Facade;
import com.curs.java.model.Doctor;
import com.curs.java.utils.Printer;

public class ShowListPacientToDoctor implements IAction {

	@Override
	public void execute() {
		
		Input input = Input.getInstance();
		IFacade facade = Facade.getInstance();
		
		 List<Doctor> doc = facade.showListDoctor();  
			PrinterPrint.showList(doc);
			Printer.print("Input id number doctor:");
			int numdoc = Input.getInstance().getInt();
			facade.showPacientToDoctor(doc.get(numdoc));
	}
	

}

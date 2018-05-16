package com.curs.java.actionpacient;

import java.util.List;

import com.curs.java.actions.IAction;
import com.curs.java.api.facade.IFacade;
import com.curs.java.console.Input;
import com.curs.java.console.PrinterPrint;
import com.curs.java.facade.Facade;
import com.curs.java.model.Pacient;
import com.curs.java.utils.Printer;

public class DeletePacient implements IAction{

	@Override
	public void execute() {
		IFacade facade = Facade.getInstance();
		
		List<Pacient> pac = facade.showListPacient();
		PrinterPrint.showList(pac);
		
		Printer.print("Input id number pacient:");
		int numpac = Input.getInstance().getInt();
		
		facade.deletePacient(pac.get(numpac));
		
	}
	

}

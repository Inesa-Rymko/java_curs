package com.curs.java.actionpacient;

import com.curs.java.actions.IAction;
import com.curs.java.api.facade.IFacade;
import com.curs.java.console.Input;
import com.curs.java.facade.Facade;
import com.curs.java.utils.Printer;

public class ReadDoctorFromCsv implements IAction {

	@Override
	public void execute() {
		IFacade facade = Facade.getInstance();
		Printer.print("Input file name :");		
	    String file = Input.getInstance().getString();
		facade.readFile(file);
	}

}

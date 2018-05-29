package com.curs.java.actions;

import com.curs.java.api.IAction;
import com.curs.java.api.facade.IFacade;
import com.curs.java.facade.Facade;

public class ExitAction implements IAction {

	private IFacade facade = Facade.getInstance();

	@Override
	public void execute() {
		facade.serializDoctor("doc");
		facade.serializPacient("pac");
		System.exit(0);

	}

}

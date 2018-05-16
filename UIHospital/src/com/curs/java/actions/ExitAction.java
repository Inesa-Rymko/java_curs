package com.curs.java.actions;

import com.curs.java.api.facade.IFacade;
import com.curs.java.facade.Facade;

public class ExitAction implements IAction {

	@Override
	public void execute() {
		IFacade facade = Facade.getInstance();
		System.exit(0);

	}


}

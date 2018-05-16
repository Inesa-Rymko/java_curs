package com.curs.java.actiondoctor;

import com.curs.java.actions.IAction;
import com.curs.java.api.facade.IFacade;
import com.curs.java.facade.Facade;

public class CountDoctor implements IAction {

	@Override
	public void execute() {
		IFacade facade = Facade.getInstance();
				facade.countDoctor();		
	}
}

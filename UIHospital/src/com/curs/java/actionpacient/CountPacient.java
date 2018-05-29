package com.curs.java.actionpacient;

import com.curs.java.api.IAction;
import com.curs.java.reflection.Reflections;

public class CountPacient implements IAction {

	private Reflections ref = Reflections.getInstance();
	
	@Override
	public void execute() {
		ref.printData("printerCountPacient");	
	}

}

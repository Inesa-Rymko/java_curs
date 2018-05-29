package com.curs.java.actiondoctor;

import com.curs.java.api.IAction;
import com.curs.java.reflection.Reflections;
import com.curs.java.utils.PrinterPrint;

public class ShowDoctor implements IAction {

	private Reflections ref = Reflections.getInstance();
	
	@Override
	public void execute() {	
		PrinterPrint.show("List doctors: ");
	    ref.printData("showListDoctor");
	}
}

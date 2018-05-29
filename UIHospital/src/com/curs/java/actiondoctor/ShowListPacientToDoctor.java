package com.curs.java.actiondoctor;

import java.util.List;
import com.curs.java.api.IAction;
import com.curs.java.model.Doctor;
import com.curs.java.reflection.Reflections;
import com.curs.java.utils.Input;
import com.curs.java.utils.Printer;
import com.curs.java.utils.PrinterPrint;

public class ShowListPacientToDoctor implements IAction {
	
	private Reflections ref = Reflections.getInstance();
	
	@Override
	public void execute() {

		Input input = Input.getInstance();

		List<Doctor> doc = ref.listDoctor("showListDoctor");
		PrinterPrint.showList(doc);
		Printer.print("Input id number doctor:");
		int numdoc = Input.getInstance().getInt();
		Doctor doct =doc.get(numdoc);
		ref.refShowPacToDoctor("showPacientToDoctor", doct);
	}

}

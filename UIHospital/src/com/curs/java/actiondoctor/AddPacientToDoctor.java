package com.curs.java.actiondoctor;

import java.util.List;

import com.curs.java.api.IAction;
import com.curs.java.model.Doctor;
import com.curs.java.model.Pacient;
import com.curs.java.reflection.Reflections;
import com.curs.java.utils.Input;
import com.curs.java.utils.Printer;
import com.curs.java.utils.PrinterPrint;

public class AddPacientToDoctor implements IAction{
	
	private Reflections ref = Reflections.getInstance();
	
	@Override
	public void execute() {
				
		
		Input input = Input.getInstance();
		
		List<Doctor> doc = ref.listDoctor("showListDoctor");  
		PrinterPrint.showList(doc);
		
		List<Pacient> pac = ref.listPacient("showListPacient");
		PrinterPrint.showList(pac);
		
		Printer.print("Input id number doctor:");
		int numdoc = Input.getInstance().getInt();
		
		Printer.print("Input id number pacient:");
		int numpac = Input.getInstance().getInt();
		Doctor d =  doc.get(numdoc);
		Pacient p = pac.get(numpac);
		ref.RefAddPacToDoctor("addPacienToDoctor", p, d);
	
	}

}

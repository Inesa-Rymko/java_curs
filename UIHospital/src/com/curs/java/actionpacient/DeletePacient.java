package com.curs.java.actionpacient;

import java.util.List;

import com.curs.java.api.IAction;
import com.curs.java.model.Pacient;
import com.curs.java.reflection.Reflections;
import com.curs.java.utils.Input;
import com.curs.java.utils.Printer;
import com.curs.java.utils.PrinterPrint;

public class DeletePacient implements IAction{
	
	private Reflections ref = Reflections.getInstance();
	
	@Override
	public void execute() {

		List<Pacient> pac = ref.listPacient("showListPacient");
		PrinterPrint.showList(pac);
		
		Printer.print("Input id number pacient:");
		int numpac = Input.getInstance().getInt();
		Pacient p = pac.get(numpac); 
		ref.metodWithPacient("deletePacient", p);		
	}	

}

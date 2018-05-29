package com.curs.java.actiondoctor;

import com.curs.java.api.IAction;
import com.curs.java.model.Doctor;
import com.curs.java.reflection.Reflections;
import com.curs.java.utils.Input;
import com.curs.java.utils.Printer;

public class AddDoctor implements IAction {

	private Reflections ref = Reflections.getInstance();

	@Override
	public void execute() {
		Input input = Input.getInstance();

		Printer.print("Input doctors's name :");
		String name = Input.getInstance().getString();

		Printer.print("Input doctors's surname :");
		String surName = Input.getInstance().getString();

		Printer.print("Input doctors's worker :");
		String worker = Input.getInstance().getString();

		Doctor doc = new Doctor(name, surName, worker);
		ref.metodWithDoctor("addDoctor", doc);
	}

}

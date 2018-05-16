package com.curs.java.menu;

import java.util.ArrayList;
import java.util.List;

import com.curs.java.actiondoctor.AddDoctor;
import com.curs.java.actiondoctor.AddNewPacientToDoctor;
import com.curs.java.actiondoctor.AddPacientToDoctor;
import com.curs.java.actiondoctor.CountDoctor;
import com.curs.java.actiondoctor.ShowDoctor;
import com.curs.java.actiondoctor.ShowListPacientToDoctor;
import com.curs.java.actiondoctor.WriteDoctorToCSV;
import com.curs.java.actionpacient.AddPacient;
import com.curs.java.actionpacient.CountPacient;
import com.curs.java.actionpacient.DeletePacient;
import com.curs.java.actionpacient.ShowPacient;
import com.curs.java.actionpacient.WritePacientToCSV;
import com.curs.java.actions.ExitAction;


public class Builder {
	
	private Menu rootMenu;
	
	private Menu builddoctor(Menu prevMenu){
		MenuItem backItem = new MenuItem();
		backItem.setTitle("back");
		backItem.setNextMenu(prevMenu);
		
		Menu doctorMenu = new Menu();
		
		doctorMenu.setName("Doctor");
		List<MenuItem> list = new ArrayList<>();
		
		MenuItem addItem = new MenuItem();
		addItem.setTitle("Add doctor");
		addItem.setAction(new AddDoctor());
		
		MenuItem showItem = new MenuItem();
		showItem.setTitle("Show doctor");
		showItem.setAction(new ShowDoctor());
		
		MenuItem countItem = new MenuItem();
		countItem.setTitle("Count doctor");
		countItem.setAction(new CountDoctor());
		
		MenuItem addPacientToDoctor = new MenuItem();
		addPacientToDoctor.setTitle("AddPacientToDoctorFromList");
		addPacientToDoctor.setAction(new AddPacientToDoctor());
		
		MenuItem addNewPacientToDoctor = new MenuItem();
		addNewPacientToDoctor.setTitle("AddNewPacientToDoctorFromList");
		addNewPacientToDoctor.setAction(new AddNewPacientToDoctor());
		
		MenuItem showPacientToDoctor = new MenuItem();
		showPacientToDoctor.setTitle("ShowPacientToDoctor");
		showPacientToDoctor.setAction(new ShowListPacientToDoctor());
		
		MenuItem writeCSVDoctor = new MenuItem();
		writeCSVDoctor.setTitle("WriteCSVDoctor");
		writeCSVDoctor.setAction(new WriteDoctorToCSV());
		
		list.add(backItem);
		list.add(addItem);
		list.add(showItem);
		list.add(countItem);
		list.add(addPacientToDoctor);
		list.add(addNewPacientToDoctor);
		list.add(showPacientToDoctor);
		list.add(writeCSVDoctor);
		
		doctorMenu.setListItems(list);
		return doctorMenu;		
	}
	
	private Menu buildpacient(Menu prevMenu) {
		MenuItem backItem = new MenuItem();
		backItem.setTitle("back");
		backItem.setNextMenu(prevMenu);
		
		Menu pacientMenu = new Menu();
		pacientMenu.setName("Pacient");
		List<MenuItem> list = new ArrayList<>();
		MenuItem addItem = new MenuItem();
		addItem.setTitle("Add pacient");
		addItem.setAction(new AddPacient());
		MenuItem showItem = new MenuItem();
		showItem.setTitle("Show pacient");
		showItem.setAction(new ShowPacient());
		
		MenuItem countItem = new MenuItem();
		countItem.setTitle("Count pacient");
		countItem.setAction(new CountPacient());
		
		MenuItem deleteItem = new MenuItem();
		deleteItem.setTitle("Delete pacient");
		deleteItem.setAction(new DeletePacient());
		
		MenuItem writeToCsv = new MenuItem();
		writeToCsv.setTitle("Write pacient to CSV");
		writeToCsv.setAction(new WritePacientToCSV());
		
		list.add(backItem);
		list.add(addItem);
		list.add(showItem);
		list.add(countItem);
		list.add(deleteItem);
		list.add(writeToCsv);
		
		pacientMenu.setListItems(list);
		return pacientMenu;
	}

	public void buildMenu() {
		MenuItem exitItem = new MenuItem();
		exitItem.setTitle("exit");
		
		exitItem.setAction(new ExitAction());
		MenuItem doctorItem = new MenuItem();
		doctorItem.setTitle("Doctor");
		MenuItem pacientItem = new MenuItem();
		pacientItem.setTitle("Pacient");
		
		List<MenuItem> list = new ArrayList<>();
		list.add(exitItem);
		list.add(doctorItem);
		list.add(pacientItem);
		
		rootMenu = new Menu();
		rootMenu.setListItems(list);
		rootMenu.setName("Hospital");
		
		doctorItem.setNextMenu(builddoctor(rootMenu));
		pacientItem.setNextMenu(buildpacient(rootMenu));
	}

	public Menu getRootMenu() {
		return rootMenu;
	}
}

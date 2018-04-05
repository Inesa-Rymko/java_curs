package curs.java.main;

import curs.java.manager.DoctorManager;
import curs.java.manager.PacientNManager;
import curs.java.person.Doctor;
import curs.java.person.Pacient;


public class Main {
	public static void main(String[] args) {
	
		DoctorManager dm = new DoctorManager();
		PacientNManager pm = new PacientNManager();
		
		Pacient pac9 = new Pacient("hghjgj", "gfds", 56);
		Pacient pac = new Pacient("hgj", "gs", 86);
		Pacient pac4 = new Pacient("hàïðj", "g", 568);
		
		Doctor doc = new Doctor("ggg", "hds", "gfhjvgj");
		Doctor doc1 = new Doctor("ggg", "hds", "gfhjvgj");
		Doctor doc3 = new Doctor("ggg", "hds", "gfhjvgj");
		
		//System.out.println("---------adddoctor-------");
		dm.addDoctor(doc);
		dm.addDoctor(doc1);
	    dm.addDoctor(doc3);
	    
	   //System.out.println("----------pacient----------------");
	    pm.addPacient(pac9);
	    pm.addPacient(pac);
	    pm.addPacient(pac4);
	    
		//System.out.println("-----------doctor to pacient---------------");
		dm.addPacientToDoctor(pac9, doc1);
		dm.addPacientToDoctor(pac, doc1);
		dm.addPacientToDoctor(pac4, doc1);
		System.out.println("----------pacient----------------");
		dm.listPacientToDoctor(doc1);
		System.out.println("----------pacient----fgh------------");
		dm.deletePacientToDoctor(pac4, doc1);
		
		dm.countPacientToDoctor(doc1);
		
		//System.out.println("-------------SHOW--pacient------------");
		//pm.showListPacient();
		
		//System.out.println("----------count--doctor-----------");
		//System.out.println(dm.countDoctor());
		
		//System.out.println("------------count--pacient------------");
		//System.out.println(pm.countPacient());
		
		//System.out.println("------doctors-------SHOW-------------");
		//dm.showListDoctor();
		
	}
	}
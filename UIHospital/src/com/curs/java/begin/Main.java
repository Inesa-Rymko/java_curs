package com.curs.java.begin;
import com.curs.java.facade.Facade;
import com.curs.java.menu.MenuController;


public class Main {
	
	public static void main(final String[] args) {
        final MenuController mc = new MenuController();
        mc.run();
        Facade.getInstance().serializDoctor("doc.dat");
        Facade.getInstance().serializPacient("pac.dat");
		
	}

}

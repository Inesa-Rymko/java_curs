package com.curs.java.api;

import java.util.ArrayList;
import java.util.List;
import com.curs.java.model.Pacient;

public abstract class APacientRepository {

protected List<Pacient> pacients = new ArrayList<Pacient>();
	
	public void addPacient(Pacient pacient){
		pacients.add(pacient);
	}
	
    public void delPacient(Pacient pacient){
    	pacients.remove(pacient);
    }
}
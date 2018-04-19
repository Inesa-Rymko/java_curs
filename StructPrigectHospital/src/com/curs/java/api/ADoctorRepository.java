package com.curs.java.api;

import java.util.ArrayList;
import java.util.List;

import com.curs.java.model.Doctor;

public abstract class ADoctorRepository {
	
	protected List<Doctor> doctors = new ArrayList<Doctor>();
	
	public void addDoctor(Doctor doctor){
		doctors.add(doctor);
	}
	
    public void delDoctor(Doctor doctor){
    	doctors.remove(doctor);
    }


}

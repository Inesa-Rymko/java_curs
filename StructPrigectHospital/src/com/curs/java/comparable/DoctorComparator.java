package com.curs.java.comparable;

import java.util.Comparator;

import com.curs.java.model.Doctor;

public class DoctorComparator implements Comparator<Doctor> {
	
	public int compare(Doctor o1, Doctor o2) {
		if (o1 != null && o2 != null) {
			return o1.getName().compareTo(o2.getName());
		}
		if (o1 != null) {
			return -1;
		} else {
			return 1;
		}
	}
		/*if (o1 != null && o2 != null){
		int flag = o1.getName().compareTo(o2.getName());
		
		if (flag == 0) {
			flag = o1.getSurName().compareTo(o2.getSurName());
		}
		return flag;
		}
		return 0;
	}*/
}

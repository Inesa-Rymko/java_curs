package com.curs.java.comparable;

import java.util.Comparator;

import com.curs.java.model.Doctor;

public class DoctorComparator implements Comparator<Doctor> {
	public int compare(Doctor o1, Doctor o2) {

		int flag = o1.getName().compareTo(o2.getName());

		if (flag == 0) {
			flag = o1.getSurName().compareTo(o2.getSurName());
		}
		return flag;

	}

}

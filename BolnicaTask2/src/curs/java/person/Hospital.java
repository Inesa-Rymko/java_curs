package curs.java.person;

public class Hospital {

	public Pacient[] pacientList = new Pacient[1];
	public Doctor[] doctorList = new Doctor[1];

	public Pacient[] getPacientList() {
		return pacientList;
	}

	public void setPacientList(Pacient[] pacientList) {
		this.pacientList = pacientList;
	}

	public Doctor[] getDoctorList() {
		return doctorList;
	}

	public void setDoctorList(Doctor[] doctorList) {
		this.doctorList = doctorList;
	}
}

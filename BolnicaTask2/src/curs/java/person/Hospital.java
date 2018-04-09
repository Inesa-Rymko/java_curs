package curs.java.person;

public class Hospital extends People{

	public Pacient[] pacientList = new Pacient[10];
	public Doctor[] doctorList = new Doctor[10];

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

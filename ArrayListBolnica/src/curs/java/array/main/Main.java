package curs.java.array.main;
import curs.java.array.manager.DoctorManager;
import curs.java.array.manager.PacientManager;
import curs.java.array.person.Doctor;
import curs.java.array.person.Pacient;

public class Main {

	public static void main(String[] args) {

		PacientManager pm = new PacientManager();
		pm.addToList("f", "h", 76);
		pm.addToList("fj", "nh", 76);
		pm.addToList("fy", "hy", 76);
		pm.addToList("yf", "he", 76);
		pm.printList();
		System.out.println(pm.countPacient());

		DoctorManager dm = new DoctorManager();
		dm.addToList("g", "gh", "j");
		dm.addToList("hg", "gh", "j");
		dm.addToList("gh", "gh", "hj");
		dm.printList();
		System.out.println(dm.countDoctor());

		Doctor d1 = new Doctor();
		d1.Doctor("rfre", "redre", "rf");

		Pacient p1 = new Pacient();
		p1.Pacient("rfre", "redre", 76);
		Pacient p2 = new Pacient();
		p2.Pacient("re", "re", 769);

		System.out.println("---pac to doctor");
		dm.addPacienToDoctor(p1, d1);
		dm.addPacienToDoctor(p2, d1);
		dm.delPacienToDoctor(p2, d1);
		dm.listPacientToDoctor(d1);
		dm.countPacientToDoctor(d1);

	}
}
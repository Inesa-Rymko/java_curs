package curs.java.manager;

import curs.java.person.Pacient;

public class PacientNManager extends Manager {

	public void addPacient(Pacient pacient) {
		Pacient[] pac = hos.getPacientList();
  	if (!ArrayHelper.checkArray(pac)) {
  		ArrayHelper.copySize(pac);
		} else {
			Integer newIndex = ArrayHelper.getIndex(pac);
			pac[newIndex] = pacient;
		}
	}

	public void showListPacient() {
		Pacient[] d = hos.getPacientList();
		for (int i = 0; i < d.length; i++) {
			if (d[i] != null) {
				System.out.println(d[i]);
			}
		}
	}

	public int countPacient() {
		int count = 0;
		Pacient[] pact = hos.getPacientList();
		for (int i = 0; i < pact.length; i++) {
			if (pact[i] != null) {
				;
				count++;
			}
		}
		return count;
	}
}

package curs.java.manager;

import curs.java.person.Doctor;
import curs.java.person.Pacient;

public class PacientNManager extends Manager {

	public Integer getIndex(Pacient[] pacient) {
		Integer index = null;
		for (int i = 0; i < pacient.length; i++) {
			if (pacient[i] == null) {
				index = i;
				return index;
			}
		}
		return null;
	}

	public Pacient[] copyArray(Pacient[] pacient) {
		int size = pacient.length;
		int newLenght = size * 2;
		Pacient[] newPacient = new Pacient[newLenght];
		System.arraycopy(pacient, 0, newPacient, 0, pacient.length);
		return newPacient;
	}

	public void addPacient(Pacient pacient) {
      Pacient[] pac = hos.getPacientList();
      Integer index = getIndex(pac);
      if(index!=null){
    	  pac[index]=pacient;
      }
      else{
    	  Pacient[] newPac =copyArray(pac);
    	  Integer newIndex =getIndex(newPac);
    	  if(newIndex != null){
    		  newPac[newIndex] = pacient;
    	  }
    	  hos.setPacientList(newPac);
      }
	}

	public void showListPacient() {
		Pacient[] d = hos.getPacientList();
		for (int i = 0; i < d.length; i++) {
			if(d[i]!=null){
			System.out.println(d[i]);
			}
		}
	}
	
	public int countPacient(){
		int count =0;
		Pacient[] pact = hos.getPacientList();
		for(int i =0; i<pact.length;i++){
			if(pact[i] != null){;
			count++;
		}  
	}
		return count;	
	}
}

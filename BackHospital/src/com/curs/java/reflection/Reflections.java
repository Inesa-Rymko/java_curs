package com.curs.java.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import com.curs.java.api.facade.IFacade;
import com.curs.java.facade.Facade;
import com.curs.java.model.Doctor;
import com.curs.java.model.Pacient;

public class Reflections {
	private static Reflections instance;
	
       private IFacade facade;

	private Reflections(){
		facade = Facade.getInstance();
	};

	public static Reflections getInstance() {
		if (instance == null) {
			instance = new Reflections();
		}
		return instance;
	}

	public List<Doctor> listDoctor(String name) {
		try {
			Method method = facade.getClass().getDeclaredMethod(name);
			return (List<Doctor>) method.invoke(facade);
		} catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<Pacient> listPacient(String name) {
		try {
			Method method = facade.getClass().getDeclaredMethod(name);
			return (List<Pacient>) method.invoke(facade);
		} catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void printData(String name) {
		try {
			Method method = facade.getClass().getDeclaredMethod(name);
			method.invoke(facade);
		} catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
			e.printStackTrace();
		}

	}

	public void metodWithDoctor(String name, Doctor doctor) {
		try {
			Class<?> param[] = new Class[] { Doctor.class };
			Method method = facade.getClass().getDeclaredMethod(name, param);
			Object[] args = new Object[] { doctor };
			method.invoke(facade, args);
		} catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	public void refShowPacToDoctor(String name, Doctor doctor) {
		try {
			Pacient pac = null;
			Class<?> param[] = new Class[] { Pacient.class, Doctor.class };
			Method method = facade.getClass().getDeclaredMethod(name, param);
			Object[] args = new Object[] { pac };
			method.invoke(facade, args);
		} catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	public void metodWithPacient(String name, Pacient pac) {
		try {
			Class<?> param[] = new Class[] { Pacient.class };
			Method method = facade.getClass().getDeclaredMethod(name, param);
			Object[] args = new Object[] { pac };
			method.invoke(facade, args);
		} catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	public void RefAddPacToDoctor(String name, Pacient pacient, Doctor doctor) {
		try {
			IFacade facade = Facade.getInstance();
			Class<?> param[] = new Class[] { Pacient.class, Doctor.class };
			Method method = facade.getClass().getDeclaredMethod(name, param);
			Object[] args = new Object[] { pacient, doctor };
			method.invoke(facade, args);
		} catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	public void workToFile(String name, String file) {
		try {
			IFacade facade = Facade.getInstance();
			Class<?> param[] = new Class[] { String.class };
			Method method = facade.getClass().getDeclaredMethod(name, param);
			String[] args = new String[] { file };
			method.invoke(facade, args);
		} catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}

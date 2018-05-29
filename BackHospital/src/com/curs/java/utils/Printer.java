package com.curs.java.utils;

import java.util.List;

import com.curs.java.model.Entity;

public class Printer {

	public static void print(String str) {
		System.out.println(str);
	}

	public static void print(Entity entity) {
		print(entity.toString());
	}

	public static void printArray(List<? extends Entity> listBook) {
		for (Entity entity : listBook) {
			if (entity != null) {
				print(entity);
			}
		}
	}

	public static void printObject(Object object) {
		System.out.println(object);
	}

	public static void printObjects(Object method) {
		System.out.println(method);		
	}

}

package curs.java.manager;

import curs.java.person.People;

public class ArrayHelper {

	public static Integer getIndex(People[] array) {
		Integer index = null;
		for (int i = 0; i < array.length; i++) {

			if (array[i] == null) {
				index = i;
				return index;
			}
		}
		return null;
	}

	public static boolean checkArray(People[] array) {
		for (int i = 0; i < array.length; i++) {

			if (array[i] == null) {
				return true;

			}
		}
		return false;
	}

	public static People[] copySize(People[] arr) {
		int arrlength = arr.length;
		int newLen = arrlength * 2;
		People newArr[] = new People[newLen];
		System.arraycopy(arr, 0, newArr, 0, arrlength);
		return newArr;
	}

	public static Integer getIndexObject(People[] arr, People obj) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == obj) {
				return i;
			}
		}
		return null;
	}

	public static People[] deleteElementToIndex(People[] pac, Integer index) {
		for (int j = index; j < pac.length - 1; j++) {
			pac[j] = pac[j + 1];
		}
		People[] newPac = pac;
		for (int i = 0; i < newPac.length; i++) {
		}
		return newPac;
	}

}

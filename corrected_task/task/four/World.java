package task.four;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

public class World {
	public static void main(String[] args) {

		String value = "My name is Inessa";
		String str = value.replaceAll("\\s*,\\s*", " ");
		System.out.println(str);
		String[] arr = createArray(str);
		sort(arr);
		count(arr);
	}

	public static void count(String[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
				count++;
		}
		System.out.println("count world " + count);
	}

	public static void sort(String[] strArray) {
		Arrays.sort(strArray);
		for (int j = 0; j < strArray.length; j++) {
			System.out.print(strArray[j] + "  ");
		}
	}

	public static String[] createArray(String str) {
		String[] arr = str.split(" ");
		return arr;
	}
}

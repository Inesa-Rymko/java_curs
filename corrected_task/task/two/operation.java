package task.two;

import java.util.Scanner;
import java.io.PrintWriter;

public class operation {

	public static void main(String[] args) {
		Scanner one = new Scanner(System.in);
		Scanner two = new Scanner(System.in);
		System.out.println("Enter some number 1: ");
		System.out.println("Enter some number 2: ");
		if (one.hasNextInt() && two.hasNextInt()) {
			int num_one = one.nextInt();
			int num_two = two.nextInt();
			System.out.println("NOD = " + NOD(num_one, num_two) + " " + " NOK " + NOK(num_one, num_two));
			System.out.println("сумма = " + (num_one + num_two));
			System.out.println("raznoct = " + (num_one - num_two));
		} else {
			System.out.println("число не целое ");
		}
	}

	public static void sum(int a, int b) {
		System.out.println("сумма = " + (a + b));
	}

	public static void raznioct(int a, int b) {
		System.out.println("сумма = " + (a - b));
	}

	static int NOD(int num_one, int num_two) {
		int min;
		int nod = 0;
		if (num_one > num_two)
			min = num_two;
		else
			min = num_one;
		for (int count = 1; count <= min; count++) {
			if (num_one % count == 0 && num_two % count == 0) {
				if (count > nod)
					nod = count;
			}
		}
		return nod;
	}

	static int NOK(int num_one, int si) {
		int nok = 0;
		int count = 1;
		while (nok == 0) {
			if (count % num_one == 0 && count % si == 0)
				nok = count;
			count++;
		}
		return nok;
	}
}

package task.one;

import java.util.Scanner;

public class number {

	public static void main(String[] args) {
		int number = scanner();
		chet(number);
		proct(number);
	}

	public static int scanner() {
		Scanner value = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = value.nextInt();
		return num;
	}

	public static void chet(int number) {
		if (number % 2 == 0) {
			System.out.println("число чётное ");
		} else {
			System.out.println("число нечетное ");
		}
	}

	public static void proct(int number) {
		int temp;
		boolean isPrime = true;
		for (int i = 2; i <= number / 2; i++) {
			temp = number % i;
			if (temp == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(number + " - простое число");
		} else {
			System.out.println(number + " - составное число");
		}
	}
}

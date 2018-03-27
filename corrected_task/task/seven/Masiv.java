package task.seven;
import java.util.Arrays;
import java.util.Random;

public class Masiv {

	public static void main(String[] args) {
		int[] mas = new int[10];
		int[] mass = massiv(mas);
		System.out.println(Arrays.toString(mass));
		max(mass);
		min(mass);
	}

	public static int[] massiv(int[] mas) {
		Random rnd = new Random();
		int[] mass = new int[10];
		for (int i = 0; i < mass.length; i++) {
			mass[i] = rnd.nextInt(100);
		}
		return mass;
	}

	public static void max(int[] mass) {
		int max = 0;
		for (int i = 0; i < mass.length; i++) {
			if (mass[i] > max)
				max = mass[i];
		}
		System.out.println("Max number: " + max);
	}

	public static void min(int[] mas) {
		int min = mas[0];
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < min)
				min = mas[i];
		}
		System.out.println("min number: " + min);
	}
}

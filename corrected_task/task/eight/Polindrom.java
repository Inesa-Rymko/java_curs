package task.eight;

public class Polindrom {

	public static void main(String[] args) {
		palindromSrt();
	}

	public static void palindromSrt() {
		int n = 50;
		for (int i = 10; i < n && n <= 100; i++) {
			if (palindrom(i))
				System.out.println("Палиндром  " + i);
		}
	}

	public static boolean palindrom(int i) {
		String a = String.valueOf(i);
		StringBuilder b = new StringBuilder(a);
		StringBuilder m = b.reverse();
		boolean d = a.equals(m.toString());
		return d;
	}
}

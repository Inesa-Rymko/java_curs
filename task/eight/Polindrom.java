package task.eight;

public class Polindrom {
	
	 public static void main(String[] args) {
        int n = 50;
            for (int i = 0; i < n && n <= 100; i++) {
                 if (Palindrom(i))
                   System.out.println("Палиндром  " + i );
            }
     }

     public static boolean Palindrom(int i) {
             String a = String.valueOf(i);
             StringBuffer b = new StringBuffer(a);
             StringBuffer m = b.reverse();
             boolean d = a.equals(m.toString());
             return d;
     }
}

	    




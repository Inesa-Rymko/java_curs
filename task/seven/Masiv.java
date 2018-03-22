package task.seven;

public class Masiv {
	
	public static void main(String[] args) {        
		int[] mas = new int[10];
		for (int i = 0; i < mas.length; i++) {
		    mas[i] = (int) Math.round((Math.random() * 89) + 10);
		    System.out.println(mas[i]);	
		}	
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int i = 0; i < mas.length; i++) {
            mas[i] = mas[i];
        }           
        for(int i = 0; i < mas.length; i++) {
            if(mas[i] > max) 
                max = mas[i];
            if(mas[i] < min) 
                min = mas[i];
        }
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);     
    }    
}


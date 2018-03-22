package task.one;
import java.util.Scanner;

public class number {
	public static void main(String[] args)
	{
		int temp;
		boolean isPrime=true;
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter some number: ");	        
	        if (sc.hasNextInt()) {
	        	int number = sc.nextInt();
		if (number % 2 == 0)
			System.out.println("число чётное ");
		else
			System.out.println("число нечетное ");
		
		for (int i=2; i<=number/2; i++) {
	           temp = number % i;
		   if (temp == 0) {
		      isPrime = false;
		      break;
		   }
		}
		// если переменная isPrime равна true, то число простое
		if(isPrime) {
		   System.out.println(number + " - простое число");
		} else {
		   System.out.println(number + " - составное число");
	        }
	        
		/*for(int i=2; i>=number; i++){
            if(number%i==0 & i!=1){
                System.out.println("Заданное число - составное");
                break;
                }
            else {
                System.out.println("Это число простое");
            break;}	
		}*/
		}
	    else {
	        System.out.println("число не целое ");
	        }				
	}
}

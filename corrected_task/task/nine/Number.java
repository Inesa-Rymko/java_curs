package task.nine;

import java.util.Scanner;

public class Number {
	
	public static void main(String[] args)
	{
		
		int num = scanner(); 
	    chet(num);
	    summa(num);		
		}
	
	public static int scanner(){
		Scanner value = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = value.nextInt();		
		return num;
	}	
	
	   public static void summa(int n) {
		int i = 1;
		int sum =0;
		    for( int j = 2; j < n; j=j+2){
		    	  sum = sum + j;
		    }
		    System.out.println("sum  " + sum);	}   		
	
		public static void chet(int n){  
			int i = 0;
		    while (i < n) {
		    	if (i%2 == 0)
			    System.out.print(i + " ");
			    i++;    
			}		    
 		}
	}

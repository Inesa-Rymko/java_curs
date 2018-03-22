package task.nine;

import java.util.Scanner;

public class Number {
	
	public static void main(String[] args)
	{
		Scanner value = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = value.nextInt();		
		int i = 1;
		int sum =0;
		    for( int j = 2; j < n; j=j+2){
		    	  sum = sum + j ;
		    }
		    System.out.println("sum  " + sum);	   		
		    while (i < n) {
		    	if (i%2 == 0)
			    System.out.print(i + " ");
			    i++;    
			}
}}
	

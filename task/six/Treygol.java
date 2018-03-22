package task.six;
import java.util.Scanner;

public class Treygol {
	public static void main(String[] args)
	{
		Scanner one = new Scanner(System.in);
		System.out.println("Enter some number 1: ");
		Scanner two = new Scanner(System.in);
		System.out.println("Enter some number 2: ");
		Scanner three = new Scanner(System.in);
        System.out.println("Enter some number 3: ");
        int a = one.nextInt();
    	int b = two.nextInt();
    	int c = three.nextInt();
        if  ((a < b + c) && (b < a+c) && (c < a+b))
        	   System.out.println("треуголтник существует ");
    		else
    			System.out.println("треугольник не существует ");
        	
        	
        }
	}



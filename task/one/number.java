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
			System.out.println("����� ������ ");
		else
			System.out.println("����� �������� ");
		
		for (int i=2; i<=number/2; i++) {
	           temp = number % i;
		   if (temp == 0) {
		      isPrime = false;
		      break;
		   }
		}
		// ���� ���������� isPrime ����� true, �� ����� �������
		if(isPrime) {
		   System.out.println(number + " - ������� �����");
		} else {
		   System.out.println(number + " - ��������� �����");
	        }
	        
		/*for(int i=2; i>=number; i++){
            if(number%i==0 & i!=1){
                System.out.println("�������� ����� - ���������");
                break;
                }
            else {
                System.out.println("��� ����� �������");
            break;}	
		}*/
		}
	    else {
	        System.out.println("����� �� ����� ");
	        }				
	}
}

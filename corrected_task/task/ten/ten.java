package task.ten;

import java.util.Arrays;

public class ten {
	
		static void Permutation(int[] arr) {
		    for (int i = 0; i < arr.length; i++) {
		      for (int j = 0; j < arr.length - 1; j++) {
		        System.out.println(Arrays.toString(arr));
		        int tmp = arr[j];
		        arr[j] = arr[j+1];
		        arr[j+1] = tmp;
		      }
		    }
		  }
		 
		  public static void main(String[] args) {
		    int[] first = { 1, 2, 3 };
		    Permutation(first);		 
		}	
	}


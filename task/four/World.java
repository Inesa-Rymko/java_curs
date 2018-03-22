package task.four;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import task.three.Palindrome;
import java.util.Arrays;
public class World {
	public static void main(String[] args)
	{
		
      String value = "мама купила Оле игрушку,а про Катю забыла";
      String str = value.replaceAll("\\s*,\\s*", " ");
      System.out.println(str);
      String separator = " ";
      String strArray[] = str.split(separator);
      int count = 0;
        if(str.length() != 0){
            count++;
               for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == ' '){
                    count++;                           
            }  
          }
            System.out.println("count world " + count);    
            Arrays.sort(strArray);
            for(int j = 0; j <  strArray.length; j++) {
            	System.out.print(strArray[j] + "  ");
            }         
        }
      }
	}

        
		
		



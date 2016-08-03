package practice;

import java.util.Random;

public class practice2 {

	public static void main(String[] args) {
		 int numbers[] = new int[10];
         Random rand = new Random();
         int smallest = 0;
         
        
         for(int i=1; i< numbers.length; i++)
         {
        	 numbers[i] = rand.nextInt();
                 if(numbers[i] < smallest)
                         smallest = numbers[i];
                
         }
        
         System.out.println("Smallest Number is : " + smallest);
 }
	
	}



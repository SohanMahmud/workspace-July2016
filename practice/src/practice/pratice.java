package practice;

import java.util.Random;

public class pratice {

	public static void main(String[] args) {
			
		int [] array = new int [10];
        Random rand = new Random();
        int num = 0;
        
        for (int i =0; i < array.length; i++) {
        	if (i % 2 != 0){
        	
        	array[i] = rand.nextInt();
         
        System.out.println(array [i]);}
}
}
}
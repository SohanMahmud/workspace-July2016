package myJavaApp;

import java.util.Scanner;

public class ListNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Scanner sc2 = new Scanner (System.in);
		Scanner sc3 = new Scanner (System.in);
		
		System.out.println("Enter an integer number to start with");				
		int num1 = sc.nextInt();
		
		System.out.println("Then enter an integer for the max limit which will be the number you count up to");
		int num2 = sc2.nextInt();
		
		System.out.println("Finally enter an integer for how much you want to count up by, like a rate i.e count up by 5's or 10's");
		int num3 = sc3.nextInt();
		System.out.println("You have chosen to start with the number: " 
				+ num1 + "\nYou have chosen to count up to: " 
							+ num2 + "\nYou want to count up by: " 
				+ num3 
				+ "\nYour desired list: ");
		
		for(int i = num1; i<= num2; i = i + num3){
			System.out.println(i);
		
		
			}
	}

}

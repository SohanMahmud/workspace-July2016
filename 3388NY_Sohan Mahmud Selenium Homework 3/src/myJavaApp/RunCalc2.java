package myJavaApp;

import java.util.Scanner;

public class RunCalc2 {

	public static void main(String[] args) {

		Scanner num = new Scanner (System.in);
		Calculator2 value2 = new Calculator2();
		String count;
while (1==1) {
	System.out.println("Enter from 2 upto 5 integers to add, Start by typing in the number of integers you will use: 2,3,4, or 5");
	count = num.next();
	
	if (count.equals("2")) {
		System.out.println("Enter two integers");
		int total1 = value2.Calculate(num.nextInt(), num.nextInt());
		System.out.println("Your total is: " +total1);break;}
	
	else if (count.equals("3")) { 
		System.out.println("Enter three integers");
		int total2 = value2.Calculate(num.nextInt(), num.nextInt(), num.nextInt());
		System.out.println("Your total is: " +total2);break;}
		
	else if (count.equals("4")){
		System.out.println("Enter four integers");
		int total3 = value2.Calculate(num.nextInt(), num.nextInt(), num.nextInt(), num.nextInt());
		System.out.println("Your total is: "+total3);break;}
		
	else if (count.equals("5")){
		System.out.println("Enter five integers");
		int total4 = value2.Calculate(num.nextInt(), num.nextInt(), num.nextInt(), num.nextInt(), num.nextInt());
		System.out.println("Your total is: "+total4);break;}
	else {System.out.println("That is not a valid input try again");}	
	}
	}
	}



package myJavaApp;

import java.util.Scanner;

public class PrintMsg {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Print your custom message as many times as you want!");
		System.out.println("\nEnter your message below: ");
		String message = sc.nextLine();
		System.out.println("Now enter an integer for how many times you want your message to print \n(It will always print at least once even if you enter 0)");
		int num1 = sc.nextInt();
		int num2 = 0;
		System.out.println("Your message: \n");
		do{
			System.out.println(message);
			num2++;
	} while (num1>num2); 
	}

}

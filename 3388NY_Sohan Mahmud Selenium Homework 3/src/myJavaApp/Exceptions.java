package myJavaApp;

import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("type in any integer, by default it is set to be divided by 0 watch what happens when you try it!");
		int number =sc.nextInt();
		try {
		int result = number/0;
		System.out.println(result);
		
			}
		catch(Exception ex){
		System.out.println("You cannot divide a number by zero <----error message by system");
		}
	}
	}



package myJavaApp;

import java.util.Scanner;

public class RunFinal {

	public static void main(String[] args) {
		
		FinalVariable unchangeable = new FinalVariable();
		FinalVariable changeable = new FinalVariable();
		System.out.println("When you set a variable as final it's value will always stay the same");
		Scanner sc = new Scanner (System.in);
		System.out.println(unchangeable.num1 + " is a number I set to a final variable called num1, \nthe system will not let me change the value of it ");
		System.out.println(changeable.num2+ " is a number I set to a regular variable called num2, \nthe system will let you change the value of it");
		System.out.println("Enter a number that you wish to change the int variable num2 into");
		changeable.num2 = sc.nextInt();
		System.out.println("You changed the value of num2 into:  " + changeable.num2);
		System.out.println("That concludes the Final Variable training module, Congrats");
	}

}

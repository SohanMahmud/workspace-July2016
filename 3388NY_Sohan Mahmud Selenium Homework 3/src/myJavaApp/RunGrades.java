package myJavaApp;

import java.util.Scanner;


public class RunGrades {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Grades Range = new Grades();
		System.out.println("Enter the range your grade falls within, you can choose from \n91-100\n81-90\n71-80\n61-70\n51-60\n41-50\n0-40\n\nEnter your grade range: ");
		String rangeGiven = sc.nextLine();
		String letter = Range.getGradeRange(rangeGiven);
		System.out.println("You recieved an " + letter);
	}
	}



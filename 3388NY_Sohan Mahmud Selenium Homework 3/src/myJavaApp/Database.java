package myJavaApp;

import java.util.Scanner;


public class Database extends Student{
 public static void main (String [] args){
	
	Scanner sc = new Scanner (System.in);
	Student st1 = new Student();
	int studentID;
	String studentName;
	String ssn;
	String dob;
	
	
	System.out.println("Enter your Student ID Number");
	studentID = sc.nextInt();
	st1.setStudentId(studentID);
	
	
	System.out.println("Enter your first name");
	studentName = sc.next();
	st1.setStudentName(studentName);

	System.out.println("Enter your social security number");
	ssn = sc.next();
	st1.setSsn(ssn);
	
	System.out.println("Enter your date of birth mm/dd/yyyy");
	dob = sc.next();
	st1.setDob(dob);
	
	
	System.out.println("The information you entered was: " +st1.getStudentId()+" "+ st1.getStudentName()+" "+st1.getSsn()+" "+ st1.getDob());
	
	
}
}
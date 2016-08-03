package myJavaApp;

import java.util.Scanner;

public class ConcreteClass extends Student implements MenuInterface{
	
	Scanner sc2 = new Scanner (System.in);
	boolean u = true;
	
//from Fortune Teller interface	

	public void MenuSelect() {
		
while (u == true) {	
		
		System.out.println("Welcome to my Java App!\nSelect an option from the main menu:\nfortune teller, calculator, database, calculator-2,\nexample exception, number counter, message printer, \nfinal variable, grade converter, special message"); 
	
		String access = sc2.nextLine().toLowerCase();
		
		if (access.equals("fortune teller")){System.out.println("Accessing fortune teller");break;}
		else if (access.equals("calculator")){System.out.println("Accessing calculator");RunCalc.main(null);}
		else if (access.equals("database")){System.out.println("Accessing database");Database.main(null);}
		else if (access.equals("calculator-2")){System.out.println("Accessing a crazy calculator that likes to subtract by 2 everytime");RunCalc2.main(null);}
		else if (access.equals("example exception")){System.out.println("Accessing an example of exception handling ");Exceptions.main(null);}
		else if (access.equals("number counter")){System.out.println("Accessing number counter ");ListNumbers.main(null);}
		else if (access.equals("message printer")){System.out.println("Accessing message printer ");PrintMsg.main(null);}
		else if (access.equals("final variable")){System.out.println("Accessing final variable training module ");RunFinal.main(null);}
		else if (access.equals("grade converter")){System.out.println("Accessing grade converter ");RunGrades.main(null);}
		else if (access.equals("special message")){System.out.println("Accessing special message from Sohan ");RunSpecialMessage.main(null);}
		else {System.out.println("Incorrect choice, returning to main menu");}

}


		 }
}

 
	




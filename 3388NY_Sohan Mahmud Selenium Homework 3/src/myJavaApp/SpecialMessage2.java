package myJavaApp;

public class SpecialMessage2 extends SpecialMessage {

	int MenuItems = super.MenuItems = 10;

	public SpecialMessage2 (String Message){
		super(Message);
	}
	public void hopeYouEnjoy(){
		super.workHard();
		System.out.println("I hope you enjoy my app");
		
	}
}

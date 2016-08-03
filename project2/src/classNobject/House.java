package classNobject;

public class House {
	
	int address ;
	String housename ;
	String name ;
	
	public void createBedRoom() {
			System.out.println("bed room is for sleep only");
	}
	public void createKitchen() {
			System.out.println("kitchen is for cooking only");
	}
	
	public void watchgameofthrones() {
			System.out.println("game of thrones is a great show");
	}
	
	public int addTwoNumber(int num1, int num2) {
		int total = num1 + num2;
		
		return total;
	}
	
}

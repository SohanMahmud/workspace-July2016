package classNobject;

public class TestHouse {

		public static void main(String [] args) {
		
		
		House whiteHouse = new House();
		whiteHouse.createBedRoom();
		whiteHouse.address = 32;
		System.out.println("Address :" + whiteHouse.address);
		whiteHouse.housename = "President's house";
		System.out.println("The name of the white house is : " + whiteHouse.housename);
		
		Office office = new Office();
		office.myOfficeSpace();
		
		House kitchen =  new House();
		kitchen.createKitchen();
		
		House watch = new House();
		watch.watchgameofthrones();
	
		int result = whiteHouse.addTwoNumber(10, 20);
			System.out.println(result);
		
		}
	
}

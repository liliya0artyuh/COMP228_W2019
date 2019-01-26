package week3material;

public class Driver {
	public static void main(String[] args) {
		
		System.out.println(Door.COMPANY);
		
		Door door = new Door("wood", "Blue");
	
		Door.setNumOfLocks(1);
		
		System.out.println(door.toString());
		
		
		Door door1 = new Door("wood", "Blue");
		Door door2 = new Door("plastic", "Red");
		Door.isSecure = true;
		
		
		System.out.println(door1.toString());
		System.out.println(door2.toString());

		
		concatenateStringAndInt();
	}
	
	public static void concatenateStringAndInt() {
		System.out.println("gjhghgh " + 2);
	}
}

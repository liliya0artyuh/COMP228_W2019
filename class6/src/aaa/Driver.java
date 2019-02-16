package aaa;

public class Driver {
	public static void main(String[] args) {
	
		Dog dog = new Dog();
		dog.setLegs(5);
		dog.setType("lab");
		
		MovementService ms = new MovementService();
		ms.makeItMove(dog);
		
		
	}
	
}
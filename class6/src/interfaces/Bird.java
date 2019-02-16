package interfaces;

public class Bird extends Animal implements Flyable {

	private int legs;
	private String wings;
	

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public String getWings() {
		return wings;
	}

	public void setWings(String wings) {
		this.wings = wings;
	}
	
	@Override
	public void move(){
		moveBird();
	}
	

	@Override
	public String toString() {
		return "Bird " + super.toString() + " , wings=" + wings;
	}

	@Override
	public void fly() {
		moveBird();
	}

	private void moveBird() {
		//extracting common logic to one method. 
		System.out.println(type + " is flying in the sky.");
	}

}

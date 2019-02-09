package bbb;

public class Bird extends Animal {

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
		System.out.println(super.getType() + " is flying.");
	}
	

	@Override
	public String toString() {
		return "Bird " + super.toString() + " , wings=" + wings;
	}

}

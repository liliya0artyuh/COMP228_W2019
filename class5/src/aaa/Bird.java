package aaa;

public class Bird extends Animal {
	private int legs;
	private int wings;

	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public int getWings() {
		return wings;
	}
	public void setWings(int wings) {
		this.wings = wings;
	}
	
	
	@Override
	public String toString() {
		return "Bird [legs=" + legs + ", wings=" + wings + " "+ super.toString() + "]";
	}

	
}

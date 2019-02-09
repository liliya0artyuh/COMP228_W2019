package aaa;

public class Dog extends Animal {
	private int legs;

	public Dog(String color) {
		super(color);
	}


	public Dog() {
		super();
	}


	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}


	@Override
	public String toString() {
		return "Dog [legs=" + legs + " " + super.toString()+ "]";
	}

	
	
}

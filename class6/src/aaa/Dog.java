package aaa;

public class Dog  {
	private int legs;
	private String type;

	public Dog(String color) {
		//super(color);
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


	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "Dog [legs=" + legs + " " + super.toString()+ "]";
	}


	public void move() {
		System.out.println(type + " is running.");
		
	}

	
	
}

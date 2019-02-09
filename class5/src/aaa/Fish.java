package aaa;

public class Fish extends Animal {
	private int fins;

	public Fish(String color) {
		super(color);
	}

	public int getFins() {
		return fins;
	}

	public void setFins(int fins) {
		this.fins = fins;
	}

	@Override
	public String toString() {
		return "Fish [fins=" + fins + " "+ super.toString()+"]";
	}

	
	
}

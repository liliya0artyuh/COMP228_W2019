package polymorphism;


public class Fish extends Animal{
	private int fins;
	
	public int getFins() {
		return fins;
	}
	public void setFins(int fins) {
		this.fins = fins;
	}
	
	@Override
	public void move(){
		System.out.println(type + " is swimming.");
	}
	
	@Override
	public String toString() {
		return "Fish   "+ super.toString() + ", fins=" + fins;
	}


}

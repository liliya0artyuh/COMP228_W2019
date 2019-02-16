package abstract_things;


public class Dog extends Animal{

	private int legs;

	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	@Override
	public void move(){
		System.out.println(super.getType() + " is running.");
	}
	
	@Override
	public String toString() {
		
		return "Dog " + super.toString() + ", legs=" + legs;
	}
	
	
	
}

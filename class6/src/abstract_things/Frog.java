package abstract_things;

public class Frog extends Animal {

	@Override
	public void move() {
		System.out.println(super.getType() + " is jumping.");	
	}

}

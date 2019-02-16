package polymorphism;

import java.util.List;

public class MovementService {

	public void makeItMove(List<Animal> animals) {
		for(Animal a : animals) {
			a.move();
			if(a instanceof Fish) {
				System.out.println(((Fish)a).getFins());
			}
		}
		
	}
}

package interfaces;

import java.util.List;

public abstract class MovementService {

	public static void makeItMove(List<Animal> animals) {
		for(Animal a : animals) {
			a.move();
			if(a instanceof Fish) {
				System.out.println(((Fish)a).getFins());
			}
		}
		
	}
	
	public static void makeItFly(List<Flyable> flyableObjects) {
		for(Flyable f : flyableObjects) {
			f.fly();
		}
		
	}
}

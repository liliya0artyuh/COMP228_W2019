package abstract_things;

import java.util.ArrayList;
import java.util.List;

public class Driver {
	public static void main(String[] args) {
	
//		Animal animal = new Animal();
//		animal.setType("general");
		
		Animal.runStaticMethod();
		
		List<Animal> animals = new ArrayList<>();
			
		Dog dog = new Dog();
		dog.setLegs(5);
		dog.setType("lab");
		
		animals.add(dog);
		
		dog.setType("sheppard");
		System.out.println(dog.getType());
		System.out.println(animals.get(0).getType());
		
		Fish fish = new Fish();
		fish.setType("shark");
		animals.add(fish);
		fish.setFins(7);
		System.out.println(animals.get(0).getType());
		System.out.println(animals.get(1).getType());
		//System.out.println(animals.get(2).getType());
		
		Bird bird = new Bird();
		bird.setType("eagle");
		animals.add(bird);
		
		MovementService.makeItMove(animals);
		
	}
	
}
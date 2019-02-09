package bbb;

public class Driver {

	public static void main(String[] args) {
		Fish fish = new Fish();
		fish.setType("shark");
		fish.eyes="brown";
		//fish.setEyes("blue");
		fish.setFins(5);
		fish.setColor("gold");
//		fish.swim();
		fish.move();
		System.out.println(fish.toString());
		
		Dog dog = new Dog();
		dog.setType("lab");
		dog.setEyes("brown");
		dog.setLegs(4);
		dog.setColor("brown");
//		dog.run();
//		dog.sleep();
		dog.move();
		System.out.println(dog.toString());
		
		Bird bird = new Bird();
		bird.setType("dove");
		bird.setEyes("brown");
		bird.setLegs(2);
		bird.setColor("yellow");
		bird.setWings("large");
		bird.move();
//		bird.eat();
//		bird.sleep();
		System.out.println(bird.toString());
		
		String type = bird.getType();
	//	System.out.println(type);
		
	//	System.out.println(bird.getType());
		
		System.out.println(bird.toString());
	
	}
}

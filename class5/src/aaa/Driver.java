package aaa;

public class Driver {

	public static void main(String[] args) {

		Bird bird = new Bird();
		bird.setColor("yellow");
		Dog dog = new Dog("brown");
		Fish fish = new Fish("red");
		
		System.out.println(bird);
		System.out.println(dog);
		System.out.println(fish);

	}

}

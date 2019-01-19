package read_input;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		String name;
		int age;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please provide name: ");
		
		name = scanner.nextLine();
		
		System.out.println("Please provide your age: ");
		
		age = scanner.nextInt();
		
		//age = Integer.parseInt(scanner.nextLine());
		
		
		//String ageString = scanner.nextLine();
		//age = Integer.parseInt(ageString);
		
		System.out.printf("Your name is: %s. You  are %d years old.", name, age);
				
	}

}

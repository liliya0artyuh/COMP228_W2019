package numbers;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		double num1 = 1, num2 = 5;
		double sum;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please provide first number: ");
		
		num1 = scanner.nextInt();
		
		System.out.println("Please provide second number: ");
		
		num2 = scanner.nextInt();
		
		sum = num1/num2;
		
		System.out.println("sum equals: " + sum);

	}

}

package week3material;

import java.security.SecureRandom;

public class DriverRandom {

	public static void main(String[] args) {
		SecureRandom randomNumbers = new SecureRandom();

		int randomValue = randomNumbers.nextInt(10);
		System.out.println(randomValue);
		//statement returns 0 or 1.

		//int randomValue = randomNumbers.nextInt(scalingFactor);

	}

}

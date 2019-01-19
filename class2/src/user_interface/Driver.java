package user_interface;

import javax.swing.JOptionPane;

public class Driver {

	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog("What is your name?");

		String age = JOptionPane.showInputDialog("What is your age?");
		int ageInt = Integer.parseInt(age);
		
		String message =
				String.format("Welcome, %s, to Java Programming!%n Your age is: %d", name, ageInt);

		JOptionPane.showMessageDialog(null, message);
	}

}

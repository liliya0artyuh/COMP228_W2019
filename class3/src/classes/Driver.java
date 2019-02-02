package classes;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Driver {

	public static void main(String[] args) {

		House house = new House();
		
		house.setColor("Green");
		System.out.println(house.getNumOfKeys());
		System.out.println(house.getColor());
		System.out.println(house.toString());
		
		house.setColor("Red");
		System.out.println(house.getColor());

		
		
		House house2 = new House();
		House house3 = new House();
		House house4 = new House();
		
		//Scanner input  = new Scanner(System.in);
		String response = JOptionPane.showInputDialog("Would you like to provide data for houses. Y-yes, N-no?");
		//if()
		
		String color2 = JOptionPane.showInputDialog("Please provide color of house 2?");
		String color3 = JOptionPane.showInputDialog("Please provide color of house 3?");
		String color4 = JOptionPane.showInputDialog("Please provide color of house 4?");
		
		house2.setColor(color2);
		house3.setColor(color3);
		house4.setColor(color4);

		System.out.println("house2.getColor() " + house2.getColor());
		System.out.println("house3.getColor() " +house3.getColor());
		System.out.println("house4.getColor() " +house4.getColor());
		System.out.println("house2.getColor() " + house2.getColor());
		
		
		
		Door door;
		String color = JOptionPane.showInputDialog("Please provide color of the door?");
		String material = JOptionPane.showInputDialog("Please provide material of the door?");

		door = new Door(material, color);
		System.out.println("door material " + door.getMaterial());
		System.out.println("door color " + door.getColor());
		System.out.println("door is " + door.toString());

		System.out.println("door information is\n " + door.getInformation());
	}

}

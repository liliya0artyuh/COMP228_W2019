package methods;

import javax.swing.JOptionPane;

public class Driver {

	public static void main(String[] args) {

		
		sayHello(JOptionPane.showInputDialog("Please provide name"));
	}
	
	
	public static void sayHello(String name) {
		sayHello();
		System.out.println(name);
		//JOptionPane.showMessageDialog(null, name);
	}
	
	public static void sayHello() {

		System.out.print("Hello  ");

	}
}

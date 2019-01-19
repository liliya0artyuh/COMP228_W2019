package decisions;

public class Driver {

	public static void main(String[] args) {

		int numb1 = 5;
		int numb2 = 6;

		if (numb1 == numb2) {
			System.out.println("Numbers are equal.");
		} else {
			System.out.println("Numbers are NOT equal.");

		}

		String name = null;

		if ("Bill".equalsIgnoreCase(name)) {
			System.out.println("Names are equal");
		} else {
			System.out.println("Names are NOT equal.");

		}

		if (null == name) {
			sayHello();
		} else {
			sayHello(name);
		}
	}

	public static void sayHello(String name) {
		System.out.println("Hello " + name);
	}

	public static void sayHello() {
		System.out.print("Hello  ");

	}
}

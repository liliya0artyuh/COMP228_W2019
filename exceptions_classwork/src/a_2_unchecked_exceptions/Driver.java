package a_2_unchecked_exceptions;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		causeExceptionAndHandleIt();

		causeExceptionWithThrows();

		causeException();

		causeExceptionAndHandleIt();// the above unhandled exception terminates program

	}

	public static void causeException() {
		ArrayList<String> textList = new ArrayList<String>();
		textList.add("qqqqq");
		System.out.println(textList.get(0));
		System.out.println(textList.get(1));
	}

	public static void causeExceptionAndHandleIt() {
		try {
			ArrayList<String> textList = new ArrayList<String>();
			textList.add("aaaaa");
			System.out.println(textList.get(0));
			System.out.println(textList.get(1));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void causeExceptionWithThrows() throws IndexOutOfBoundsException {
		ArrayList<String> textList = new ArrayList<String>();
		textList.add("qqqqq");
		System.out.println(textList.get(0));
		System.out.println(textList.get(1));
	}

}

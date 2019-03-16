package finally_block;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Driver {
	static Path path = Paths
			.get("F:\\2018\\git_code\\COMP228_003_W2018\\exceptions_classwork\\src\\checked_exceptions\\output.txt");

	public static void main(String[] args) {

		// showExampleOfTryAndFinally();
		showExampleOfTryCatchAndFinally();
		showExampleOfGoodPurposeOfFinallyBlock();
		showExampleOfTryAndFinallyWithoutHandingException();
	}

	public static void showExampleOfTryAndFinally() {
		try {
			ArrayList<String> textList = null;
			System.out.println(textList.get(0));
			textList = new ArrayList<String>();
			textList.add("hjhj");
			System.out.println(textList.get(0));
			// System.out.println(textList.get(1));
		} finally {
			System.out.println("This will be executed if there is exception or not.");
		}
	}

	public static void showExampleOfTryAndFinallyWithoutHandingException() {
		// try to run this code with exception occurring and with no exception occurring
		// - finally should execute always
		try {
			ArrayList<String> textList = null;
			System.out.println(textList.get(0));// attempt to retrieve value before object is initialized -
												// NullPointerException

			textList = new ArrayList<String>();
			textList.add("hjhj");// store only one value
			System.out.println(textList.get(0));// retrieve first value
			// System.out.println(textList.get(1));//attempt to retrieve second value which
			// does not exist - IndexOutOfBoundException
		} finally {
			System.out.println("\nThis line is from FINALLY block.");
		}

		System.out.println(
				"This line is after all catch and finally blocks does NOT execute because exception was not caught.");
		// System.out.println(textList.get(0));
	}

	public static void showExampleOfTryCatchAndFinally() {
		// try to run this code with exception occurring and with no exception occurring
		// - finally should execute always
		try {
			ArrayList<String> textList = null;
			System.out.println(textList.get(0));// attempt to retrieve value before object is initialized -
												// NullPointerException

			textList = new ArrayList<String>();
			textList.add("hjhj");// store only one value
			System.out.println(textList.get(0));// retrieve first value
			// System.out.println(textList.get(1));//attempt to retrieve second value which
			// does not exist - IndexOutOfBoundException
		} catch (NullPointerException e2) {
			System.err.println(e2 + " I guess I did not initialize my variable.");
		} catch (IndexOutOfBoundsException e1) {
			// System.out.println(textList.get(0));
			System.err.println(e1 + " processign index_out_of_bound in a specific way.");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("\nThis line is from FINALLY block.");
		}

		System.out.println("This line is after all catch and finally blocks executes because exception was caught.");
		// System.out.println(textList.get(0));
	}

	public static void showExampleOfGoodPurposeOfFinallyBlock() {
		// example for catch or declare - catch example
		BufferedWriter writer = null;
		try {
			System.out.println("before writing to a file ");
			writer = Files.newBufferedWriter(path);
			writer.write("Hello World!!!");
			System.out.println("after writing to a file");
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

package a_1_checked_exceptions;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Driver {
	// Get the file reference
	static Path path = Paths
			.get("F:\\2018\\git_code\\COMP228_003_W2018\\exceptions_classwork\\src\\checked_exceptions\\output.txt");

	public static void main(String[] args) {

		writeToAFileAndCatchException();

		try {
			writeToAFileWithThrows();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void writeToAFileAndCatchException() {
		//example for catch or declare - catch example
		BufferedWriter writer;
		try {
			System.out.println("ss");
			writer = Files.newBufferedWriter(path);
			writer.write("Hello World!!!");
			System.out.println("ss");
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void writeToAFileWithThrows() throws IOException {
		//example for catch or declare - declare example
		BufferedWriter writer;
		System.out.println("ss");
		writer = Files.newBufferedWriter(path);
		writer.write("Hello Worldhjhjjh !!!");
		System.out.println("ss");
		writer.flush();
	}


}

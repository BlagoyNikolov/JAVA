package lesson13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExceptionDemoFile {
	static String writeToFile(String path) throws FileNotFoundException {
		File f = new File(path);

		try (PrintWriter pw = new PrintWriter(f)) {
			System.out.println("Try block");
			throw new Exception();
			// return "Try";
		} catch (Exception e) {
			System.out.println("Catch block");
			return "Catch";
		} finally {
			System.out.println("Finally block");
			// return "Finally";
		}
	}
}

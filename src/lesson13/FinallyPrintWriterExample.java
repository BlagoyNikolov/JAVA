package lesson13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FinallyPrintWriterExample {
	static void writeToFile(String path) throws FileNotFoundException {
		PrintWriter pw = null;
		try {
			File f = new File(path);

			pw = new PrintWriter(f);
			pw.write("Some text");
			// ... some logic which could throw exception
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		writeToFile("D:\\test10.txt");
	}
}

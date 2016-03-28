package lesson12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {
	static void readFile(String pathToFile) throws FileNotFoundException {
		File file = new File(pathToFile);
		Scanner sc = new Scanner(file);

		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println(line);
		}
	}

	public static void main(String[] args) throws IOException {
		String path = "D:\\testddddddddddddddddddd.txt";
		try {
			FileReader.readFile(path);
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			System.out.println(e.getMessage());
			// if needed write the stacktrace tot the log:
			// e.printStackTrace();
		}

	}
}

package lesson13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
	static void readFile(String pathToFile) throws Exception{
		File file = new File(pathToFile);
		Scanner sc;
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			throw new Exception("file not found", e);
		}
		
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println(line);
		}
	}
	
	public static void main(String[] args) throws Exception {
		String path = "D:\\testddddddddddddddddddd.txt";
		FileReader.readFile(path);
		 
		
	}
}

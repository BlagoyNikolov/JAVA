package lesson21;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String args[]) {

		File iotest = new File("D:\\javaTest\\iotest");

		if (!iotest.exists()) {
			System.out.println("creating directory: " + "D:\\javaTest\\iotest");
			iotest.mkdirs();
		}

		try {
			File file = new File(iotest, "test.txt");

			if (file.createNewFile()) {
				System.out.println("File is created!");
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("error" + e.getMessage());
		}
		
		File files[] = iotest.listFiles();

		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i].getName());
		}
		
		for (int i = 0; i < files.length; i++) {
			if (files[i].isFile() && files[i].getName().startsWith("t")) {
				files[i].delete();
			}
		}
	}
}

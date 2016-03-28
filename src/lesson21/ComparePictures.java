package lesson21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ComparePictures {
	public static void main(String args[]) throws IOException {
		int b1 = 0;
		int b2 = 0;
		FileInputStream input1 = null;
		FileInputStream input2 = null;
		
		File picture = new File("D:\\pictures");

		File pic1 = new File(picture, "1.jpg");
		File pic2 = new File(picture, "2.jpg");
		try{
			try {
				input1 = new FileInputStream(pic1);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
	
			try {
				input2 = new FileInputStream(pic2);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			while (b1 != -1 && b2 != -1) {
				b1 = input1.read();
				b2 = input2.read();
				if (b1 != b2) {
					System.out.println("the files are different");
					return;
				} else {
					System.out.println("the files are the same");
					return;
				}
			}
		
		} catch (IOException e) {
			e.getMessage();
		} finally {
			if(input1 != null) {
				input1.close();
			}
			if(input2 != null) {
				input2.close();
			}
		}
	}
}

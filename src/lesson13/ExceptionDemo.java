package lesson13;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
			System.out.println(ExceptionDemoFile.writeToFile("D:\\test10.txt"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

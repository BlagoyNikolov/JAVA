package lesson12;

public class ExceprionExersise {
	public static void main(String[] args) {
		int array[] = new int[10];
		try {
			array[11] = 1;
			array[5] = (Integer) null;
		} catch (NullPointerException e) {
			System.out.println("exception: NullPointerException");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("exception: ArrayIndexOutOfBoundsException");
			e.printStackTrace();
		}
	}
}

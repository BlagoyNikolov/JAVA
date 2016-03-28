package lesson01;

public class VariablesExample {
	public static void main(String[] args) {
		int age;
		age = 27;

		double doubleNumber = 3.14;
		float test = 10f;

		boolean isMonday = false;

		char ch = '$';
		System.out.println(ch + " " + ch + 5 + 5);

		System.out.println("My age is: " + age);

		age = 18;
		isMonday = true;
		System.out.println("My age is " + age + ". Is monday today?" + isMonday);
		long numberLong = 753014L;
		double numberDouble = 22.7;
		float numberFloat = 5;
		byte numberByte = 5;
		char character = 'Z';
		System.out.println(numberLong + " " + numberByte + " " + character + " " + isMonday + " " + age +" " + numberFloat + " "+ numberLong);
		double sum = (numberByte + numberFloat + numberDouble);
		System.out.println(sum);
		
		int A = 14;
		int B = 3;
		double sumAB = A%B;
		System.out.println(sumAB);
	}
}

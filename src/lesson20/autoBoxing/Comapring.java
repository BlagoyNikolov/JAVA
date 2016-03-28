package lesson20.autoBoxing;

public class Comapring {
	public static void main(String[] args) {
		String s1 = "hi";
		String s2 = "hi";

		System.out.println("Equals? " + (s1 == s2)); // Smart a.. Compiler

		int i = 5;
		Integer refI = new Integer(5);

		System.out.println("equal integers? " + (i == refI)); // FALSE!!! Smart
																// compiler

		// How to compare prims and ref typers:
		System.out.println(refI.equals(i));
	}
}

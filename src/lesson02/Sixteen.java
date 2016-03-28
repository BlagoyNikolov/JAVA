package lesson02;

public class Sixteen {
	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		while (i <= 4) {
			System.out.print(i);
			j=4;
			while (j < 16){
				System.out.print( " " + (i + j));
				j = j + 4;
			}
			System.out.println();
			i++;
		}
	}
}


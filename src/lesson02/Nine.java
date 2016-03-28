package lesson02;

public class Nine {
	public static void main(String[] args) {
		int i = 1;
		while (i<10) {
			if (i%3==0){
				System.out.println(i);
			} else {
				System.out.print(i);
			}
			i++;
		}
	}
}

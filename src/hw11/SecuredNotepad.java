package hw11;

import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad {
	private final String password;
	
	public SecuredNotepad(int numberOfPages) {
		super(numberOfPages);
		Scanner sc = new Scanner(System.in); 
		System.out.println("Creating security. Enter password:");
		String password = sc.nextLine();
		this.password = password;
	}
	
	@Override
	public void addText(int pageNumber, String text) {
		if (isPasswordCorrect()) {
			super.addText(pageNumber, text);
		}
	}

	@Override
	public void deleteTextAndaddText(int pageNumber, String text) {
		if (isPasswordCorrect()) {
			super.deleteTextAndaddText(pageNumber, text);
		}
	}

	@Override
	public void deleteText(int pageNumber) {
		if (isPasswordCorrect()) {
			super.deleteText(pageNumber);
		}
	}

	@Override
	public void print() {
		if (isPasswordCorrect()) {
			super.print();
		}
	}
	
	private boolean isPasswordCorrect() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password: ");
		String password = sc.nextLine();
		return this.password.equals(password);
	}
	
	private boolean isStrongPassword(String pass) {
		if (pass.length() < 5) {
			return false;
		}
		
		boolean hasNumber = false;
		boolean hasSmallLetter = false;
		boolean hasBigLetter = false;
		
		for(int i = 0; i < pass.length(); i++) {
			if(pass.charAt(i) > '0' && pass.charAt(i) < '9') {
				hasNumber = true;
			} else if (pass.charAt(i) >= 'a' && pass.charAt(i) <= 'z') {
				hasSmallLetter = true;
			} else if (pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z') {
				hasBigLetter = true;
			}
		}
		
		return hasNumber && hasSmallLetter && hasBigLetter;
	}
}

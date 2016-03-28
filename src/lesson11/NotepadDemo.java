package lesson11;

public class NotepadDemo {
	public static void main(String[] args) {
		INotepad notepad = new SecuredNotepad(10);
		notepad.addText(1, "hello");
		notepad.addText(2, "hello2");
		notepad.print();
	}
}

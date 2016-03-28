package hw11;

public class NotepadDemo {
	public static void main(String[] args) {
		Page page = new Page();
		INotepad notepad = new ElectronicSecuredNotepad(10);
		
		notepad.addText(1, "hello");
		notepad.addText(2, "hello2");
		notepad.print();
	}
}

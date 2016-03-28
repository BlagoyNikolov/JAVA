package lesson13.debug.notepadDebug;

public class Demo {
/*	This is the right output which should be printed to the console.
	
	-----------------------
	Page 1
	alabala
	Page 2
	Text on page 2
	Page 3
	Some text...
	-----------------------
	
	But the code has 3 bugs and it's not working properly.
	Debug the code and fix the program. */
	
	public static void main(String[] args) {
		INotepad np = new SimpleNotepad(3);
		np.writeOnPage(1, "alabala");
		np.writeOnPage(2, "Text on page 2");
		np.writeOnPage(3, "Some text...");
		np.printAllPages();
	}

}

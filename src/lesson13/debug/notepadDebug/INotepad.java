package lesson13.debug.notepadDebug;

public interface INotepad {
	void writeOnPage(int page, String text);
	void writeOverPage(int page, String text);
	void deletePage(int page);
	void printAllPages();
}

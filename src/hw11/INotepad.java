package hw11;

public interface INotepad {
	public void addText(int page, String text);
	public void deleteTextAndaddText(int page, String text);
	public void deleteText(int page);
	public void print();
	boolean searchWord(String word);
	void printAllPagesWithDigits();
}
package hw11;

public class Page {
 	private String title;
	private String text;
	
	public Page() {
		title = "##";
		text = "$$";
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void addText(String text) {
		this.text += text;
	}
	
	public void deleteText() {
		this.text = "";
	}
	
	public String review() {
		return title + "\n" + text;
	}
	
	public boolean searchWord(String word) {
		return text.contentEquals(word);
	}
	
	public boolean containsDigits() {
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) >= '0' && text.charAt(i) <= '9') {
				return true;
			}
		}
		return false;
	}
}

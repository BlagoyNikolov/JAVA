package lesson11;

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
}

package lesson13.debug.notepadDebug;

public class Page {
	private String text;
	private String pageTitle;
	
	public Page() {
		text = "";
	}
	
	public Page(String pageTitle) {
		this();
		this.pageTitle = pageTitle;
	}
	
	void addText(String textToAdd) {
		text = text.concat(textToAdd);
	}
	
	void deleteText() {
		text = "";
	}
	
	String viewPage(){
		return pageTitle + "\n" + text;
	}
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getPageTitle() {
		return pageTitle;
	}
	public void setPageTitle(String pageTitle) {
		this.pageTitle = pageTitle;
	}
}

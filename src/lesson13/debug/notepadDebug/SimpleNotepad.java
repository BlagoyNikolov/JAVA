package lesson13.debug.notepadDebug;


public class SimpleNotepad implements INotepad{
	private Page[] pages;
	
	public SimpleNotepad(int size) {
		if(size > 0) {
			pages = new Page[size];
			for (int i = 0; i < pages.length; i++) {
				new Page("Page " + (i + 1));
			}
		}
	}

	public void writeOverPage(int page, String text) {
		try {
			if(!isPageNumberValid(page)) {
				return;
			}
				
			pages[page - 1].deleteText();
			pages[page - 1].addText(text);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public void deletePage(int page) {
		if(!isPageNumberValid(page)) {
			return;
		}
		pages[page - 1].deleteText();
	}
	
	public void writeOnPage(int page, String text) {
		try {
			if(isPageNumberValid(page)) {
				return;
			}
			pages[page - 1].addText(text);
		} catch (Exception e) {
			e.getMessage();
		}
		
	}
	
	private boolean isPageNumberValid(int page) {
		if( page < 1 || page > pages.length) {
			System.out.println("Wrong page!!!");
			return false;
		}
		return true;
	}
	
	public void printAllPages() {
		try{
			System.out.println("-----------------------");
			for (int i = 0; i < pages.length - 1; i++) {
				Page p = pages[i];
				System.out.println(p.viewPage());
			}
			System.out.println("-----------------------");
		} catch (Exception e) {
			e.getMessage();
		}
			
		
	}
	
}

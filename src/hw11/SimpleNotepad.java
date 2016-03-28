package hw11;

import hw11.Page;

public class SimpleNotepad implements INotepad {
	private Page[] pages;
	
	public SimpleNotepad(int numberOfPages) {
		if(numberOfPages >= 0) {
			pages = new Page[numberOfPages];
			for(int i = 0; i < pages.length; i++) {
				pages[i] = new Page();
			}
		}
	}

	@Override
	public void addText(int pageNumber, String text) {
		if (isValidPageNumber(pageNumber)) {
			pages[pageNumber - 1].addText(text);
		}
	}

	@Override
	public void deleteTextAndaddText(int pageNumber, String text) {
		if (isValidPageNumber(pageNumber)) {
			pages[pageNumber - 1].setText(text);
		}
	}

	@Override
	public void deleteText(int pageNumber) {
		if (isValidPageNumber(pageNumber)) {
			pages[pageNumber - 1].deleteText();
		}
	}

	@Override
	public void print() {
		for (Page page : pages) {
			System.out.println(page.review());
		}
	}
	
	private boolean isValidPageNumber(int pageNumber) {
		return pageNumber > 0 && pageNumber <= pages.length;
	}

	@Override
	public boolean searchWord(String word) {
		for (Page page : pages) {
			if(page.searchWord(word)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		for (Page page : pages) {
			if(page.containsDigits()) {
				System.out.println(page.review());
			}
		}
	}
}

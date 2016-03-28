package lesson16.anonymous;

public class Demo {
	public static void main(String[] args) {
		Book book = new Book();

		Page page1 = new Page();
		ReadPage page2 = new ReadPage();
		ReadPage page3 = new ReadPage();

		book.addNewPage(page1);
		book.addNewPage(page2);

		book.addNewPage(new Page() {
			private boolean isRead;

			public boolean isRead() {
				return isRead;
			}
		});
	}
}

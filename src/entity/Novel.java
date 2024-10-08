package entity;

public class Novel extends Book {

	public Novel(String bookName, String authorName, String bookType, String bookCode) {
		super(bookName, authorName, bookType, bookCode);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayAllViewList() {
		System.out.println("Book Code: " + getBookCode());
		System.out.println("Book Name: " + getBookName());
		System.out.println("Book Author Name: " + getAuthorName());
	}

	@Override
	public void displayAuthorViewList() {
		System.out.println("Book Author Name: " + getAuthorName());
	}

	@Override
	public void displayBookViewList() {
		System.out.print(getBookCode() + " - ");
		System.out.println(getBookName());
	}

	

}

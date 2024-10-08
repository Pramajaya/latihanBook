package entity;

public abstract class Book {

	private String bookName;
	private String authorName;
	private String bookType;
	private String bookCode;
	public Book(String bookName, String authorName, String bookType, String bookCode) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.bookType = bookType;
		this.bookCode = bookCode;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	public String getBookCode() {
		return bookCode;
	}
	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}
	
	public abstract void displayAllViewList();
	public abstract void displayAuthorViewList();
	public abstract void displayBookViewList();

}

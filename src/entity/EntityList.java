package entity;

import java.util.ArrayList;

public class EntityList {

	private static ArrayList<Book> bookList = new ArrayList<Book>();
	
	public static void addBookList(Book book) {
		bookList.add(book);
	}
	
	public static int sizeBookList() {
		return bookList.size();
	}
	
	public static void displayAllBookList() {
		for (Book book : bookList) {
			book.displayAllViewList();
		}
	}
	
	public static void displayBookBookList() {
		for (Book book : bookList) {
			book.displayBookViewList();
		}
	}
	
	public static void displayAuthorBookList() {
		for (Book book : bookList) {
			book.displayAuthorViewList();
		}
	}
	
	public static int getIndexByNameBookList(String name) {
		for (int i = 0; i < sizeBookList(); i++) {
			if (bookList.get(i).getBookName().equals(name)) {
				return i;
			}
		}
		return 0;
	}
	
	public static void updateNameBookList(int i, String bookName) {
		if(i >= 0 && i <= sizeBookList()) {
			bookList.get(i).setBookName(bookName);;
		}
	}
	
	public static void deleteBookList(int i) {
		if(i >= 0 && i <= sizeBookList()) {
			bookList.remove(i);
		}
	}

}

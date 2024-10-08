 package entity;

public class Validation {

	public boolean validateStringLength(String string) {
		if (!(string.length() >= 4)) {
			return false;
		}
		
		return true;
	}
	
	public boolean validateEqualsBook(String string) {
		return string.equals("Comic") || string.equals("Novel") || string.equals("Textcode");
	}
	
	public boolean validateEqualsComicBook(String string) {
		return string.equals("Comic");
	}
	
	public boolean validateEqualsNovelBook(String string) {
		return string.equals("Novel");
	}
	
	public boolean validateEqualsTextbookBook(String string) {
		return string.equals("Textbook");
	}
	
	public boolean validateListSize() {
		return EntityList.sizeBookList() <= 0;
	}

}

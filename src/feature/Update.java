package feature;

import java.util.Scanner;

import entity.EntityList;

public class Update {
	
	Scanner scan = new Scanner(System.in);
	
	boolean done;
	
	String name;
	int x;
	
	String bookName;

	public Update() {
		
		if (EntityList.sizeBookList() <= 0) {
			System.out.println("No data");
		} else {
			EntityList.displayAllBookList();
			
			do {
				done = false;
				try {
					do {
						System.out.print("Input Name: ");
						name = scan.nextLine();
						x = EntityList.getIndexByNameBookList(name);
					} while (!(x >= 0 && x <= EntityList.sizeBookList()));
				} catch (Exception e) {
					done = true;
					scan.next();
				}
			} while (done);
			
			do {
				done = false;
				try {
					do {
						System.out.print("Book Name: ");
						bookName = scan.nextLine();
					} while (!(bookName.length() >= 4));
				} catch (Exception e) {
					done = true;
					scan.next();
				}
			} while (done);
			
			EntityList.updateNameBookList(x, bookName);
			System.out.println("Updated success");
		}
	
	}

}

package feature;

import java.util.Scanner;

import entity.EntityList;

public class Delete {
	
	Scanner scan = new Scanner(System.in);
	
	boolean done;
	
	String name;
	int x;

	public Delete() {
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
			
			EntityList.deleteBookList(x);
			System.out.println("Deleted success!");
		}
	}

}

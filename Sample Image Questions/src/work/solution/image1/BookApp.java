package work.solution.image1;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class BookApp {
	public static void main(String[] args) {

		String filePath = "C:\\Users\\ve00ym259\\Desktop\\YMSLI Lab Solutions\\Sample Image Questions\\src\\books.txt";
		File file = new File(filePath);

		// Creating a book store
		BookStore store1 = new BookStore();

		// loading books in the list from the file
		try {
			store1.readBooksFromFile(file);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// printing all the books present
		store1.printBooksList();

		// searching for a book in the bookstore
		boolean isFound = store1.searchBook(102);
		System.out.println(isFound);

		// selling a particular book
		try {
			store1.sellBook("A234", 100);
		} catch (NotSufficientBooksException e) {
			e.printStackTrace();
		}

		// printing all the books after selling a book
		store1.printBooksList();

		// purchasing new book for the store
		store1.purchaseBook("A234", 100);
		store1.printBooksList();

	}
}

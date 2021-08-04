package work.solution.image1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class BookStore {

	private List<Book> booksList;

	public BookStore() {
		booksList = new LinkedList<>();
	}

	public void readBooksFromFile(File file) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new FileReader(file));

		String str = "";
		while ((str = in.readLine()) != null) {
			String details[] = str.split(":");
			int id = Integer.valueOf(details[0]);
			String isbn = details[1];
			String name = details[2];
			String author = details[3];
			int noOfCopies = Integer.valueOf(details[4]);
			booksList.add(new Book(id, isbn, name, author, noOfCopies));
		}

		in.close();

	}

	public void printBooksList() {
		for (Book book : booksList) {
			System.out.println(book);
		}
	}

	public boolean searchBook(int id) {
		for (Book book : booksList) {
			if (book.getId() == id) {
				return true;
			}
		}
		return false;
	}

	public void sellBook(String isbn, int noOfCopies) throws NotSufficientBooksException {
		for (Book book : booksList) {
			if (book.getIsbn().equals(isbn)) {
				int availableCopies = book.getNoOfCopies();
				if (availableCopies < noOfCopies) {
					throw new NotSufficientBooksException();
				} else {
					book.setNoOfCopies(availableCopies - noOfCopies);
					System.out.println("Book Selled Successfully");
				}
			}
		}
	}

	public void purchaseBook(String isbn, int noOfCopies) {
		for (Book book : booksList) {
			if (book.getIsbn().equals(isbn)) {
				int availableCopies = book.getNoOfCopies();
				book.setNoOfCopies(availableCopies + noOfCopies);
				System.out.println("Book purchased successfully");
			}
		}
	}

}

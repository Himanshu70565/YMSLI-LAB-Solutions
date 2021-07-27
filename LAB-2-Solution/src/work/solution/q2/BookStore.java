package work.solution.q2;

import java.util.*;

public class BookStore {

	private final int SIZE = 10;
	private int currentSize = 0;
	private Book books[];

	public BookStore() {
		books = new Book[SIZE];
	}

	public void sell(String bookTitle, int numOfCopies) {

		boolean isBookFound = false;
		int index = 0;

		for (Book book : books) {

			if (book == null) {
				break;
			}

			if (book.getBookTitle().equals(bookTitle)) {
				// book found
				// now check the quantity of book that need to selled are available or not

				isBookFound = true;
				int availableCopies = book.getNumberOfCopies();

				if (availableCopies > numOfCopies) {
					// we have the required amount of copies
					book.setNumberOfCopies(availableCopies - numOfCopies);
					System.out.println("***Sell order placed***");
				} else if (availableCopies == numOfCopies) {
					// we have to remove the book from the booksArray
					
					// performing left shift
					while (index < currentSize) {
						books[index] = books[index + 1];
						index++;
					}

					// making last index book=null
					books[currentSize - 1] = null;
					currentSize--;
					
					System.out.println("***Sell order placed***");
				} else {
					// we don't have sufficient quantity of copies
					System.out.println("**Unsufficient number of copies available***");
				}
				break;
			}
		}

		if (isBookFound == false) {
			System.out.println("The book is not found in the books store array");
		}
		index++;
	}

	public void order(String isbn, int numOfCopies) {

		boolean isBookFound = false;

		for (Book book : books) {

			if (book == null) {
				break;
			}

			if (book.getIsbn().equals(isbn)) {
				isBookFound = true;
				int availableCopiesOfBook = book.getNumberOfCopies();
				book.setNumberOfCopies(availableCopiesOfBook + numOfCopies);
				System.out.println("***Order placed***");
				break;
			}
		}

		if (!isBookFound) {
			Scanner sc = new Scanner(System.in);

			System.out.println("****You are placing a new order****");

			System.out.println("Enter book title");
			String bookTitle = sc.next();

			System.out.println("Enter author");
			String bookAuthor = sc.next();

			if (currentSize <= SIZE) {
				books[currentSize] = new Book(bookTitle, bookAuthor, isbn, numOfCopies);
				System.out.println("***New Book Added***");
				currentSize++;
			} else {
				System.out.println("***Book store array is full***");
			}
		}

	}

	public void display() {

		if (currentSize == 0) {
			System.out.println();
			System.out.println("**** Book store is empty *****");
			System.out.println();
			return;
		}

		for (Book book : books) {
			if (book != null)
				book.display();
		}
	}

}

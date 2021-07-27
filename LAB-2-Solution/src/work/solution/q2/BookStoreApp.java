package work.solution.q2;

import java.util.Scanner;

public class BookStoreApp {

	public static void placeOrder(BookStore bookStore, Scanner sc) {
		System.out.println("Enter : ISBN Code & Number of Copy");
		System.out.println("Format : ISBN_NumberOfCopy");
		String str=sc.next();
		
		String isbn = str.split("_")[0];
		int numOfCopies = Integer.parseInt(str.split("_")[1]);
		
		bookStore.order(isbn, numOfCopies);
	}

	public static void sellOrder(BookStore bookStore, Scanner sc) {
		System.out.println("Enter :Book Title & Number of Copy");
		System.out.println("Format :BookTitle_NumberOfCopy");
		String str=sc.next();
		
		String bookTitle=str.split("_")[0];
		int numOfCopies =Integer.parseInt(str.split("_")[1]);

		bookStore.sell(bookTitle, numOfCopies);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		BookStore bookStore1 = new BookStore();

		System.out.println("***Welcome***");

		int input;
		do {
			System.out.println("Enter “1”, to display the Books: Title – Author – ISBN - Quantity");
			System.out.println("Enter “2”, to order new books.");
			System.out.println("Enter “3”, to sell books");
			System.out.println("Enter “0”, to exit the system.");
			input = sc.nextInt();

			if (input == 1) {
				bookStore1.display();
			} else if (input == 2) {
				placeOrder(bookStore1, sc);
			} else if (input == 3) {
				sellOrder(bookStore1, sc);
			}else {
				System.out.println("Wrong Input !!! ,Re-Enter : ");
				continue;
			}

		} while (input != 0);
	}
}

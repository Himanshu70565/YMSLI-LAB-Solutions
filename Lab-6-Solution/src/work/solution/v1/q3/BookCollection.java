package work.solution.v1.q3;

import java.util.Arrays;

public class BookCollection{
	private String ownerName;
	private Book[] books;
	
	public BookCollection(String ownerName, Book[] books) {
		this.ownerName = ownerName;
		this.books = books;
	}

	@Override
	public String toString() {
		
		String str="BookCollection \n";
		for(Book book:books) {
			str+=book.toString();
		}
		return str;
	}

	public boolean hasBook(Book b) {
		String title=b.getTitle();
		String author=b.getAuthor();
		for(Book book:books) {
			if(book.getAuthor()==author&&book.getTitle()==title) {
				return true;
			}
		}
		return false;
	}
	
	public void sort() {
		Arrays.sort(books);
	}	
}

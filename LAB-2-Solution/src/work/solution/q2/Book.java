package work.solution.q2;

public class Book {
	private String bookTitle;
	private String author;
	private String isbn;
	private int numOfCopies;
	
	public String getBookTitle() {
		return bookTitle;
	}
	
	public int getNumberOfCopies() {
		return numOfCopies;
	}
	
	public void setNumberOfCopies(int numOfCopies) {
		this.numOfCopies=numOfCopies;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public Book(String bookTitle, String author, String isbn, int numOfCopies) {
		this.bookTitle = bookTitle;
		this.author = author;
		this.isbn = isbn;
		this.numOfCopies = numOfCopies;
	}
	
	public void display() {
		System.out.println("******Book Information********");
		System.out.println("Book title : "+bookTitle);
		System.out.println("Book author : "+author);
		System.out.println("Book ISBN : "+isbn);
		System.out.println("Book quantity ; "+numOfCopies);
	}
}

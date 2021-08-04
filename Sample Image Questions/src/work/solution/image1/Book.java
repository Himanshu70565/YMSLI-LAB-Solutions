package work.solution.image1;

public class Book {

	private int id;
	private String isbn;
	private String name;
	private int noOfCopies;
	private String author;

	public Book(int id, String isbn, String name, String author, int noOfCopies) {
		this.id = id;
		this.isbn = isbn;
		this.name = name;
		this.noOfCopies = noOfCopies;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", isbn=" + isbn + ", name=" + name + ", noOfCopies=" + noOfCopies + ", author="
				+ author + "]";
	}

}

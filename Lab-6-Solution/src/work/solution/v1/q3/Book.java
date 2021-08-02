package work.solution.v1.q3;

public class Book implements Comparable<Book>{

	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public int compareTo(Book o) {
		if(title.compareTo(o.title)==0) {
			return author.compareTo(o.author);
		}
		return title.compareTo(o.title);
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "] \n";
	}

}

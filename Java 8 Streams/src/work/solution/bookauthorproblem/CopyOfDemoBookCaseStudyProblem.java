package work.solution.bookauthorproblem;

import java.io.ObjectInputStream.GetField;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

public class CopyOfDemoBookCaseStudyProblem {

	public static void printList(List<Book> list) {
		list.stream().forEach(book -> System.out.println(book));
	}

	public static void main(String[] args) {

		List<Book> allBooks = loadAllBooks();

		// 1. Find books with more then 400 pages
		List<Book> booksWithMoreThan400Pages = allBooks.stream().filter(book -> book.getPages() > 400)
				.collect(Collectors.toList());

		// 2. Find all books that are java books and more then 400 pages
		List<Book> booksWithTitleJava = booksWithMoreThan400Pages.stream().filter(book -> book.getTitle() == "java")
				.collect(Collectors.toList());

		// 3. We need the top three longest books
		List<Book> topThreeLongestBookList = allBooks.stream().sorted(Comparator.comparing(Book::getPages).reversed())
				.limit(3).collect(Collectors.toList());

		// 4. We need from the fourth to the last longest books
		List<Book> skippingFirstThreeBookList = allBooks.stream().sorted(Comparator.comparing(Book::getPages)).skip(3)
				.collect(Collectors.toList());

		// 5. We need to get all the publishing years
		List<Integer> publishingYearList = allBooks.stream().map((book) -> book.getYear()).distinct()
				.collect(Collectors.toList());

		// 6. We need all the authors names who have written a book
		List<Author> authorList = allBooks.stream().flatMap(b -> b.getAuthors().stream()).distinct()
				.collect(Collectors.toList());

		// We need all the origin countries of the authors
		List<String> countryList = allBooks.stream().flatMap(b -> b.getAuthors().stream()).map(a -> a.getCountry())
				.distinct().collect(Collectors.toList());

		// We want the most recent published book.
		Optional<Book> max = allBooks.stream().max(Comparator.comparing(Book::getYear));

		// We want to know if all the books are written by more than one author
		boolean allMatch = allBooks.stream().allMatch(b -> b.getAuthors().size() > 1);

		// We want one of the books written by more than one author. (findAny)
		Optional<Book> bookWrittenByMoreThanOneAuthor = allBooks.stream().filter(b -> b.getAuthors().size() > 1)
				.findAny();

		// We want the total number of pages published.
		Integer totalPagesInBook = allBooks.stream().map(b -> b.getPages()).reduce(0, (a, b) -> a + b);

		// We want to know how many pages the longest book has.
		// allBooks.stream().max(Comparator.comparing(Book::getPages)).ifPresent(book->System.out.println(book.getPages()));
		Optional<Integer> pagesInLongestBook = allBooks.stream().max(Comparator.comparing(Book::getPages))
				.map(b -> b.getPages());

		// We want the average number of pages of the books
		System.out.println(totalPagesInBook * 1.0 / allBooks.size());
		Double average = allBooks.stream().collect(Collectors.averagingDouble(Book::getPages));

		// We want all the titles of the books
		List<String> bookTitlesList = allBooks.stream().map(b -> b.getTitle()).collect(Collectors.toList());

		// We want the book with the higher number of authors?
		Optional<Book> max2 = allBooks.stream().max((Book o1, Book o2) -> {
			return Integer.compare(o1.getAuthors().size(), o2.getAuthors().size());
		});

		// We want a Map of book per year.
		Map<Integer, List<Book>> mapGroupedByBookYear = allBooks.stream().collect(Collectors.groupingBy(Book::getYear));

		// We want to count how many books are published per year.
		Map<Integer, Long> mapWithKeyAsYearAndValueAsCount = allBooks.stream()
				.collect(Collectors.groupingBy(Book::getYear, Collectors.counting()));

	}

	private static List<Book> loadAllBooks() {
		List<Book> books = new ArrayList<Book>();
		List<Author> authors1 = Arrays.asList(new Author("raj", "gupta", "in"), new Author("ekta", "gupta", "in"));

		List<Author> authors2 = Arrays.asList(new Author("raj", "gupta", "in"));

		List<Author> authors3 = Arrays.asList(new Author("gunika", "gupta", "us"), new Author("keshav", "gupta", "us"),
				new Author("raj", "gupta", "in"));

		books.add(new Book("java", authors1, 405, Subject.JAVA, 2000, "1213"));
		books.add(new Book("python", authors2, 479, Subject.JAVA, 2007, "1218"));
		books.add(new Book("Mgt", authors3, 600, Subject.DOT_NET, 2021, "1293"));
		books.add(new Book("Ruby", authors3, 6099, Subject.DOT_NET, 2000, "1293"));

		return books;
	}

}

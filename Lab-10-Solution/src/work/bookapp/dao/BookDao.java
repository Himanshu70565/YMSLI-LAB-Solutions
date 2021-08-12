package work.bookapp.dao;

import java.util.*;

import work.bookapp.entities.Book;
import work.bookapp.exceptions.DaoException;

public interface BookDao {
	public List<Book> getAllBooks();

	public Book addBook(Book book);

	public void deleteBook(int id);

	public void updateBook(int id, Book book);

	public Book getBookById(int id);
}

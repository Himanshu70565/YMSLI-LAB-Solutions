package work.bookapp.controller;

import java.util.List;

import work.bookapp.dao.BookDao;
import work.bookapp.dao.BookDaoImpl;
import work.bookapp.entities.*;
import work.bookapp.exceptions.DaoException;
import work.bookapp.service.*;

public class Main {
	public static void main(String[] args) {
		Book b1 = new Book("A12", "java", "rahul", 500);
		Book b2 = new Book("A13", "python", "ravi", 810);
		Book b3 = new Book("A14", "c++", "shyam", 650);
		Book b4 = new Book("A15", "scala", "pawan", 760);
		Book b5 = new Book("A16", "ruby", "ayush", 420);

		BookService bookService = new BookServiceImpl();
		bookService.addBook(b1);
		bookService.addBook(b2);
		bookService.addBook(b3);
		bookService.addBook(b4);
		bookService.addBook(b5);

		List<Book> allBooks = bookService.getAllBooks();
		for (Book book : allBooks) {
			System.out.println(book);
		}
		
		bookService.getBookById(0);

		/*
		 * Checking Daolayer Implementation 
		 * BookDao bookDao = new BookDaoImpl();
		 * 
		 * try { //Adding books bookDao.addBook(b1); bookDao.addBook(b2);
		 * bookDao.addBook(b3); bookDao.addBook(b4); bookDao.addBook(b5);
		 * 
		 * //GettingBookById Book book = bookDao.getBookById(7);
		 * System.out.println(book);
		 * 
		 * } catch (DaoException e1) { System.out.println(e1.getLocalizedMessage());
		 * e1.printStackTrace(); }
		 * 
		 * //Deleting book try { bookDao.deleteBook(7); } catch (DaoException e1) {
		 * System.out.println(e1.getLocalizedMessage()); e1.printStackTrace(); }
		 * 
		 * 
		 * //Printing all books List<Book> books; try { books = bookDao.getAllBooks();
		 * books.stream().forEach(book -> System.out.println(book)); } catch
		 * (DaoException e1) { e1.printStackTrace(); }
		 * 
		 * 
		 * try { bookDao.updateBook(8, b1); } catch (DaoException e) {
		 * e.printStackTrace(); }
		 *
		 */
	}
}

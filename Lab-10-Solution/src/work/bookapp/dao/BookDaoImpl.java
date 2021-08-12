package work.bookapp.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.mysql.jdbc.PreparedStatement;

import work.bookapp.dao.factory.ConnectionFactory;
import work.bookapp.entities.Book;
import work.bookapp.exceptions.DaoException;

public class BookDaoImpl implements BookDao {

	private Connection connection;

	public BookDaoImpl() {
		connection = ConnectionFactory.getConnection();
	}

	@Override
	public List<Book> getAllBooks() {
		List<Book> booksList = new ArrayList<>();

		String SELECT_FROM_BOOKS = "select * from books";
		try (PreparedStatement ps = (PreparedStatement) connection.prepareStatement(SELECT_FROM_BOOKS);) {
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				booksList.add(new Book(rs.getInt("id"), rs.getString("isbn"), rs.getString("title"),
						rs.getString("author"), rs.getDouble("price")));
			}

		} catch (SQLException e) {
			throw new DaoException(e);
		}

		return booksList;
	}

	@Override
	public Book addBook(Book book) {
		try {
			String INSERT_NEW_BOOK = "insert into books(isbn,title,author,price) values(?,?,?,?)";
			PreparedStatement ps = (PreparedStatement) connection.prepareStatement(INSERT_NEW_BOOK);
			ps.setString(1, book.getIsbn());
			ps.setString(2, book.getTitle());
			ps.setString(3, book.getAuthor());
			ps.setDouble(4, book.getPrice());

			int noOfRowsEffected = ps.executeUpdate();

			if (noOfRowsEffected > 0) {
				System.out.println("----book inserted successfully----");
			}

		} catch (SQLException e) {
			throw new DaoException(e);
		}
		return null;
	}

	@Override
	public void deleteBook(int id) {
		try {
			String DELETE_BOOK_WITH_ID = "delete from books where books.id=?";
			PreparedStatement ps = (PreparedStatement) connection.prepareStatement(DELETE_BOOK_WITH_ID);
			ps.setInt(1, id);

			int noOfRowsEffected = ps.executeUpdate();

			if (noOfRowsEffected > 0) {
				System.out.println("----book deleted successfully----");
			} else {
				throw new DaoException("!!!No book found to delete with id :" + id);
			}

		} catch (SQLException e) {
			throw new DaoException(e);
		}
	}

	@Override
	public void updateBook(int id, Book book) throws DaoException {
		try {
			String UPDATE_BOOK_WITH_ID = "update books set isbn=? ,title=? ,author=? ,price=? where id=?";
			PreparedStatement ps = (PreparedStatement) connection.prepareStatement(UPDATE_BOOK_WITH_ID);
			ps.setString(1, book.getIsbn());
			ps.setString(2, book.getTitle());
			ps.setString(3, book.getAuthor());
			ps.setDouble(4, book.getPrice());
			ps.setInt(5, id);

			int noOfRowsEffected = ps.executeUpdate();

			if (noOfRowsEffected > 0) {
				System.out.println("----book updated successfully----");
			} else {
				throw new DaoException("Update failed");
			}

		} catch (SQLException e) {
			throw new DaoException(e);
		}
	}

	@Override
	public Book getBookById(int id) throws DaoException {
		Book book = null;
		try {
			String SELECT_BOOK_WITH_ID = "select * from books where id=?";
			PreparedStatement ps = (PreparedStatement) connection.prepareStatement(SELECT_BOOK_WITH_ID);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				book = new Book(rs.getInt("id"), rs.getString("isbn"), rs.getString("title"), rs.getString("author"),
						rs.getDouble("price"));
			} else {
				throw new DaoException("!!!No book foud with id :" + id);
			}
		} catch (SQLException e) {
			throw new DaoException(e);
		}
		return book;
	}

}

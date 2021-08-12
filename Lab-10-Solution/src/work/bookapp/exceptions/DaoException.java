package work.bookapp.exceptions;

public class DaoException extends RuntimeException{
	
	public DaoException(Throwable cause) {
		super(cause);
	}

	private static final long serialVersionUID = 1L;

	public DaoException(String message) {
		super(message);
	}
	
}

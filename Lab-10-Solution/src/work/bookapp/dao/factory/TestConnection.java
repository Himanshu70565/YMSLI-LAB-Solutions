package work.bookapp.dao.factory;

import java.sql.Connection;

public class TestConnection {
	public static void main(String[] args) {
		Connection connection=ConnectionFactory.getConnection();
		System.out.println(connection); //connection created
	}
}

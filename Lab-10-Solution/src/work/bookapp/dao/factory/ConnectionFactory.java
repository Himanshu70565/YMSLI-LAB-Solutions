package work.bookapp.dao.factory;

import java.io.*;
import java.sql.*;
import java.util.Properties;

public class ConnectionFactory {

	private static Connection connection;

	private ConnectionFactory() {
	};

	public static Connection getConnection() {

		String propertiesFilePath = "C:\\Users\\ve00ym259\\Desktop\\YMSLI Lab Solutions\\Lab-10-Solution\\src\\db.properties";
		Reader reader = null;

		try {
			reader = new BufferedReader(new FileReader(new File(propertiesFilePath)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Properties properties = new Properties();
		try {
			properties.load(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}

		String driver = properties.getProperty("jdbc.driverName");
		String url = properties.getProperty("jdbc.url");
		String username = properties.getProperty("jdbc.username");
		String password = properties.getProperty("jdbc.password");

		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			connection = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connection;
	}

}

package com.app.dao.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresqlConnection {

private static Connection connection;
	
	private PostgresqlConnection() {
		
	}
	public static Connection getConnection() throws ClassNotFoundException,SQLException {
		Class.forName("org.postgresql.Driver");
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String username = "postgres";
		String password = "China@28";
		connection = DriverManager.getConnection(url, username,password);
		return connection;
	}
}

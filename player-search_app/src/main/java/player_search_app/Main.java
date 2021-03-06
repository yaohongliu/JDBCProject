package player_search_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world with maven");

		Connection connection = null;
		
		try {
			//step 1 - load driver
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver loaded Successfully");
			//step 2 - open connection(url, username, password)
			String url = "jdbc:postgresql://localhost:5432/postgres";
			String username = "postgres";
			String password = "China@28";
			connection = DriverManager.getConnection(url, username,password);
			System.out.println("Connection success");
			//step 3 - create statement
			Statement statement = connection.createStatement();
			String sql = "select id, name, gender, age, dob, contact, teamname from \"MySchema\".player order by id desc";
			//step 4 - execute
			ResultSet resultSet = statement.executeQuery(sql);
			System.out.println("Query executed");
			//Sep 5 - process result
			while(resultSet.next()) {
				System.out.println("Id: "+resultSet.getInt("id"));
				System.out.println("Name: "+resultSet.getString("name"));
				System.out.println("TeamName: "+resultSet.getInt("teamname"));
				System.out.println("Gender: "+resultSet.getString("gender"));
				System.out.println("Age: "+resultSet.getInt("age"));
				System.out.println("Contact: "+resultSet.getLong("contact"));
				System.out.println("DOB: "+resultSet.getDate("dob"));
			}
			System.out.println("Results processed");
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}catch(SQLException e) {
			System.out.println(e);
		}finally {
			try {
				//step 6 - close connection
				connection.close();
				System.out.println("Connection closed");
			}catch(SQLException e) {
				System.out.println(e);
			}
		}
		
	}

}


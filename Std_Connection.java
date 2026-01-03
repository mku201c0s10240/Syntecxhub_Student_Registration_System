package student_registeration_system;

import java.sql.*;

public class Std_Connection {

	public static final String url="jdbc:mysql://localhost:3306/syntecxhub";
	public static final String user="root";
	public static final String password="Nagaraj@2003";
	
	public static Connection getConnection() {
		try {
			return DriverManager.getConnection(url, user, password);
			
		}catch(Exception e) {
			System.out.println("Database connection is failed");
			return null;
		}
		
		
	}
}

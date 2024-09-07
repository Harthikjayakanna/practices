package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateDatabase {
	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=admin");
			st=con.createStatement();
			st.execute("create database practice;");
			System.out.println("database created");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}

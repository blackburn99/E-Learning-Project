package com.amdocs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Create_Connection {
	static String dbUrl = "jdbc:mysql://localhost:3306/main_project";
	static String username = "root";
	static String password = "root";
	private static Connection conn = null;
	private Create_Connection() {}
	public static Connection getConnection() throws SQLException {
		if(conn == null) {
			try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dbUrl,
			username, password);
			System.out.println("Connection Successfull!");
			return conn;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
}

package com.login.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJdbc {
	Connection con =null;
	//creating singleton object
	private static ConnectionJdbc test = new ConnectionJdbc();
	public ConnectionJdbc() {
		try {
			// Load the jdbc driver class to register jdbc driverManager with Driver Manager Service
			Class.forName("com.mysql.cj.jdbc.Driver");
			//establish the connection
			con = DriverManager.getConnection("jdbc:mysql:///krishna","root","keerthi@19");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	// creating Connection method and retun 
	public static Connection getInstanceOf() {
		return test.con;
	}
	public static void main(String[] args) {
		System.out.println(getInstanceOf());
	}
}//class

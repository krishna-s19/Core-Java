package com.login.serviceimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LoginTest {
	
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs= null;
		Scanner input =new Scanner(System.in);
		System.out.println("Enter User Name;");
		String uname =input.next();
		System.out.println("Enter Password");
		String password = input.next();
		String sql = "select * from login_table where username =? and password=?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql:///krishna","root","keerthi@19");
			ps = con.prepareStatement(sql);
			ps.setString(1, uname);
			ps.setString(2, password);
			rs= ps.executeQuery();
			if(rs.next()){
				System.out.println("Welcome to  "+uname+"  Login successfully");
			}else {
				System.out.println("Not found Record");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
					} 
			finally {
				// TODO: handle finally clause
				try {
					if(con!=null)
						con.close();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
		}
	}//main
}//class
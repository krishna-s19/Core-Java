package com.excel.read;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class InsertIntoExcel {
	
	public static void main(String[] args) {
	String query = "insert into sheet1 values(?,?,?,?)";
	int result=0;
	try {
		Class.forName("com.hxtt.sql.excel.ExcelDriver");
		try(Connection con = DriverManager.getConnection("jdbc:Excel:///D:/spring/College.xlsx")){
		if(con!=null)
		try( PreparedStatement ps=con.prepareStatement(query)) {
			if(ps!=null) {
			ps.setInt(1, 110);
			ps.setString(2, "Narendhar");
			ps.setString(3, "KKY");
			ps.setDouble(4, 78.89);
			result = ps.executeUpdate();
		}	
		if(result==0) 
			System.out.println("No Record Found");
		else
			System.out.println(result+"   Record is Inserted");
			}//try3
		}//try2
	}//try1
	catch (Exception e) {
		e.printStackTrace();
			}//catch
	}//main
}//class


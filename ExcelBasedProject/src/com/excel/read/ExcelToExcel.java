package com.excel.read;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExcelToExcel {
	
	public static void main(String[] args) {
		String query="select *  from Sheet1";
		
		try (Connection con = DriverManager.getConnection("jdbc:Excel:///D:/spring/COLLEGE.xlsx")){
			if(con!=null) 
		try( PreparedStatement ps=con.prepareStatement(query)){
			if(ps!=null)
		try(ResultSet rs = ps.executeQuery(query)){
			System.out.println(" From top to Bottom");
		if(rs!=null) {
			while(rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t\t"+rs.getString(3)+"\t"+rs.getFloat(4));
						}//while
					}//if	
				}//try3
			}//try2
		}//try1
		catch (SQLException e) {
			e.printStackTrace();
		}//catch
	}//main
}//class

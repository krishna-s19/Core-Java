package com.excel.jdbc;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Iterator;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

import com.excel.bean.ZipBean;

public class ReadExcel {
	
	public Connection getConnection(String sqlPathName) {
		
		Connection con = null;
		try {
			Properties pr = new Properties();
			FileInputStream file = new FileInputStream(sqlPathName);
			pr.load(file);
			Class.forName(pr.getProperty("Driver"));
			con = DriverManager.getConnection(pr.getProperty("url"),pr.getProperty("username"),
					pr.getProperty("password"));
		}catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	public static void storeInDb()throws Exception{
		XSSFWorkbook workbook = null;
		FileInputStream file = null;
		Connection sqlConnection = null;
		PreparedStatement pStatement = null;
		ZipBean zipbean = null;
		
		int i =0;
		try {
			ReadExcel re = new ReadExcel();
			sqlConnection = re.getConnection("com/excel/jdbc/sql.properties");
			pStatement =sqlConnection.prepareStatement("insert into us_zip values(?,?,?,?)");
			file = new FileInputStream(new File("‪D:/spring/Zip_Code.xlsx"));
			workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			Iterator<Row> row = sheet.iterator();
			row.next();
			
			while(row.hasNext()) {
				Row row1 =row.next(); 
				
				
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

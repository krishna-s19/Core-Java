package com.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.login.bean.EmployeeBean;

public class DaoImplementation implements DAO {
	private static String insert_sql ="insert into employee_info values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	private static String login_sql ="select * from employee_info where empId=? and employeeName=?";
	
	Connection con =null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	@Override
	public int insertEmployeeData(EmployeeBean employee) {
		int count=0;
		if(con!=null)
			try {
				ps = con.prepareStatement(insert_sql);
				ps.setInt(1, employee.getEmployeeId());
				ps.setString(2, employee.getEmployeeName());
				ps.setString(3, employee.getEmployeedesignation());
				ps.setString(4, employee.getGender());
				ps.setString(5, employee.getSdob());
				ps.setLong(6, employee.getMobileNo());
				ps.setString(7,employee.getEmailId());
				ps.setString(8,employee.getPassword());
				ps.setLong(9,employee.getAadharno());
				ps.setString(10,employee.getPanNumber());
				ps.setString(11,employee.getAddress());
				ps.setString(12,employee.getSscEducation());
				ps.setInt(13,employee.getPassSsc());
				ps.setString(14, employee.getInterEducation());
				ps.setInt(15, employee.getPassInter());
				ps.setString(16,employee.getGraduation());
				ps.setString(17,employee.getBranch());
				ps.setString(18,employee.getUniversity());
				ps.setInt(19, employee.getPassGraduation());

				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		return count;
	}

	@Override
	public int employeeLogin(String name, String password) {
			int count=0;
			try {
				if(con!=null)
				ps = con.prepareStatement(login_sql);
				if(ps!=null) {
					ps.setString(1, name);
					ps.setString(2, password);
					if(rs!=null) {
						rs = ps.executeQuery();
						if(rs!=null) {
							rs.next();
							count++;
							System.out.println(count);
						}
					}
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		return count;
	}

}

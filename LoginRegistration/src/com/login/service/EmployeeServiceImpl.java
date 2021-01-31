package com.login.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.login.bean.EmployeeBean;
import com.login.connection.ConnectionJdbc;

public class EmployeeServiceImpl implements EmployeeService{
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs= null;
	public EmployeeServiceImpl() {
		con = ConnectionJdbc.getInstanceOf();
	}
	@Override
	public int insertEmployeeData(EmployeeBean employee) {
		int count=0;
		String sql ="insert into employee_info values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";
			try {
				if(con!=null)
				ps = con.prepareStatement(sql);
				if(ps!=null) {
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
				
					count = ps.executeUpdate();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return count;
	}
	@Override
	public int employeeLogin(String name, String password) {
	
		String sql = "select * from employee_info where empName=? and password=?";
		int count=0;
			try {
				if(con!=null)
				ps=con.prepareStatement(sql);
				if(ps!=null) {
				ps.setString(1, name);
				ps.setString(2, password);
				if(rs!=null) 
					rs =ps.executeQuery();
				if(rs!=null) {
					rs.next();
					count++;
					System.out.println(count+"\t\t"+name+"\t\t"+password);
					}	
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			return count;
	}
	@Override
	public int employeesLogin(EmployeeBean employee) {
		String sql = "select * from employee_info where empName=? and password=?";
		int count=0;
			try {
				if(con!=null)
				ps=con.prepareStatement(sql);
				if(ps!=null) {
				ps.setString(1, employee.getEmployeeName());
				ps.setString(2, employee.getPassword());
				if(rs!=null) 
					rs =ps.executeQuery();
				if(rs!=null) {
					rs.next();
					count++;
					System.out.println(count);
					}	
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			return count;
		
		
		
	}
}

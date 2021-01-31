package com.employee.serviceimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.employee.bean.EmployeeBean;
import com.employee.service.EmployeeService;
import com.jdbc.connection.JDBCConnection;

public class EmployeeServiceImpl implements EmployeeService{
	Connection con = null;
	PreparedStatement ps =null;
	ResultSet rs = null;
	public EmployeeServiceImpl() {
			con = JDBCConnection.getInstanceOf();
	}
	@Override
	public int insertEmployeeData(EmployeeBean emp) {
		String sql ="insert into employee_table values(?,?,?,?,?)";
		int count =0;
		try {
			ps =con.prepareStatement(sql);
			ps.setInt(1, emp.getEmployeeId());
			ps.setString(2, emp.getEmployeName());
			ps.setDouble(3, emp.getSalary());
			ps.setLong(4, emp.getMobileno());
			ps.setString(5, emp.getEmpAddress());
			count =ps.executeUpdate();
			
			} catch (Exception e) {
			// TODO: handle exception
		}
		return count;
	}

	@Override
	public int updateEmployeeData(EmployeeBean emp) {
		int count =0;
		String sql="update employee_table set employeeName=?,empSalary=?,emplMobile=?,empAddress=? where employeeId=?";
		try {
			ps =con.prepareStatement(sql);
			ps.setString(1, emp.getEmployeName());
			ps.setDouble(2, emp.getSalary());
			ps.setLong(3, emp.getMobileno());
			ps.setString(4, emp.getEmpAddress());
			ps.setInt(5, emp.getEmployeeId());
			count=ps.executeUpdate();
				} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public int deleteEmployeeData(int empid) {
		int count=0;
			String sql ="delete from employee_table where employeeId=?";
			try {
				ps= con.prepareStatement(sql);
				ps.setInt(1, empid);
				count = ps.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
		return count;
	}

	@Override
	public List<EmployeeBean> getAllEmployeeData() {
		List<EmployeeBean> listofemp =new ArrayList<>();
		String sql ="select * from employee_table";
		try {
			EmployeeBean emp = null;
			ps = con.prepareStatement(sql);
			rs =ps.executeQuery();
			while(rs.next()) {
			emp =new EmployeeBean();
			emp.setEmployeeId(rs.getInt(1));
			emp.setEmployeName(rs.getString(2));
			emp.setSalary(rs.getDouble(3));
			emp.setMobileno(rs.getLong(4));
			emp.setEmpAddress(rs.getString(5));
			listofemp.add(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listofemp;
	}
	@Override
	public List<EmployeeBean> SearchByEmployeeId(int empid) {
		List<EmployeeBean> listofemp = new ArrayList();
		String sql="Select * from employee_table where employeeId=?";
		EmployeeBean emp=null;
		try {
			ps =con.prepareStatement(sql);
			ps.setInt(1, empid);
			rs =ps.executeQuery();
			while(rs.next()) {
				emp= new EmployeeBean();
				emp.setEmployeeId(rs.getInt(1));
				emp.setEmployeName(rs.getString(2));
				emp.setSalary(rs.getDouble(3));
				emp.setMobileno(rs.getLong(4));
				emp.setEmpAddress(rs.getString(5));
				listofemp.add(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listofemp;
	}

	@Override
	public List<EmployeeBean> SeachByEmployeeSalary(double salary) {
		List<EmployeeBean> listofEmp = new ArrayList<>();
		String sql = "select * from employee_table where empSalary=?";
		
		try {
			ps=con.prepareStatement(sql);
			ps.setDouble(1, salary);
			rs = ps.executeQuery();
			EmployeeBean emp = null;
			while(rs.next()) {
				emp = new EmployeeBean();
				emp.setEmployeeId(rs.getInt(1));
				emp.setEmployeName(rs.getString(2));
				emp.setSalary(rs.getDouble(3));
				emp.setMobileno(rs.getLong(4));
				emp.setEmpAddress(rs.getString(5));
				listofEmp.add(emp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listofEmp;
	}

	@Override
	public List<EmployeeBean> getforLoanDetails(int empid) {
		// TODO Auto-generated method stub
		return null;
	}
}//class

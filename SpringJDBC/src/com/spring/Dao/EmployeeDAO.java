package com.spring.Dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.Bean.EmployeeBean;

public class EmployeeDAO {
	
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int saveEmployee(EmployeeBean emp) {
	
		String query = "insert into employee_spring values('"+emp.getEmployeeId()+"','"+emp.getEmployeeName()+"','"+emp.getMobileNumber()+"', '"
		+emp.getEmployeeSalary()+"')";  
		return jdbcTemplate.update(query);
	}
	public int updateEmployee(EmployeeBean emp) {
		
		String query= "update employee_spring set employeeName='"+emp.getEmployeeName()+" ', employeeSalary='"+
		emp.getEmployeeSalary()+" ',mobileNumber='"+emp.getMobileNumber()+" ' ";
		
		return jdbcTemplate.update(query);
	}
	
	public int searchEmployee(EmployeeBean emp) {
		String query = "select * from employee_spring where employeeid=  '"+emp.getEmployeeId()+"' ";
		return jdbcTemplate.update(query);
	}
	public int deleteEmployee(EmployeeBean emp ) {
		
		String query ="delete employee-spring where employeeId='"+emp.getEmployeeId()+"' ";
		return jdbcTemplate.update(query);
	}
}

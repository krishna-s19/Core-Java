package com.test.DAO;

import org.springframework.jdbc.core.JdbcTemplate;

import com.test.brean.EmployeeBean;

public class EmployeeDAO {
	private JdbcTemplate jdbc;
	
	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}
	
	public int insetEmployeeData(EmployeeBean emp) {
		String query="insert into employee_spring values( ' " +emp.getEmployeeId()+" ',' "+emp.getEmployeename()
		+" ',' "+emp.getEmployeeSalary()+" ',' "+emp.getMobileno()+" ')";
		return jdbc.update(query);
	}
//	public int searchEmpoyeeData(EmployeeBean emp) {
//		String query ="Select * from employee_spring where employeeId='"+emp.getEmployeeId()+" ' ";
//		return 0; 
//	} 
	
	public int updateEmployeeData(EmployeeBean emp) {
		String query="update employee_spring  set employeeName='"+emp.getEmployeename()+" ',employeeSalary=' "+
	emp.getEmployeeSalary()+" ',mobileNumber=' "+emp.getMobileno()
	+" 'where employeeId= '"+emp.getEmployeeId()+ " ' ";
	return jdbc.update(query);
	}
	
	public int deleteEmployeeData(EmployeeBean emp) {
		String query = "Delete from employee_spring  where  employeeId='"+emp.getEmployeeId()+"' ";
	return jdbc.update(query);
	}
	
	public int deleteAllEmployeeData() {
		//String query = "delete * from employee_spring";
		String query="delete * from employee_spring ";
		return jdbc.update(query);
	}
	
}

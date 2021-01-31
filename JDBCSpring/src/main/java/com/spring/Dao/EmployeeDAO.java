package com.spring.Dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.bean.Employee;

public class EmployeeDAO {
	private JdbcTemplate jdbc;

	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}
	public int saveEmployee(Employee emp) {
		String query="inset into employee_spring(' "+emp.getEmployeeId()+"','"+emp.getEmployeeName()
		+"','"+emp.getEmployeeSalary()+"','"+emp.getMobileNumber()+"')";
		return jdbc.update(query);
	}
	public int updateEmployee(Employee emp ) {
		
		String query = "update employee_spring set employeeName='"+emp.getEmployeeName()+
				 "',employeeSalary='" +emp.getEmployeeSalary()+ "',mobilenumber='" +emp.getMobileNumber()+ " ' where employeeId=' "+emp.getEmployeeId()+"'  '";
		return jdbc.update(query);
	}
	public int searchEmployee(Employee emp) {
		String query = "select * from employee_spting where employeeId=' "+emp.getEmployeeId()+" ' " ;
		return jdbc.query(query);
	}
	public int deleteEmployee(Employee emp) {
		String query = "delete employee_spring where employeeId=' "+emp.getEmployeeId()+"' ";
		return jdbc.update(query);
	}
}

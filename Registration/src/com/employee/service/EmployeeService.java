package com.employee.service;

import java.util.List;

import com.employee.bean.EmployeeBean;

public interface EmployeeService {
	public int insertEmployeeData(EmployeeBean emp);
	public int updateEmployeeData(EmployeeBean emp);
	public int deleteEmployeeData(int empid);
	
	public List<EmployeeBean> getAllEmployeeData();
	public List<EmployeeBean> SearchByEmployeeId(int empid);
	public List<EmployeeBean>SeachByEmployeeSalary(double salary);
	
	public List<EmployeeBean> getforLoanDetails(int empid);

}

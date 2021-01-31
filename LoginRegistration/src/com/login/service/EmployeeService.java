package com.login.service;

import com.login.bean.EmployeeBean;

public interface EmployeeService {
	
	public int insertEmployeeData(EmployeeBean employee );
	public int employeeLogin(String name, String password);
	public int employeesLogin(EmployeeBean employee);
	

}

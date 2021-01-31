package com.login.dao;

import com.login.bean.EmployeeBean;

public interface DAO {
	public int insertEmployeeData(EmployeeBean employee);
	public int employeeLogin(String name,String password);
}

package com.login.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.login.bean.EmployeeBean;
import com.login.service.EmployeeService;
import com.login.service.EmployeeServiceImpl;

public class EmployeeTest {
	@Test
public void insertData() {
		EmployeeBean employee = new EmployeeBean();
		employee.setEmployeeId(100);
		employee.setEmployeeName("Krishna");
		employee.setEmployeedesignation("Manager");
		employee.setSdob("02-11-2001");
		employee.setGender("Male");
		employee.setMobileNo(798159876);
		employee.setEmailId("vamankrishna123@gmail.com");
		employee.setPassword("devanshika");
		employee.setAadharno(256369852);
		employee.setPanNumber("BOXPN1236");
		employee.setAddress("HYD");
		employee.setSscEducation("Shastra School");
		employee.setPassSsc(2014);
		employee.setInterEducation("Narayana");
		employee.setPassInter(2016);
		employee.setGraduation("B-TECH");
		employee.setBranch("CSE");
		employee.setUniversity("JNTU");
		employee.setPassGraduation(2020);
		EmployeeService service = new EmployeeServiceImpl();
		int count =0;
		count = service.insertEmployeeData(employee);
		assertEquals(1, count);
	}
	@Test
	public void testLogin() {
		String str = "Raji";
		String str2 = "12365478";
		int count=0;
		EmployeeService service = new EmployeeServiceImpl();
		count = service.employeeLogin(str, str2);
		assertEquals(1, count);
	}
}

package com.junit.test;

import java.util.Iterator;
import java.util.List;

import com.employee.bean.EmployeeBean;
import com.employee.service.EmployeeService;
import com.employee.serviceimpl.EmployeeServiceImpl;


public class Test {
/*	@org.junit.jupiter.api.Test
	public void testInsert() {
		EmployeeBean emp =new EmployeeBean();
		EmployeeService service = new EmployeeServiceImpl();
		int count = 0;
		emp.setEmployeeId(123);
		emp.setEmployeName("Swathi");
		emp.setSalary(25000.00);
		emp.setMobileno(78956231);
		emp.setEmpAddress("HYD");
		count = service.insertEmployeeData(emp);
		assertEquals(1, count);
			}
	*/
	/* @org.junit.jupiter.api.Test
	public void testupdate() {
		EmployeeBean emp =new EmployeeBean();
		EmployeeService service = new EmployeeServiceImpl();
		int count = 0;
		emp.setEmployeName("SwathiVaman");
		emp.setSalary(30000.00);
		emp.setMobileno(12356478);
		emp.setEmpAddress("amg");
		emp.setEmployeeId(225);
		count = service.updateEmployeeData(emp);
		assertEquals(1, count);
	}
/*	@org.junit.jupiter.api.Test
	public void testDelet() {
		EmployeeBean emp =new EmployeeBean();
		EmployeeService service = new EmployeeServiceImpl();
		int count = 0;
		count = service.deleteEmployeeData(129);
		assertEquals(1, count);
	}*/
	/*@org.junit.jupiter.api.Test
	public void testDisplay() {
		EmployeeService service = new EmployeeServiceImpl();
		List<EmployeeBean> listof = service.getAllEmployeeData();
		Iterator<EmployeeBean> itr = listof.iterator();
		System.out.println("employeeId \t\t"+"employeeName\t\t\t"+"employeeSalary\t\t\t"+
				"employeemobileNo\t\t\t"+"employeeAddress");
		if(null!=listof && !listof.isEmpty()) {
			while(itr.hasNext()) {
			EmployeeBean emp =itr.next();
			if(emp!=null) {
				System.out.println(emp.getEmployeeId()+"\t\t\t\t"+emp.getEmployeName()+"\t\t\t\t\t"+emp.getSalary()
				+"\t\t\t\t\t"+emp.getMobileno()+"\t\t\t\t\t"+emp.getEmpAddress());
				}
			}
		}	
	}

	@org.junit.jupiter.api.Test
	public void testSearch() {
		EmployeeService service =new EmployeeServiceImpl();
		List<EmployeeBean> listOfEmp = service.SearchByEmployeeId(225);
		Iterator<EmployeeBean> its =listOfEmp.iterator();
		System.out.println("employeeId \t\t"+"employeeName\t\t\t"+"employeeSalary\t\t\t"+
				"employeemobileNo\t\t\t"+"employeeAddress");
		if(null!=listOfEmp && !listOfEmp.isEmpty()) {
			while(its.hasNext()) {
				EmployeeBean emp =its.next();
				if(emp!=null) {
					System.out.println(emp.getEmployeeId()+"\t\t\t"+emp.getEmployeName()+"\t\t\t\t"
							+emp.getSalary()+"\t\t\t\t"+emp.getMobileno()+"\t\t\t\t"+emp.getEmpAddress());
				}
			}
		}
	}*/
	@org.junit.jupiter.api.Test
	public void testsalarySearch() {
		EmployeeService service = new EmployeeServiceImpl();
		List<EmployeeBean> listOfEmp = service.SeachByEmployeeSalary(25000.00);
		Iterator<EmployeeBean> its =listOfEmp.iterator();
		System.out.println("employeeId \t\t"+"employeeName\t\t\t"+"employeeSalary\t\t\t"+
				"employeemobileNo\t\t\t"+"employeeAddress");
		if(null!=listOfEmp && !listOfEmp.isEmpty()) {
			while(its.hasNext()) {
				EmployeeBean emp =its.next();
				if(emp!=null) {
					System.out.println(emp.getEmployeeId()+"\t\t\t"+emp.getEmployeName()+"\t\t\t\t"
							+emp.getSalary()+"\t\t\t\t"+emp.getMobileno()+"\t\t\t\t"+emp.getEmpAddress());
				}
			}
		}
	}
}

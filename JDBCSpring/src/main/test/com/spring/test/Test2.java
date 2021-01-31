package com.spring.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.DAO.EmployeeDAO;
import com.test.brean.EmployeeBean;

public class Test2 {
	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	EmployeeDAO empBean = (EmployeeDAO)context.getBean("edo");
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter how many No of Employees Data Inserting ");
	int num =scanner.nextInt();
	for (int i = 1; i <=num; i++) {
		EmployeeBean emp =new EmployeeBean();
		System.out.println("Enter  "+i+" Record");
		System.out.println("\n Enter employee Id:");
		emp.setEmployeeId(scanner.nextInt());
		System.out.println("Enter EmployeeName:");
		emp.setEmployeename(scanner.next());
		System.out.println("Enter EmployeeSalary:");
		emp.setEmployeeSalary(scanner.nextDouble());
		System.out.println("Enter Mobile number");
		emp.setMobileno(scanner.nextLong());
		int status = empBean.insetEmployeeData(emp);
		if(status==0)
			System.out.println(status+" No  Recod is  Inserted");
		else
			System.out.println(status+"  Recods  Inserted  ");
	}
	
//	System.out.println("Enter employeeId for Searching");
//	EmployeeBean empD = new EmployeeBean();
//	empD.setEmployeeId(scanner.nextInt());;
//	int status =empBean.searchEmpoyeeData(empD);
//	EmployeeBean empD = new EmployeeBean();
//	System.out.println("Enter EmployeeName For Update:");
//	empD.setEmployeename(scanner.next());
//	System.out.println("Enter Salary For Update:  ");
//	empD.setEmployeeSalary(scanner.nextDouble());
//	System.out.println("Enter MobileNo for Updating:");
//	empD.setMobileno(scanner.nextLong());
//	System.out.println("Enter employeeId for Update");
//	empD.setEmployeeId(scanner.nextInt());
//	int status =empBean.updateEmployeeData(empD);
//	if(status==0)
//		System.out.println(status+"   No Record is Upddated");
//	else
//		System.out.println(status+"   Record is Updated");
	
//	EmployeeBean empd = new EmployeeBean();
//	System.out.println("Enter employeeId for Deleting:");
//	empd.setEmployeeId(scanner.nextInt());
//	int status =empBean.deleteEmployeeData(empd);
//	if (status==0) {
//		System.out.println(status+ "   Records are Deleted      ");
//	}
//	else {
//		System.out.println(status+ "  Record is Deleted   ");
//	}
//	
//	int status = empBean.deleteAllEmployeeData();
//	System.out.println(status+ "are Deleted");
//	
	}
}

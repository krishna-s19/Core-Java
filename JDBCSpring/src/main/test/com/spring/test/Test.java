package com.spring.test;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Dao.EmployeeDAO;
import com.spring.bean.Employee;

public class Test {
	public static void main(String[] args) {
		ApplicationContext cont = new ClassPathXmlApplicationContext("applicationContext.xml");
	EmployeeDAO emp =(EmployeeDAO)cont.getBean("edo");
	Scanner scann = new Scanner(System.in);
	System.out.println("Enter No of Employees to insert");
	int num= scann.nextInt();
	Employee empbean = new Employee();
	for (int i = 0; i <=num; i++) {
		System.out.println("Enter "+i+"  Record");
		System.out.println("Enter EmployeeId");
		empbean.setEmployeeId(scann.nextInt());
		System.out.println("Enter EmployeeName");
		empbean.setEmployeeName(scann.next());
		System.out.println("Enter EmployeeSalary");
		empbean.setEmployeeSalary(scann.nextDouble());
		System.out.println("Enter MobileNumber");
		empbean.setMobileNumber(scann.next());
		int status = emp.saveEmployee(empbean);
		System.out.println(status+"  Recored is added  ");
		}
	
	}
}

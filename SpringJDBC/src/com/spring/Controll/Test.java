package com.spring.Controll;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Bean.EmployeeBean;
import com.spring.Dao.EmployeeDAO;

public class Test {
	public static void main(String[] args) {
		ApplicationContext cont = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDAO dao = (EmployeeDAO)cont.getBean("edo");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of Employees to insert :");
		int num = scan.nextInt();
		for(int i=1;i<=num;i++) {
		System.out.println("Enter "+i+"Record");
		EmployeeBean empBean = new EmployeeBean();
		System.out.println("Enter EmployeeId :");
		empBean.setEmployeeId(scan.nextInt());
		System.out.println("Enter EmployeeName:");
		empBean.setEmployeeName(scan.next());
		System.out.println("Enter EmployeeSalary");
		empBean.setEmployeeSalary(scan.nextDouble());
		System.out.println("Enter MobileNumber:");
		empBean.setMobileNumber(scan.next());
		int status = dao.saveEmployee(empBean);
		System.out.println(status +" Record   Is   Inserted");
		}
	}
}

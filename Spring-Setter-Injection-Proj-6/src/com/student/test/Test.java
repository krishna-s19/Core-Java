package com.student.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.student.bean.StudentBean;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/student/confg/applicationContext.xml");
		StudentBean stud = (StudentBean)ac.getBean("stud");
		System.out.println(stud.toString());
	} 
}


//
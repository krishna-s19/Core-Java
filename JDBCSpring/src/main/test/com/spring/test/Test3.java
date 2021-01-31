package com.spring.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Test3 extends GenericServlet{


		
		public void service(ServletRequest req, ServletResponse res )throws ServletException,IOException{
		
			PrintWriter pw =res.getWriter();

			Date d = new Date();

			pw.println("<h1 style=color:red;text-align:center> Date and Time::"+d+"</h1>");
		
		pw.close(); 
		}

		

	}

	
	
}

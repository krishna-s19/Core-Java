package com.forms.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormsServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw = resp.getWriter();
		resp.setContentType("text/html");
		
		String name = req.getParameter("pname");
		int age=Integer.parseInt(req.getParameter("page"));
		String address = req.getParameter("paddress");
			
		if(age<18)
			pw.println("<h1 style='color:green;text-align:center'>Mr/Mrs/Miss \t"+name+"\t you are  not  Eligable for Vote");
		else 
			pw.println("<h1 style='color:green;text-align:center'>Mr/Mrs/Miss \t"+name+"\t you are   Eligable for Vote");
	
		
		pw.println("<a href='http://localhost:1918/Forms-Proj-1/form.html'><img src='images/house.png'></a>");
	}

}

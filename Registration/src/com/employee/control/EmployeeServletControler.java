 package com.employee.control;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.bean.EmployeeBean;
import com.employee.service.EmployeeService;
import com.employee.serviceimpl.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeServletControler
 */
@WebServlet("/EmployeeServletControler")
public class EmployeeServletControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServletControler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// bring the data from web page
		String employeeId= request.getParameter("employeeId");
		String employeename= request.getParameter("employeeName");
		String empsalary = request.getParameter("salary");
		String mobileno= request.getParameter("mobileno");
		String address = request.getParameter("empAddress");
	
		// send to bean class
		EmployeeBean emp = new EmployeeBean();
		try {
			int empid =Integer.parseInt(employeeId);
			emp.setEmployeeId(empid);
			emp.setEmployeName(employeename);
			double salary = Double.parseDouble(empsalary);
			emp.setSalary(salary);
			long empmobileno= Long.parseLong(mobileno);
			emp.setMobileno(empmobileno);
			emp.setEmpAddress(address);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Passing to service Impl 
		
		EmployeeService  service= new EmployeeServiceImpl();
		int result = service.insertEmployeeData(emp);
		RequestDispatcher forwardAction = request.getRequestDispatcher("Success.jsp");
		RequestDispatcher includeAction = request.getRequestDispatcher("Registrtion.jsp");
		if(result>0 ) {
			forwardAction.forward(request, response);
		}else {
			includeAction.include(request, response);
		}
		
	}

}

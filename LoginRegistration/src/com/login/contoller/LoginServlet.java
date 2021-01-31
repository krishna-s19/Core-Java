package com.login.contoller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.bean.EmployeeBean;
import com.login.service.EmployeeService;
import com.login.service.EmployeeServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		
		int count=0;
		String sname = request.getParameter("username");
		String spass = request.getParameter("password");
		EmployeeService service = new EmployeeServiceImpl();
		EmployeeBean employee = new EmployeeBean();
		try {
			employee.setEmployeeName(sname);
			employee.setPassword(spass);
		} catch (Exception e) {
				e.printStackTrace();
			}
					
		count=service.employeeLogin(sname, spass);
			RequestDispatcher forwardAction = request.getRequestDispatcher("Success.jsp");
			RequestDispatcher includeAction = request.getRequestDispatcher("Error.jsp");
			if(count>0){
				forwardAction.forward(request, response);
			}else {
				includeAction.include(request, response);
			}
	}
}

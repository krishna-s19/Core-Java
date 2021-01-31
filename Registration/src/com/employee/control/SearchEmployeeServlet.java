package com.employee.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.employee.bean.EmployeeBean;
import com.employee.service.EmployeeService;
import com.employee.serviceimpl.EmployeeServiceImpl;

/**
 * Servlet implementation class SearchEmployeeServlet
 */
@WebServlet("/SearchEmployeeServlet")
public class SearchEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchEmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str = request.getParameter("salary");
		double salary=0.0;
		try {
			salary = Double.parseDouble(str);
		} catch (Exception e) {
				e.printStackTrace();
			}
		EmployeeService service = new EmployeeServiceImpl(); 
		List<EmployeeBean>  listOfemp=  service.SeachByEmployeeSalary(salary);
		HttpSession session = request.getSession();
		session.setAttribute("SalarySearch",listOfemp);
		RequestDispatcher dispatcher = request.getRequestDispatcher("SearchAjaxRespone.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

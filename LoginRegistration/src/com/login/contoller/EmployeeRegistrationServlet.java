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
 * Servlet implementation class EmployeeRegistrationServlet
 */
@WebServlet("/EmployeeRegistrationServlet")
public class EmployeeRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeRegistrationServlet() {
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
		// retrive the data from web page
		
		String empid= request.getParameter("employeeId");
		String empName = request.getParameter("employeeName");
		String empDesig =request.getParameter("Designation");
		String gen = request.getParameter("gender");
		String dob = request.getParameter("date");
		String mobile=request.getParameter("mobileno");
		String mail = request.getParameter("email");
		String pass=request.getParameter("password");
		String aadhar =request.getParameter("aadharNo");
		String pan =request.getParameter("panNo");
		String addres =request.getParameter("address");
		String school =request.getParameter("schoolName");
		String spass = request.getParameter("tenthPassedOut");
		String inter =request.getParameter("intermediateCollegeName");
		String interPass = request.getParameter("interPassedOut");
		String graduate = request.getParameter("GraduationDetails");
		String gBranch = request.getParameter("branch");
		String gUniversity = request.getParameter("university");
		String gPassOut = request.getParameter("graduationPassedOut");
		
		// pass the data to Bean class
		EmployeeBean employee = new EmployeeBean();
		try {
		int employeeId= Integer.parseInt(empid);
		employee.setEmployeeId(employeeId);
		employee.setEmployeeName(empName);
		employee.setEmployeedesignation(empDesig);
		employee.setGender(gen);
		employee.setSdob(dob);
		long phone=Long.parseLong(mobile);
		employee.setMobileNo(phone);
		employee.setEmailId(mail);
		employee.setPassword(pass);
		long aadharno= Long.parseLong(aadhar);
		employee.setAadharno(aadharno);
		employee.setPanNumber(pan);
		employee.setAddress(addres);
		employee.setSscEducation(school);
		int passIht = Integer.parseInt(spass);
		employee.setPassSsc(passIht);
		employee.setInterEducation(inter);
		int passInt =Integer.parseInt(interPass);
		employee.setPassInter(passInt);
		employee.setGraduation(graduate);
		employee.setBranch(gBranch);
		employee.setUniversity(gUniversity);
		int passed = Integer.parseInt(gPassOut);
		employee.setPassGraduation(passed);

		}catch (Exception e) {
			e.printStackTrace();
		}
		
		// passing the data bean to Service class and calling methods
		EmployeeService service = new EmployeeServiceImpl();
		
		int count=0;
		count = service.insertEmployeeData(employee);
		// redirecting the page after completing the submeting
		RequestDispatcher forwardAction = request.getRequestDispatcher("Success.jsp");
		RequestDispatcher includeAction = request.getRequestDispatcher("Registration.jsp");
		if(count>0) {
			forwardAction.forward(request, response);
		}else {
			includeAction.include(request, response);
		}
		
		
		
	}

}

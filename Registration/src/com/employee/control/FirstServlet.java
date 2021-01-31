package com.employee.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("Get from call "+getClass());
		// reading the client side values
		
		String uname = request.getParameter("username");
		String pass = request.getParameter("password");
		out.print("      username         :"+uname);
		out.print("       password  :"+pass);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String usname = request.getParameter("username");
		String pass = request.getParameter("password");
		out.print("            username        :"+usname);
		out.print("             password          :"+pass);
		
		// creating session object to set the values and pass to another servlet
		HttpSession session = request.getSession();
		session.setAttribute("key","value");
		session.setAttribute("user_name", usname);
		session.setAttribute("password",pass);
		out.print("<html><body>");
		out.print("<form action='SecondServlet' method='post'>");
		out.print("<input type='submit' value='SecondServlet'>");
		out.print("</form></body></html>");
		
		
		
		
	}

}

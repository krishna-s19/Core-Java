package com.login.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.bean.LoginBean;
import com.login.service.LoginService;
import com.login.serviceimpl.LoginServiceImpl;

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
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//
		LoginService service = new LoginServiceImpl();
		LoginBean login = new LoginBean();
	try {
		login.setUsername(username);
		login.setPassword(password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		int count= service.validateLogin(login);
		RequestDispatcher forwardAction = request.getRequestDispatcher("Success.jsp");
		RequestDispatcher includeAction = request.getRequestDispatcher("Error.jsp");
		if(count>0) {
			forwardAction.forward(request,response);
		}else {
				includeAction.include(request,response);
				}
			}
		}
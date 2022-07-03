package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignIn
 */
@WebServlet("/SignIn")
public class SignIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		PrintWriter pw = response.getWriter();
		
		if (user.equals("admin")&& (pass.equals("admin"))) {
			pw.println("Login Succesful");
			RequestDispatcher rd1 =  request.getRequestDispatcher("menu.jsp");
			rd1.forward(request, response);
			}else {
			RequestDispatcher rd2 =  request.getRequestDispatcher("index.jsp");
			rd2.include(request, response);
			pw.println("incorrect username or password,try again.");

		}
	}

}

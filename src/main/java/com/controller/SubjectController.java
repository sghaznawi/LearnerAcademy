package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.Subject;
import com.services.SubjectServices;

/**
 * Servlet implementation class SubjectController
 */
@WebServlet("/SubjectController")
public class SubjectController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	SubjectServices ss = new SubjectServices();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SubjectController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {

		response.setContentType("text/html");
		HttpSession hs = request.getSession();
		List<Subject> listOfSubject = ss.getAllSubjects();
		System.out.println("Numbers of Subjects " + listOfSubject.size());
		hs.setAttribute("listOfSubject", listOfSubject);
		response.sendRedirect("showAllSubjects.jsp");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		int sid = Integer.parseInt(request.getParameter("subjectId"));
		String sub = request.getParameter("subject");
		String description = request.getParameter("description");

		Subject subject = new Subject();
		subject.setSubjectId(sid);
		subject.setSubject(sub);
		subject.setDescription(description);

		String result = ss.addSubject(subject);
		pw.print(result);
		RequestDispatcher rd1 = request.getRequestDispatcher("addSubject.jsp");
		rd1.include(request, response);

	}
}

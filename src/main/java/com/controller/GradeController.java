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

import com.bean.Grade;
import com.services.GradeServices;

@WebServlet("/GradeController")
public class GradeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	GradeServices gs = new GradeServices();

	public GradeController() {
		super();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {

		response.setContentType("text/html");
		HttpSession hs = request.getSession();
		List<Grade> listOfGrade = gs.getAllGrades();
		System.out.println("Numbers of Student Grades " + listOfGrade.size());
		hs.setAttribute("listOfGrades", listOfGrade);
		response.sendRedirect("showAllGrades.jsp");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		int studentId = Integer.parseInt(request.getParameter("studentId"));
		int classId = Integer.parseInt(request.getParameter("classId"));
		float finalGrade = Float.parseFloat(request.getParameter("finalGrade"));

		Grade grade = new Grade();
		grade.setStudentId(studentId);
		grade.setClassId(classId);
		grade.setFinalGrade(finalGrade);

		String result = gs.addGrade(grade);
		pw.print(result);
		RequestDispatcher rd1 = request.getRequestDispatcher("addGrade.jsp");
		rd1.include(request, response);

	}
}

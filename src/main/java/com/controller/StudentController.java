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

import com.bean.Student;
import com.services.StudentServices;

/**
 * Servlet implementation class StudentController
 */
@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	StudentServices ts = new StudentServices();


	public StudentController() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		HttpSession hs = request.getSession();
		List<Student> listOfStudent = ts.getAllStudents();
		System.out.println("Numbers of Students " + listOfStudent.size());
		hs.setAttribute("listOfStudent", listOfStudent);
		response.sendRedirect("showAllStudents.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();

		int studentId = Integer.parseInt(request.getParameter("studentId"));
		String studentName = request.getParameter("studentName");
		String email = request.getParameter("email");
		int age= Integer.parseInt(request.getParameter("age"));
		int grade = Integer.parseInt(request.getParameter("grade"));


		Student student = new Student();
		student.setStudentId(studentId);
		student.setStudentName(studentName);
		student.setEmail(email);
		student.setAge(age);
		student.setGrade(grade);
	

		String result = ts.addStudent(student);
		pw.print(result);
		RequestDispatcher rd1 = request.getRequestDispatcher("addStudent.jsp");
		rd1.include(request, response);
	}

}
